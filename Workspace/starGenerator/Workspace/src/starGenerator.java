import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import src.sl.shapes.StarPolygon;;

/**
 * @author ZackB
 *
 */
public class starGenerator extends Applet {
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
			int x = gen.nextInt((MAX_X - 50)) + 1;
			int y = gen.nextInt((MAX_Y - 50)) + 1;
			int r = gen.nextInt(50) + 11;
			int innerR = r - 30;
			drawStar(x, y, r, innerR, page);
		}
	}
	
	public void drawStar(int x, int y, int r1, int innerR, Graphics page) {
		int startAngle = gen.nextInt(360) + 1;
		int vertexCount = 5;
		StarPolygon a = new StarPolygon(x, y, r1, innerR, vertexCount, startAngle);
		int r = gen.nextInt(255) + 1;
		int g = gen.nextInt(255) + 1;
		int b = gen.nextInt(255) + 1;
		Color color = new Color(r, g, b);
		page.setColor(color);
		page.fillPolygon(a);
	}
}