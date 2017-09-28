/**
 * Program that creates an Applet of a random number of circles and random radiuses.
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
		final int NUM_CIRCLES = 100;
		final int MAX_R = 350, MAX_X = 250, MAX_Y = MAX_X;
		int r;
		this.setSize(600, 600);
		setBackground(Color.black);
			for (int count = 0; count < NUM_CIRCLES; count++) {
				
				r = gen.nextInt(MAX_R) + 1;
				int color = gen.nextInt(12) + 1;
				
				if (color == 1) {
					page.setColor(Color.white);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 2) {
					page.setColor(Color.yellow);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 3) {
					page.setColor(Color.red);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 4) {
					page.setColor(Color.pink);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 5) {
					page.setColor(Color.orange);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 6) {
					page.setColor(Color.magenta);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 7) {
					page.setColor(Color.lightGray);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 8) {
					page.setColor(Color.green);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 9) {
					page.setColor(Color.gray);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 10) {
					page.setColor(Color.darkGray);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 11) {
					page.setColor(Color.cyan);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				if (color == 12) {
					page.setColor(Color.blue);
					page.fillOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, r, r); //gen.nextInt(MAX_Y) + 1
				}
				
			}
	}

}