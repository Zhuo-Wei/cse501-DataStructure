package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int D = ap.nextInt("How many dice will be used in this simulation?");
		int T = ap.nextInt("How many times will the dice be thrown?");
		 // for each die d
		 //     randomly throw d to obtain the value v, shown face-up on d
		 //     record die d\'s role in the diceThrown array
		 // end
		 // At this point, your dieThrown array has an entry that shows each die\'s value
		int[] a = new int[T];
		for(int t = 0; t < T; t++) {
			int sum = 0;
			for(int d = 0; d < D; d++) {
				
				int v = (int)(Math.random()*6);
				v = v + 1;
				sum = sum +v;
			}
		    a[t]=sum;
			System.out.println(a[t]);
		}
		double[] count = new double[6*D+1];
		// initial every value to be 0
		for(int i=0;i<count.length;i++) {
			count[i]=0;
		}
		double t=1/T;
		for(int i=0;i<a.length;i++) {
			count[a[i]]=count[a[i]]+t;
			
		}
		for(int i=D;i<count.length;i++) {
			System.out.println("Sum value "+ i+" appears "+ count[i]+" times"+ 1/T);
		}
		
		
	
	}

}
