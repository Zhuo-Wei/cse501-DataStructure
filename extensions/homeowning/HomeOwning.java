package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String zip =ap.nextString("What is the zip code of the apartment?");
		String name =ap.nextString("What is the apartment name?");
		int mRent=600;
		double dInterest=31.99;
		int yRent = 7200;
		double wRent = Math.round(yRent/52.0*100d)/100d;
		//The rent for a week, rounded to the nearest cent
		//The interest payments for a year, shown in dollars and cents
		//The interest payments for a week, rounded to the nearest cent
		//Your decision, based on cost, of whether to rent or own, based on which is cheaper  
		double wInterest= Math.round(7*dInterest*100d)/100d;
		double yInterest= Math.round(365*dInterest*100d)/100d;	
		System.out.println(name+ " is located int the Zip Code "+zip+"\n"
			+ "Rent per year: " +yRent+"\n"
			+ "Rent per week:"+ wRent+"\n\n"
			+ "Interest paid per year: " + yInterest+"\n"
			+ "Interest paid per week: " + wInterest);
		if(yRent<yInterest ) {
			System.out.println("I should rent");
		}
		else System.out.println("I should buy");
		//Vanguard Crossing is located in the Zip Code 63104
		//Rent per year: 7200
		//Rent per week: 138.46

		//Interest paid per year: 11676.35
		//Interest paid per week: 223.93

		//I should rent
		

	}

}
