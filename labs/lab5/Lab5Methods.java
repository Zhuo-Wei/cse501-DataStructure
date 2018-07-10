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
		
			for(int i = 1; i < n+1; i++) {
				sum = sum+1.0/i;
			}
	
		return sum;
	}
	public static double geometricSum(int k) {
		//RETURN VALUE: the sum 1 + 1/2 + 1/4 + 1/8 + .. + 1/Math.pow(2,k)
		double sum =0;
		while(k >= 0){
			sum += (1 / Math.pow(2, k));
			k--;
		}
		return sum;
	}
	
	public static int multPos(int k, int j) {
		int sum=0;
		int i=0;
		while( i<j) {
			sum=sum+k;
			i++;
		}
		return sum;
	}
	
	public static int mult(int k, int j) {
		int sum=0;
		int i=0;
		if (k!=0&&j!=0) {
			if (j>0&&k>0) {
				 return multPos(k, j);
			}
			else {
				if(j<0&&k<0) {
					return multPos(-k, -j);
				}
				else if(j<0&&k>0) {
					return -multPos(k, -j);
				}
				else if(k<0&&j>0) {
					return -multPos(-k, j);
				}
				
			}
		}
		else sum=0;
		return sum;
	}
	public static int expt(int n, int k) {
		int sum=1;
		if (k>0) {
			while(k>0) {
				sum = sum*n;
				k--;
			}
		}
		return sum;
	}
}
