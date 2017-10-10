import java.util.Random;

/**
 *  Application that prints 20 random cards ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king
 */

/**
 * @author ZackB
 *
 */
public class exercise4_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		final int x = 20;
		int a;
		for (int i = 0; i < x; i++) {
			a = gen.nextInt(13) + 1;
			int c = gen.nextInt(4) + 1;
			String str = "";
			String d = "";
			if (a > 2 && a <= 10) {
				if (c == 1) {
					d = "Spades";
				}
				if (c == 2) {
					d = "Clubs";
				}
				if (c == 3) {
					d = "Hearts";
				}
				if (c == 4) {
					d = "Diamonds";
				}
				// System.out.print(a);
				// System.out.print(" of ");
				// System.out.println(d);
				System.out.format("%d of %s\n", a, d);
			} else {
				if (c == 1) {
					d = "Spades";
				}
				if (c == 2) {
					d = "Clubs";
				}
				if (c == 3) {
					d = "Hearts";
				}
				if (c == 4) {
					d = "Diamonds";
				}
				if (c == 1) {
					d = "Spades";
				} else if (c == 2) {
					d = "Clubs";
				} else if (c == 3) {
					d = "Hearts";
				} else if (c == 4) {
					d = "Diamonds";
				}
				if (a == 1) {
					str = "Ace";
					// System.out.print(str);
				} else if (a == 11) {
					str = "Jack";
					// System.out.print(str);
				} else if (a == 12) {
					str = "Queen";
					// System.out.print(str);
				} else if (a == 13) {
					str = "King";
					// System.out.print(str);
				}
				// System.out.print(str);
				// System.out.print(" of ");
				// System.out.println(d);
				System.out.format("%s of %s\n", str, d);
			}

		}
	}
}