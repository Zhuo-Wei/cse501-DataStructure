package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//
		// Prompt the user for a number of inches
		int pInches = ap.nextInt("The number of inches?");
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		int f = pInches / 12;
		int inches = pInches  %12;
	    if (pInches == 1) 
	    	if (inches==1) {
	    		System.out.println(  f +" foot and " + inches + " inch" ) ;	}
	    	else {System.out.println( f +" foot and " + inches + " inches" );}
	    else 
	    	if (inches == 1) {
	    		System.out.println(  f +" feet and " + inches + " inch" ) ;	}
	    	else {System.out.println( f +" feet and " + inches + " inches" );}
	      
	    }

	}


