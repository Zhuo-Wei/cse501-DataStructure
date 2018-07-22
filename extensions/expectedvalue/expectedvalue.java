package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		double p = ap.nextDouble("What is the probability of success?");
	    int Gamer= (int)(190000*p+(1-p)*5000);
		//$110,000 to $160,000
		int Programmer= 110000 + (int)(Math.random()*50000);
		boolean choice= Gamer>Programmer;
		System.out.println("Gamer: $"+ Gamer+"\n"
			+ "Programmer: $"+ Programmer+"\n"
			+ "You should be a gamer and not a programmer? "+ choice ) ; 


	   int EUGamer = (int)(3*Math.pow(Gamer, 0.5));
	   int EUProgrammer= (int)(2*Math.pow(Programmer, 0.5));
	   //Take the values for the wealth for the two jobs that you got before, and plug them into the above utility functions
	   boolean choice2= EUGamer>EUProgrammer;
	   System.out.println("Gamer: $"+ EUGamer+"\n"
				+ "Programmer: $"+ EUProgrammer+"\n"
				+ "You should be a gamer and not a programmer? "+ choice2 ) ; 
	 
		
	}

}
