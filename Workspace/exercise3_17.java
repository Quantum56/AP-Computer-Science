/**
 * Program that creates an applet of a random number of circles and random radiuses.
 */

/**
 * @author ZackB
 *
 */
import java.awt.*;
import java.util.Random;
import java.applet.*;

public class exercise3_17 extends Applet {
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	public void paint(Graphics page) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		final int NUM_CIRCLES = 100, THICKNESS = 10;
		final int MAX_R = 350, MAX_X = 2000, MAX_Y = MAX_X;
		int r, radius;
		setBackground(Color.black);
			for (int count = 0; count < NUM_CIRCLES; count++) {
				
				r = gen.nextInt(MAX_R) + 1;
				radius = gen.nextInt(MAX_R) + 1;
				// if (radius <= THICKNESS) {
					page.setColor(Color.white);
					page.fillOval(100, 100, 100, 100); //gen.nextInt(MAX_Y) + 1
				// }
			}
	}

}
