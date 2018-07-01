package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
    	
    	ArgsProcessor ap = new ArgsProcessor(args);
    	int N = ap.nextInt("How many balls do you want");
    	int T = ap.nextInt("How many times  do you want");
        int pause=50;
        // set the scale of the coordinate system
        StdDraw.setXscale(0.0, 1.0);
        StdDraw.setYscale(0.0, 1.0);
        double[] rx = new double[N];
        double[] ry = new double[N];
        double[] vx = new double[N];
        double[] vy = new double[N];
        double radius = 0.02;              // radius
        Color c = new Color(200,130,150);
        StdDraw.setPenColor( c);
        
        for(int i=0; i<N; i++) {
        	rx[i] = Math.random();
        	ry[i] = Math.random();     // position
        	double a = Math.random();
        	double b = Math.random();
        	if(a<0.5) {
        		vx[i] = Math.random()*0.02;
        	}
        	else vx[i] = -Math.random()*0.02;
        	if(b<0.5) {
        		vy[i] = Math.random()*0.02;
        	}
        	else vy[i] = -Math.random()*0.02;
        	     // velocity
        	 StdDraw.filledCircle(rx[i], ry[i], radius); 
        	// main animation loop
           
        }
       for(int t=0; t<T; t++)  { 
    	   StdDraw.clear();
          
            for(int i=0; i<N; i++) {
      
            // update position
            
            // bounce off wall according to law of elastic collision
            	if (Math.abs(rx[i] + vx[i]) > 1.0 - radius) vx[i] = -vx[i];
            	if (Math.abs(rx[i] + vx[i]) < 0 +radius) vx[i] = -vx[i];
            	if (Math.abs(ry[i]+ vy[i]) > 1.0 - radius) vy[i] = -vy[i];
            	if (Math.abs(ry[i] + vy[i]) < 0 + radius) vy[i] = -vy[i];
          
            
            	rx[i] = rx[i] + vx[i]; 
            	ry[i] = ry[i] + vy[i];
 
            } 	
            for(int i=0; i<N; i++) {
            	for(int j= i; j<N;j++) {
            		if (!(i==j)) {
            			if(Math.pow((rx[i]-rx[j]),2) + Math.pow((ry[i]-ry[j]),2)<= 0.0016){
            				if ((vx[i]>0&&vx[j]<0)||(vx[j]>0&&vx[i]<0)) {
            					vx[i] = -vx[i];
            					vx[j] = -vx[j];
            				}
            				if ((vy[i]>0&&vy[j]<0)||(vy[j]>0&&vy[i]<0)) {
            					vy[i] = -vy[i];
            					vy[j] = -vy[j];
            				}
            			}
            		}
            	}
            	StdDraw.filledCircle(rx[i], ry[i], radius);
            }
            StdDraw.show(pause); 
        }
        
	}

}
