
/**
 * @author ZackB
 *  Java program to draw a Koch Snowflake (triangle version)
 */
import java.awt.*;
import javax.swing.*;

public class FractalGen0 extends JApplet {
	private static final long serialVersionUID = 1L;
	private static double sinAngle = Math.sin(60 * (Math.PI / 180)); // -0.866025403784438646763723170752936183471402626905190 = actual value (significant)
	int level = 0;

	public void init() {
		setSize(800, 600);
		this.setBackground(Color.BLACK);
		String levelStr = JOptionPane.showInputDialog("Enter the recursion depth: ");
		int angle = Integer.parseInt(JOptionPane.showInputDialog("Enter angle in degrees (forms unique snowflake generation): "));
		sinAngle = Math.sin(angle * (Math.PI / 180));
		level = Integer.parseInt(levelStr);
	}

	public void paint(Graphics page) {
		Point pointOne = new Point(120, 320);
		Point pointTwo = new Point(440, 320); // reusing Points from java sample recursion
		Point pointThree = new Point(280, 40);

		drawSnowflake(page, level, pointOne, pointTwo, pointThree);
	}

	private void drawSnowflake(Graphics page, int level, Point p1, Point p2, Point p3) {
		drawSegment(page, level, p1, p2); // draw 3 lines to make a triangle
		drawSegment(page, level, p2, p3);
		drawSegment(page, level, p3, p1);
		drawSegment(page, level, p3, p1);
	}

	private void drawSegment(Graphics page, int level, Point pOne, Point pTwo) {
		if (level == 0) {
			page.drawLine(pOne.x, pOne.y, pTwo.x, pTwo.y);
		}
		if (level >= 1) {
			Point distance = new Point((pTwo.x - pOne.x) / 3, (pTwo.y - pOne.y) / 3);
			Point pA = new Point(pOne.x + distance.x, pOne.y + distance.y);
			Point pB = new Point(pTwo.x - distance.x, pTwo.y - distance.y);
			Point pTip = new Point(pA.x + (int) (distance.x * 0.5 + distance.y * sinAngle), pA.y + (int) (distance.y * 0.5 - distance.x * sinAngle));
			drawSegment(page, level - 1, pOne, pA); // if level 1 or higher, invokes self 4 times
			drawSegment(page, level - 1, pA, pTip);
			drawSegment(page, level - 1, pTip, pB);
			drawSegment(page, level - 1, pB, pTwo);
		}
	}
}