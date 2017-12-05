import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author ZackB
 *
 */
public class exercise6_15 extends Applet {
	private static final long serialVersionUID = 1L;

	private static Random gen = new Random();

	/**
	 * @param args
	 */
	public void paint(Graphics page) {
		// TODO Auto-generated method stub
		final int NUM_STARS = 100000000;
		final int MAX_X = 1240, MAX_Y = 800;
		this.setSize(1280, 1024);
		setBackground(Color.BLACK);
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter Star generation delay: (Milliseconds) "));
		for (int i = 0; i < NUM_STARS; i++) {
			try {
				Thread.sleep(a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int x = gen.nextInt((MAX_X - 50) + 1);
			int y = gen.nextInt((MAX_Y - 50) + 1);
			drawStar(x, y, page);
		}
	}

	public void drawStar(int x, int y, Graphics page) {
		int r = gen.nextInt(255) + 1;
		int g = gen.nextInt(255) + 1;
		int b = gen.nextInt(255) + 1;
		Color color = new Color(r, g, b);
		// Star points
		int[] xPoints = { 42 + x, 52 + x, 72 + x, 52 + x, 60 + x, 40 + x, 15 + x, 28 + x, 9 + x, 32 + x, 42 + x };
		int[] yPoints = { 38 + y, 62 + y, 68 + y, 80 + y, 105 + y, 85 + y, 102 + y, 75 + y, 58 + y, 60 + y, 38 + y };
		int nPoints = 11; // number of points total
		page.setColor(color);
		page.fillPolygon(xPoints, yPoints, nPoints);
	}
}
