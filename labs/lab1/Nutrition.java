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
		double ac = ap.nextDouble("Enter the number of statedCals");
		 // This food is said to have 271 (available) Calories.
 	    
		// With 6.6 unavailable Calories, this food has 1.65 grams of fiber

		
				System.out.println(s0 + " has\n"
		+ c + " grams of carbohydrates = " + c1+ "Calories\n"
		+ f + " grams of fat = " + c2+ "Calories\n"
		+ p + " grams of protein = " + c3+ "Calories\n\n"
		+ "This food is said to have " + ac + " (available) Calories.\r\n" 
		+ "With 6.6 unavailable Calo");
		
	    
	    	  
	    	    

	    	  	    	    //Approximately
	    	      //50.9% of your food is carbohydrates
	    	      //45.2% of your food is fat
	    	      //6.3% of your food is protein

	    	    //This food is acceptable for a low-carb diet?  false
	    	    //This food is acceptable for a low-fat diet?  false
	    	    //By coin flip, you should eat this food?   true
	}

}
