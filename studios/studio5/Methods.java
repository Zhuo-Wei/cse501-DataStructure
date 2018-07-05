package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
     /**
      * @param x one factor
	  * @param y one factor
      * @param z another factor
      * @return the product of the factors
      * 
      */
	public static double Avg3(int x, int y, int z) {
		return (double)(x+y+z)/3.0;
	}
	
	 /**
	  * @param an array a
	  * @return the sum of the array
	  */
	public static double sumArray(double[] a ) {
		double s=0;
		for (int i=0; i<a.length; i++) {
			s=s+a[i];
		}
		return s;
	}

	/**
	  * @param an array a
	  * @return the average of the array 
	 */
	public static double average(double[] a ) {
		double s = sumArray(a);
		double ave = s/ a.length ;
		return ave;
	}
	
	/**
	 * @param a string
	 * @return a string  after pig latin
	 * 
	 */
	
	public static String pig( String x) {
		
		return x.substring(1) + x.substring(0,1) + "ay";
	}
	
	
}
