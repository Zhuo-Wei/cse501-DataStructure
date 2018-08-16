package fibonacci;

public class Fibonacci {
	
	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			int x=1;
			int y=1;
			int sum=x+y;
		
			while(n>3) {
				x=y;
				y=sum;
				sum = sum+ x ;
				n--;
		
			}
			return sum	;	
		}
		
	}
	
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int a=1;
		int b=1;
		int Sum=a+b;
		int c=0;
		for(int i=0; i<n-3;i++) {
			c=Sum;
			Sum= Sum+b;
			b=c;
		}
		return Sum;
	}
	
}


