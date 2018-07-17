package lab6;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class Triangles {

	public static void tri(double[]x,double[]y) {
		if(x[1]-x[0]<0.01) {
			return;
		}
		StdDraw.setPenColor(Color.white);
		double[] a=new double[3];
		a[0]=(x[0]+x[1])/2;
		a[1]=(x[1]+x[2])/2;
		a[2]=(x[2]+x[0])/2;
		double[] b=new double[3];
		b[0]=(y[0]+y[1])/2;
		b[1]=(y[1]+y[2])/2;
		b[2]=(y[2]+y[0])/2;
		StdDraw.filledPolygon(a, b);
		double[] x1=new double[3];
		x1[0]=x[0];
		x1[1]=a[0];
		x1[2]=a[2];
		double[] x2=new double[3];
		x2[0]=a[0];
		x2[1]=x[1];
		x2[2]=a[1];
		double[] x3=new double[3];
		x3[0]=a[2];
		x3[1]=a[1];
		x3[2]=x[2];
		double[] y1=new double[3];
		y1[0]=y[0];
		y1[1]=b[0];
		y1[2]=b[2];	
		double[] y2=new double[3];
		y2[0]=b[0];
		y2[1]=y[1];
	    y2[2]=b[1];	
		double[] y3=new double[3];
		y3[0]=b[2];
		y3[1]=b[1];
	    y3[2]=y[2];	
		
		tri(x1,y1);
		tri(x2,y2);
		tri(x3,y3);
		StdDraw.pause(50);
	}
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double[] x =new double[3];
		double[] y =new double[3];
		x[0]=0;
		x[1]=0.5;
		x[2]=1;
		y[0]=0;
		y[1]=0.866;
		y[2]=0;
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledPolygon(x, y);
		tri(x,y);

	}

}
