package studio3;

import cse131.ArgsProcessor;

public class Eratosthenes {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("What is the size?");
		int[] contents = new int[n];
		
		for( int i = 0; i < n; ++i ) {
		    contents[i]= i+2;
			System.out.println(contents[i]+" ");
			
		}
		
		for (int x= 0; x < n; ++x) {
			for(int j = 2; j<n; ++j) {
				for( int h = 2; h<n; ++h) {
					if (contents[x] == j*h) {
						contents[x] = 0;
					
					}	
					
				}	
				
			}
		}
	   int prime[]= new int[n];
	       int count = 0;
		   		for (int y=0; y<n;++y) {
		   				if (contents[y] !=0) {
						prime[count] = contents[y];
					
						System.out.print(prime[count]+", ");
						count++;
		   				}				
		   		}
					}
						
						
						
				   
				    
	    
	 
	}


