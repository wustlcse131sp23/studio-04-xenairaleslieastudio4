package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//gray, blue, yellow, white
		
		
		
		StdDraw.setPenColor(Color.gray);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.18);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.18);
	}
}