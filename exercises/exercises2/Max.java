package exercises2;

import cse131.ArgsProcessor;

public class Max {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
	
		//
		// Below, prompt the user for two ints, x and y
		//
		int x = ap.nextInt("Enter x:");
		int y = ap.nextInt("Enter y:");
		
		
		//
		// Now use what you have learned about conditional
		//   execution to print the larger of the two values.
		//
		int max= 1;
				if (x>y) {
					max=x;		
				}
				else {max=y;}
		System.out.println("Max of " + x +"and " + y + " is " + max);
		
		
		//
		// Run this program testing on various inputs for
		//    x and y:  some where x < y, some where x > y,
		//              some where x == y

	}

}
