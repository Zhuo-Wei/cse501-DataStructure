package exercises2;

import cse131.ArgsProcessor;

public class Die {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//
      double n =  Math.random();
    		  if (n < 1.0/6.0) 
    		   System.out.println("1");
    		  else
    			  if (n < 2.0/6.0 && n >= 1.0/6 ) {
		        System.out.println("2");}
    			  else
    				  if (n < 3.0/6.0 && n >=2.0/6.0 )
       		          {System.out.println("3");}
    				  else
    					  if (n < 4.0/6.0 && n >= 3.0/6.0 )
   		                     System.out.println("4");
    					  else
    						  if (n < 5.0/6.0 && n >= 4.0/6.0)
    							 System.out.println("5");
    						  else 
   		                       System.out.println("6");	  
              

}
}
