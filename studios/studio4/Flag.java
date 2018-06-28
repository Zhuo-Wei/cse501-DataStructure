package studio4;

import java.awt.Color;

import sedgewick.StdDraw;

public class Flag {

	
	public static void main(String[] args) {
		StdDraw.filledRectangle(0.5, 0.83333, 0.5, 0.17);
		StdDraw.setPenRadius(0.01);
		StdDraw.line(0, 0, 1, 0);
		StdDraw.line(0, 0, 0, 1);
		StdDraw.line(0, 1, 1, 0);
		StdDraw.line(1, 1, 1, 0);
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.166667);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledRectangle(0.5, 0.16667, 0.5, 0.166667);
		StdDraw.setPenColor(Color.white);
		double positionX= 0.1;
	    double positionY= 0.9;
		while(positionX<1||positionY>0) {
			StdDraw.text(positionX, positionY, "Germany");
			positionX= positionX +0.1;
			positionY=positionY-0.1;
			StdDraw.pause(1000);
		}
		
	}

}
