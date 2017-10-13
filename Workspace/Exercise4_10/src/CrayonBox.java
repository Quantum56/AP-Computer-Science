/*
 * A java Applet that draws a box of Crayons
 */

/**
 * @author ZackB
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CrayonBox extends Applet {
	private static final long serialVersionUID = 1L;
	private final int APPLET_WIDTH = 800;
	private final int APPLET_HEIGHT = 600;
	private final int CRAYON_START = 200;
	private final int CRAYON_SPACE = 35;

	/**
	 * @param page
	 */
	public void paint(Graphics page) {
		// TODO Auto-generated method stub
		Crayon crayonC = new Crayon(Color.cyan, 80, CRAYON_START);
		Crayon crayonB = new Crayon(Color.blue, 75, CRAYON_START + CRAYON_SPACE);
		Crayon crayonG = new Crayon(Color.gray, 80, CRAYON_START + 2 * CRAYON_SPACE);
		Crayon crayonGr = new Crayon(Color.green, 70, CRAYON_START + 3 * CRAYON_SPACE);
		Crayon crayonM = new Crayon(Color.magenta, 80, CRAYON_START + 4 * CRAYON_SPACE);
		Crayon crayonO = new Crayon(Color.orange, 70, CRAYON_START + 5 * CRAYON_SPACE);
		Crayon crayonP = new Crayon(Color.pink, 80, CRAYON_START + 6 * CRAYON_SPACE);
		Crayon crayonR = new Crayon(Color.red, 75, CRAYON_START + 7 * CRAYON_SPACE);
		// need to find a way to automate this declaration process
		setBackground(Color.black);
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		crayonC.draw(page);
		crayonB.draw(page);
		crayonG.draw(page);
		crayonGr.draw(page);
		crayonM.draw(page);
		crayonO.draw(page);
		crayonP.draw(page);
		crayonR.draw(page);
		page.setColor(Color.yellow);
		page.fillRect(195, 120, 285, 120);
		page.setColor(Color.black);
		page.drawString("Crayola", 325, 175);
	}
}