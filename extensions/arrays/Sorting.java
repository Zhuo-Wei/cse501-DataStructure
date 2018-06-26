package arrays;
import cse131.ArgsProcessor;

public class Sorting {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int S = ap.nextInt("What is the size?");
		while(S <=0) {
			 S = ap.nextInt("The size must be positive, please input again.") ;
		}
	
		int[] a= new int[S];
		for(int i=0;i<S;i++) {
			a[i] = ap.nextInt("please input a number you want");
			System.out.print(a[i]+" ");		
		}
		System.out.println();
		int sortCount=0;
		
		while(sortCount < S) {
			int x = a[sortCount];
			for(int i=sortCount; i<S; i++) {
			    
				if(a[i]<x) {
					x=a[i];
				}	
				
			}
			int y=a[sortCount];
			for(int i=sortCount; i<S; i++) {
				
			    if(a[i]==x) {
			    	a[i]= y;
			    }
			    a[sortCount]=x;
			}
			sortCount++;
			
		}
		
		for(int i=0;i<S;i++) {
			System.out.print(a[i]+ " ");
		}
		double sum=0;
		for(int i=0;i<S;i++) {
			sum= sum + a[i];
		}
		double mean= sum /(double)S;
		System.out.print("Mean: " + mean);
		
		
		int m= S/2;
		if(S%2==0) {
			m= S/2-1;
		}
		else m= S/2;
		
		System.out.print("Median: " + a[m]);
		System.out.print("Min: "+ a[0]);
		System.out.print("Max: "+ a[S-1]);
		int range= a[a.length-1]-a[0];
		System.out.print("Range: "+ range);
	}

}
