
/**
 *  A simple random phone number generator with certain restrictions.
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
		int a, b, c, d, e, f, y, z;
		// x = generator.nextInt(999) + 001; // limitation on 9 and 8
		a = generator.nextInt(8) + 0;
		b = generator.nextInt(8) + 0;
		c = generator.nextInt(8) + 0;
		d = generator.nextInt(8) + 0;
		e = generator.nextInt(10) + 0;
		f = generator.nextInt(10) + 0;
		if (d + e + f <= 742) {
		
				System.out.printf("Incorrect Generation");
			
		}
		number:
		y = generator.nextInt(742) + 001;
		z = generator.nextInt(9999) + 0001;
		System.out.printf("Telephone " + a + b + c + "-" + y + "-" + z);
	}

}
