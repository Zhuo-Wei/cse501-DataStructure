package lab6;

import cse131.ArgsProcessor;

public class Methods {
	
	//f(x) =    x-10     if x > 100
    //f(f(x+11))  if x <= 100
	
	public static int f(int x) {
		if (x>100) {
			return x-10;
		}
		else {
			return f(f(x+11));
		}
	}
	//g(x,y)  = y+1               if x = 0
       // = g(x-1,1)          if x > 0 and y = 0
       // = g(x-1, g(x, y-1)) if x > 0 and y > 0	
	public static int g(int x, int y) {
		if(x==0) {
			return (y+1);	
		}
		else {
			if (x>0&&y==0) {
				return g(x-1,1);
			}
			else { 
				if(x>0&&y>0) {
					return g(x-1, g(x, y-1));
			}
				else return 0;
			}
		} 
	}
		
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

	    System.out.println(f(99));
	    System.out.println(f(87));

	    System.out.println(g(1,0));

	    System.out.println( g(1,2));

	    System.out.println(g(2,2));


	}

}
