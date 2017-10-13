/*
 * A constructor method that creates a single Crayon and is used in the CrayonBox class
 */

/**
 * @author ZackB
 *
 */
import java.applet.Applet;
import processing.core.*;
import java.awt.*;

public class Crayon extends PApplet {
	// needs serial id

	private final int cBottom = 150;
	private final int cWidth = 30;
	private Color color;
	private int length, location;

	public Crayon(Color color, int length, int position) {
		this.color = color;
		this.length = length;
		location = position;
	}

	public void draw(Graphics page) {
		page.setColor(color);
		page.fillRect(location, cBottom - length, cWidth, length);
	}
	public void drawTri(Graphics page) {
		page.setColor(color);
		int a = cBottom - length;
		int[] locationArr = new int[location];
		int[] Arr = new int[a];
		page.setColor(color);
	}
}
