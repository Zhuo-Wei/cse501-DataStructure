package lab5;

import static org.junit.Assert.assertEquals;

public class Lab5Methods {

	public static int sumDownBy2(int n) {
	
		int sum = 0;
		while(n >= 0){
			sum += n;
			n -= 2;
		}
		return sum;
	}
	public static double harmonicSum(int n) {
		double sum = 0;
		while(n>0) {
			for(int i = 1; i < n+1; i++) {
				sum = sum+1.0/i;
			}
		}
		return sum;
	}
	public static double geometricSum(int k) {
		//RETURN VALUE: the sum 1 + 1/2 + 1/4 + 1/8 + .. + 1/Math.pow(2,k)
		int sum =0;
		while(k >= 0){
			sum += (1 / Math.pow(2, k));
			k--;
		}
		return sum;
	}
	
	accomplish this with
	
}
