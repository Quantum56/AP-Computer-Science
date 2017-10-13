import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class test extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics page) {
		// TODO Auto-generated method stub
		int color = 2;
		int height = 200;
		this.setSize(800, 600);
		int MAX_X = 800, MAX_Y = 600;
		page.fillRect(100, 100, 20, height);
		for (int i = 0; i < 13; i++) {
			i = color;
			if (color == 1) {
				page.setColor(Color.black);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 2) {
				page.setColor(Color.yellow);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 3) {
				page.setColor(Color.red);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 4) {
				page.setColor(Color.pink);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 5) {
				page.setColor(Color.orange);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 6) {
				page.setColor(Color.magenta);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 7) {
				page.setColor(Color.lightGray);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 8) {
				page.setColor(Color.green);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 9) {
				page.setColor(Color.gray);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 10) {
				page.setColor(Color.darkGray);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 11) {
				page.setColor(Color.cyan);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}
			if (color == 12) {
				page.setColor(Color.blue);
				page.fillRect(MAX_X - 600, MAX_Y - 450, 20, 100);
			}

		}
	}

}
