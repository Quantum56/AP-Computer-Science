/**
 * Program that creates an applet of a random number of circles and random radiuses.
 */

/**
 * @author ZackB
 *
 */
import java.awt.*;
import java.util.Random;
import java.applet.Applet;

public class test1 extends Applet {
	private static final long serialVersionUID = 2L;

	/**
	 * @param args
	 */
	public void paint(Graphics page) {
		// TODO Auto-generated method stub
		final int NUM_BOXES = 50, THICKNESS = 5, MAX_SIDE = 50;
		final int MAX_X = 350, MAX_Y = 250;
		int x, y, width, height;

		setBackground(Color.black);
		Random gen = new Random();

		for (int count = 0; count < NUM_BOXES; count++) {
			x = gen.nextInt(MAX_X) + 1;
			y = gen.nextInt(MAX_Y) + 1;

			width = gen.nextInt(MAX_SIDE) + 1;
			height = gen.nextInt(MAX_SIDE) + 1;

			if (width <= THICKNESS) {
				page.setColor(Color.yellow);
				page.fillRect(x, y, width, height);
			} else if (height <= THICKNESS) {
				page.setColor(Color.green);
				page.fillRect(x, y, width, height);
			} else {
				page.setColor(Color.white);
				page.drawRect(x, y, width, height);
			}
		}
	}

}
