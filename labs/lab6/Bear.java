package lab6;

import cse131.ArgsProcessor;

public class Bear {
     
	public static String bottlesOfBeer(int n) {
		if(n<=0) {
			return " ";
		}
		return n +" bottles of beer on the wall, " 
		+n+" bottles of beer; you take one down, pass it around, "
				+(n-1) +" bottles of beer on the wall.\n"
				+ bottlesOfBeer(n-1);
		
	}
	
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("How many beers?");
	    System.out.println(bottlesOfBeer(n));

	}

} 