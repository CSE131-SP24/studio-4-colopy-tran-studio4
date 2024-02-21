package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shapeType = in.next();

		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		double param5 = in.nextDouble();
		double param6 = in.nextDouble();

		StdDraw.setPenColor(red, green, blue);

		if (shapeType.equals("ellipse")) {
			
			if(isFilled) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else{
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}

			
		}
		
		if (shapeType.equals("rectangle")) {



			if(isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else{
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}

		}
		
		if(shapeType.equals("triangle")) {
			double[] polyX = {x, halfWidth, param5};
			double[] polyY = {y, halfHeight, param6};
			
			if(isFilled) {
				StdDraw.filledPolygon(polyX, polyY);
			}
			else{
				StdDraw.polygon(polyX, polyY);
			}

			
			
					
		}



	}
}
