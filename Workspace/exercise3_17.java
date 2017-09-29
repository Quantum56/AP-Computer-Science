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
		final int NUM_CIRCLES = 100000000;
		final int MAX_R = 100, MAX_X = 1920, MAX_Y = 1080;
		int rd, mod1, mod2;
		this.setSize(1920, 1080); // original 300
		setBackground(Color.black);
			for (int count = 0; count < NUM_CIRCLES; count++) {
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rd = gen.nextInt(MAX_R) + 1;
				mod1 = gen.nextInt(rd + 10) + 1;
				mod2 = gen.nextInt(rd + 10) + 1;
				int r = gen.nextInt(255) + 1;
				int g = gen.nextInt(255) + 1;
				int b = gen.nextInt(255) + 1;
				Color color = new Color(r, g, b);
				page.setColor(color);
				page.drawOval(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, rd + mod1, rd + mod2);
				page.drawRect(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, rd + mod1, rd + mod2);
				page.draw3DRect(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, rd + mod1, rd + mod2, false);
				page.drawLine(gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1, gen.nextInt(MAX_X) + 1, gen.nextInt(MAX_Y) + 1);
			}
	}

}