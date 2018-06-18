package arrays;
import cse131.ArgsProcessor;

public class Birthday {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);	
	int N = ap.nextInt("How many people?");
	int[][]cal= new int[12][31];
			for(int i= 0; i<N; i++) {
				int m =(int)(Math.random()*12);
				int d =(int)(Math.random()*31);
			    cal[m][d]=cal[m][d]+ 1;
			    System.out.print(cal[m][d]);
			}
	
	
	}

}
