package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");
      
       double sum= 0;
       int count=0;
       while (!StdIn.isEmpty()) {
    	   double d=StdIn.readDouble();
    	   sum=sum+d;
    	   count=count+1;
    	   System.out.println(d);	  
    	       }	  
		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
