package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		int pennies = 798;	
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		//dollars = 100pennies
				int dollars = pennies/100;
				int cents = pennies%100;
				//quarters = 25pennies
				int quarters = cents/25;
				cents = cents%25;
				//dimes = 10pennies
				int dimes = cents/10;
				cents = cents%10;
				//nickels = 5pennies
				int nickles = cents/5;
				cents = cents%5;
				pennies = cents;
	System.out.println("for 798 pennies, "+ dollars + "dollars" +
				 quarters + "quarters" + dimes + "dimes" + nickles+ "nickles"
			+ pennies + "pennies");
	}

}
