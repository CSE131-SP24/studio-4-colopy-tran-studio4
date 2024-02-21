package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		/* int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		*/
		int shapeNum = (int)(Math.random() * 10) + 10;
		
		for(int i = 0; i < shapeNum; i++) {
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);
			
			StdDraw.setPenColor(red, green, blue);
			
			double x = Math.random();
			double y = Math.random();
			double xSize = Math.random() / 2;
			double ySize = Math.random() / 2;
			StdDraw.filledRectangle(x, y, xSize, ySize);
		}
		
		//StdDraw.setPenColor(red, green, blue);
		
		StdDraw.filledCircle(0.5, 0.5, 0.3);
		
		StdDraw.setPenColor(0,0,0);
		
		StdDraw.filledCircle(0.6, 0.5, 0.1);
		StdDraw.filledCircle(0.4, 0.5, 0.1);
		StdDraw.filledRectangle(0.5, 0.55, 0.3, 0.03);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.arc(0.5, 0.47, 0.2, 200, -20);
		
		StdDraw.arc(0.4, 0.6, 0.1, 10, 170);
		StdDraw.line(0.55, 0.65, 0.65, 0.7);
		
		
	}
}