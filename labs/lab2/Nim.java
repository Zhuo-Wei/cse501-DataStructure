package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int sticks =ap.nextInt(" How many sticks do we have?");
		int round = 0;
		
		//The human player should also be able to decide if he or she wants to play the first or second move.
		int decide =ap.nextInt("Do you want to play the first move? (Answer 1=yes or 2=no)");
		if (decide == 1 ) {
			System.out.println("Human starts\n");
			for (round=0; sticks>0;) {
				int humanS = ap.nextInt("How many sticks do you want to remove?"); 
				while (humanS > 2 || humanS <= 0) {  
					humanS = ap.nextInt("The number you entered is not allowed. Please enter again.");
				}
				int remainH = sticks;
				sticks = remainH - humanS;
			
				System.out.println("Round "+ round +", "+ remainH + " sticks at start, human took "+ humanS+", so " + sticks + " sticks remain");
				round++;
				int computerS =1;
	        	if ( Math.random()>0.5) 
	        		computerS=1;
	        	else computerS =2;
	        		int remainC = sticks;
				if (sticks>0) {
		        	sticks = sticks - computerS;
		        	
				//Round 0, 7 sticks at start, computer took 2, so 5 sticks remain
				    System.out.println("Round "+ round + ", "+ remainC + " sticks at start, computer took "+ computerS+", so " + sticks + " sticks remain");
		       }else System.out.println();
				round++;
				
			}
			 if (round%2==0)
				 System.out.println("Computer wins.");
			 else System.out.println("Human wins.");
		}else {
			System.out.println("Computer starts\n");
			for (round=0; sticks>0;) {
				int computerS =1;
	        	if ( Math.random()>0.5) 
	        		computerS=1;
	        	else computerS =2;
				
				int remainC = sticks;
				sticks = remainC - computerS;
				
				System.out.println("Round "+ round +", "+ remainC + " sticks at start, computer took "+ computerS+", so " + sticks + " sticks remain");
				round++;
				
				if (sticks>0) {
					int humanS = ap.nextInt("How many sticks do you want to remove?"); 
					while (humanS > 2 || humanS <= 0) {  
						humanS = ap.nextInt("The number you entered is not allowed. Please enter again.");
					}
					int remainH = sticks;
		        	int round2= round;
		        
		        	sticks = sticks - humanS;
				//Round 0, 7 sticks at start, computer took 2, so 5 sticks remain
				    System.out.println("Round "+ round2 + ", "+ remainH + " sticks at start, human took "+ humanS+", so " + sticks + " sticks remain");
		       }else System.out.println();
				round++;
				
			}
			 if (round%2==0)
				 System.out.println("Human wins.");
			 else System.out.println("Computer wins.");
		}
 
		 
	}

	
}
