package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String s0 = ap.nextString("Enter a food name"); //Snickers has
		double c = ap.nextDouble("Enter the number of carbs");
		double c1 = Math.round(c * 4*10d) /10d; //34.5 grams of carbohydrates = 138.0 Calories
		double f = ap.nextDouble("Enter the number of fat");
		double c2 = Math.round(f * 9*10d) /10d; // 13.6 grams of fat = 122.4 Calories
		double p = ap.nextDouble("Enter the number of protein");
		double c3 = Math.round(p * 4*10d) /10d; //4.3 grams of protein = 17.2 Calories
		int ac = ap.nextInt("Enter the number of statedCals");
		 // This food is said to have 271 (available) Calories.
 	    double totc = c1+c2+c3 ;
 	    double unc = Math.round((totc - ac)*10d) /10d ;
 	    double fib = Math.round(unc / 4*100d) /100d ; 
 	    // With 6.6 unavailable Calories, this food has 1.65 grams of fiber
 	    //50.9% of your food is carbohydrates
	    double pc1= Math.round(c1 / ac *1000d) /10d; 
 	    //45.2% of your food is fat
	    double pc2= Math.round(c2 / ac *1000d) /10d; 
	    //6.3% of your food is protein
	    double pc3= Math.round(c3 / ac *1000d) /10d;
   	    //This food is acceptable for a low-carb diet?  false
	    boolean lowCarb= pc1 <= 25;
	    //This food is acceptable for a low-fat diet?  false
	    boolean lowFat= pc2 <= 15;
	    //By coin flip, you should eat this food?   true
	    double cf = Math.random();
	    boolean e = cf < 0.5;		
	    		
		System.out.println(s0 + " has\n"
		+ c + " grams of carbohydrates = " + c1+ " Calories\n"
		+ f + " grams of fat = " + c2+ " Calories\n"
		+ p + " grams of protein = " + c3+ " Calories\n\n"
		+ "This food is said to have " + ac + " (available) Calories.\n" 
		+ "With " + unc + " unavailable Calories, "
		+ "this food has " + fib + " grams of fiber\n\n"
		+"Approximately\n\t"
		+ pc1 + "% of  your food is carbohydrates\n\t "
		+ pc2 + "% of  your food is fat\n\t "				
		+ pc3 + "% of  your food is protein\n\n"				
		+ "This food is acceptable for a low-carb diet? "+ lowCarb +"\n"
		+ "This food is acceptable for a low-fat diet? " + lowFat +"\n"
		+ "By coin flip, you should eat this food? " + e);
		
	    
	    	      

	    	    
	}

}
