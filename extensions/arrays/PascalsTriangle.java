package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);	
		int N = ap.nextInt("What is the number of rows?");
		
		int[][] pt = new int[N][N];
		
		for(int i = 0; i <N; i++) {
			for (int j= 0; j <N; j++) {
			
					pt[i][j]= 1;
				}
			}
		
				
		for(int r = 0; r <N; r++) {
			for (int c = 0; c <N; c++) {	
					if (c>=1&&r>1) {
						pt[r][c] = pt[r-1][c]+ pt[r-1][c-1];
						if (c==0||c==r) {
							pt[r][c]=1;
							}
					}
					int entry = pt[r][c];
					if (c>r) {
						System.out.print("   "); 
					}
					
					 else 
						 if (entry>=10) {
							 System.out.print(" " + pt[r][c] );
						 }
						 else System.out.print(" "+ pt[r][c] + " ");
					
					
			}	
			System.out.println();
		}
				
					
						
			
		
	
	}

}
