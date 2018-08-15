package calculator;

public class Computations {

	/**
	 * Create the static methods as described on the 
	 * description for this assignment.
	 */
	public static double addDoubles(double d1, double d2) { 
		return d1 + d2;
	}
	public static double subtractDoubles(double d1, double d2) {
		return d1-d2;
	}
	public static double divideDoubles(double d1, double d2) {
		if(d2==0) {
			return 0;
		}
		else return d1/d2;
	}
	public static double multiplyDoubles(double d1, double d2) {
		return d1*d2;
	}
	//int
	public static int addInts(int i1, int i2) {
		return i1+i2;
	}
	public static int subtractInts(int i1, int i2) {
		return i1-i2;
	}
	public static int divideInts(int i1, int i2) {
		if(i2==0) {
			return 0;
		}
		else return i1/i2;
	}
	public static int multiplyInts(int i1, int i2) {
		return i1*i2;
	}
	
	//A String Operation, which takes in two Strings and concatenates them
	public static String concatenate(String s1, String s2) {
		return s1+s2;
	}
	//Boolean operations, which take in two booleans and outputs one
	// which returns the value of the expression b1 &amp;&amp; b2
	public static boolean andBoolean(boolean b1, boolean b2) {
		return b1&&b2;
	}
	// which returns the value of the expression b1 || b2
	public static boolean orBoolean(boolean b1, boolean b2) {
		boolean b3= b1||b2;
		return b3;
	}
	
	//double to

	public static double intToDouble(int in) { 
		return (double)in; 
	}
	
	public static double doubleToDouble(double in) {
		return in;
	}
	
	public static double stringToDouble(String in) {
		throw new UnsupportedOperationException(); 
	}
	public static double booleanToDouble(boolean in) {
		throw new UnsupportedOperationException(); 
	}
	
	//int to
	public static int intToInt(int in) {
		return in;
	}
	public static int doubleToInt(double in) {
		return (int)in;
	}
	
	public static int booleanToInt(boolean in) {
		throw new UnsupportedOperationException(); 
	}
	public static int stringToInt(String in) { 
		throw new UnsupportedOperationException(); 
	}
	
	// to string
	public static String intToString(int in) {
		return ""+ in;
	}
	public static String doubleToString(double in) {
		return ""+ in;
	}
	public static String stringToString(String in) {
		return in;
	}
	public static String booleanToString(boolean in) {
		return ""+ in;
	}
	// to boolean
	public static boolean intToBoolean(int in) {
		throw new UnsupportedOperationException(); 
	}
	public static boolean doubleToBoolean(double in) {
		throw new UnsupportedOperationException(); 
	}
	public static boolean stringToBoolean(String in) {
		throw new UnsupportedOperationException(); 
	}
	public static boolean booleanToBoolean(boolean in) {
		return in;
	}

}
