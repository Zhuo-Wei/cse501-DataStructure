package studio6;

public class Methods {

	// fact(n) 
	public static int fact( int n) {
		if(n<=0) {
			return 1;
		}
		else  {
			return n * fact(n-1);
		}
	}
	
	 //fib(n)
	  public static int fib( int n) {
			if(n<=1) {
				return n;
			}
			else  {
				return fib(n-1) + fib(n-2);
			}
		}
	  // isOdd(n) =	!isOdd(n-1)	;	n>0
	
		public static boolean isOdd( int n) {
			if(n<=0) {
				return false;
			}
			else  {
				return !isOdd(n-1);
			}
		}
		//sum(a,b) 
		public static int sum( int a, int b) {
			if(b<=0) {
				return a;
			}
			else  {
				return sum(a+1,b-1);
			}
		}
		// sumDownBy2(n) = n + (n-2) + (n-4) + ... 
	
		public static int sumDownBy2(int n) {
			if(n==0) {
				return 0;
			}
			else {
				if(n==1) {
					return 1;
				}
				else {
					return n+ sumDownBy2(n-2);
				}	
			}
	
		}
		 // harmonicSum(n) = 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n
		public static double  harmonicSum(double n) {
			if (n==1) {
				return 1;
			}
			else {
				return 1/n + harmonicSum(n-1);
			}
		
		}
		
		// mult(a,b)= a + a + ... + a + a  (added together b times)
		  //mult(a,0) = 0
		public static int mult(int a, int b) {
			if(b==0) {
				return 0;
			}
			else {
				return a + mult(a,(b-1));
			}
		}
		
}
