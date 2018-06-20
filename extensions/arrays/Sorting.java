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
	}

}
