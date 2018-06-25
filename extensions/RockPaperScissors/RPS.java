package RockPaperScissors;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0 = rock; 1 = paper; 2 = scissors");
		ArgsProcessor ap = new ArgsProcessor(args);
		int n=ap.nextInt("How many rounds do you want to play?");
		int i = 0;
		int p1Win = 0;
	    int p2Win = 0;
	    int tg=0;
	    int p2=0;
	    int[] p2Array = new int [3];
	    for (int j=0; j <3; j++) {
	    	p2Array[j]=j;
	    	
	    }
	    
		while(i < n) {
			int p1 = (int)(Math.random()*3);
			if(i<3) {
				p2=p2Array[i];
			}
			else 
				if (i%3==0) {
					p2=p2Array[0];
				}
				else 
					if (i%3==1) {
						p2=p2Array[1];
					}
					else p2=p2Array[2];
			
			if ((p2-p1==1)||(p1-p2==2)) {
				System.out.println("Round "+(i+1)+ " , A shows " + p1+" and b shows " + p2+", B wins");
				p2Win++;
			}
			else 
				if((p2-p1==2)||(p1-p2==1)) {
					System.out.println("Round "+(i+1)+ " , A shows " + p1+" and b shows " + p2+", A wins");
					p1Win++;
				}
				else {
					System.out.println("Round "+(i+1)+ " , A shows " + p1+" and b shows " + p2+", tie game");
					tg++;
				}
					 
		    
			i++;
		}
		double f1= Math.round((double)p1Win/(double)n*100d)/100d;
		double f2= Math.round((double)p2Win/(double)n*100d)/100d;
		System.out.println("A wins " + p1Win  +" times in fraction "+f1 +"\n"
				+ "B wins " +  p2Win  +" times in fraction "+f2);
	}

}
