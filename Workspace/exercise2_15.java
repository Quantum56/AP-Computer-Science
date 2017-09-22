/**
 * 
 */

/**
 * @author student
 *
 */
import java.applet.Applet;
import java.awt.*;

public class exercise2_15 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public void paint(Graphics page) {
		// TODO Auto-generated method stub
		final int MID = 150;
		final int TOP = 50;

		char[] myString = new char[] { 'Z', 'a', 'c', 'k', ' ', 'B', 'a', 'r', 't', 'l', 'e', 'y' };
		setBackground(Color.cyan);

		page.setColor(Color.blue);
		page.fillRect(0, 175, 300, 50);

		page.setColor(Color.red);
		page.fillOval(MID, TOP + 43, 10, 10);
		page.fillOval(MID, TOP + 60, 10, 10);

		page.setColor(Color.yellow);
		page.fillOval(250, -40, 80, 80);

		// page.drawChars(Zack_Bartley, MID, TOP, 50, 10);

		page.setColor(Color.white);
		page.fillOval(MID, TOP, 40, 40);
		page.fillOval(MID - 15, TOP + 35, 70, 50);
		page.fillOval(MID - 30, TOP + 80, 100, 60);

		page.setColor(Color.red);
		page.fillOval(MID + 15, TOP + 43, 10, 10);
		page.fillOval(MID + 15, TOP + 60, 10, 10);

		page.setColor(Color.black);
		page.fillOval(MID + 10, TOP + 10, 5, 5);
		page.fillOval(MID + 25, TOP + 10, 5, 5);

		page.drawArc(MID + 10, TOP + 25, 20, 10, -190, -160); // maybe smile here

		page.drawLine(MID - 15, TOP + 60, MID - 50, TOP + 40); // left arm
		page.drawLine(MID + 45, TOP + 60, MID + 75, TOP + 80); // right arm

		page.drawLine(MID, TOP + 5, MID + 40, TOP + 5); // brim of hat
		page.fillRect(MID + 5, TOP - 20, 30, 25); // top of hat
		page.drawChars(myString, 20, 20, 100, 100);
		// page.drawChars(char[], MID, TOP, 50, 20);

	}

}
