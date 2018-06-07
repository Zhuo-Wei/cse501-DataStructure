package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
	//startAmount The amount of money that you start with
		int startA = ap.nextInt("How much money you start with?");
	//winChance The probability that you win a gamble
		double winChance = ap.nextDouble("What is the probability that you win a gamble");
		double loseChance = 1- winChance;
    //winAmount If you reach this amount of money, then you won
		int winAmount = ap.nextInt("How much money you reach when you win?");
    //totalPlays The number of times you simulate the problem
		int totalPlays = ap.nextInt("how muny times you simulate the problem");
        int loseTimes=0;
        int round = 0;
	    int sa= startA;
        for (int s=1; s <= totalPlays; s=s+1 ) {
			round=0;
			startA=sa;
			while (startA > 0 && startA < winAmount) {
	    	  if (Math.random() <= winChance ) 
	    	  startA =startA + 1;
	    	  else 	 startA =startA - 1;
			  round= round +1;
			}
		
			if (startA>0)
			System.out.println( "Simulation " +s+": "+ round +" rounds     Win");
			else {System.out.println( "Simulation " +s+": "+ round +" rounds     Lose");
			    loseTimes=  loseTimes + 1 ;}
		}
		double ruin=1;
		double r1 =loseChance/winChance;
		double r2 = Math.pow(r1, sa);
		double r3 = Math.pow(r1, winAmount);
		if (loseChance== winChance)
			 ruin = 1-startA/winAmount;
		else ruin = (r2- r3)/(1-r3);
		double ruin2 = (double)loseTimes/totalPlays;
		System.out.println("losses: " + loseTimes +"    simulations: "+ totalPlays + "\n"
				+ "Actual Ruin Rate:" + ruin2 +"   Expected Ruin Rate: "+ ruin); 
		
		}

}
