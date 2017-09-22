
/**
 *  A simple random phone number generator with certain restrictions.
 *  Comments are from debugged code that had to be left out, but shows the attempts to limit 742. 
 */

import java.util.Random;

/**
 * @author ZackB
 *
 */
public class exercise2_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int a, b, c, d, e, f, g, h, i, j, k, z;
		a = generator.nextInt(8) + 0;
		b = generator.nextInt(8) + 0;
		c = generator.nextInt(8) + 0;
		// start:
		do {
			d = generator.nextInt(8) + 0;
			e = generator.nextInt(10) + 0;
			f = generator.nextInt(10) + 0;
			g = ((d * 100) + (e * 10) + f);
			final int v = g;
			// check:
			if (/* v < 0 || v > 742 */ v >= 742) {
				// System.out.printf("Incorrect Generation\n" + g);
				d = d - 1;
				continue;
				// break check;
			}
		} while (false);
		{
			h = generator.nextInt(10) + 0;
			i = generator.nextInt(10) + 0;
			j = generator.nextInt(10) + 0;
			k = generator.nextInt(10) + 0;
			z = ((h * 1000) + (i * 100) + (j * 10) + k);
			System.out.printf("Telephone " + a + b + c + "-" + d + e + f + "-" + z);
		}
	}

}