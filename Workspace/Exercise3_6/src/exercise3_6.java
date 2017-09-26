/**
 * Work on an integer parser that reads number of odd, even and 0 digits.
 */

/**
 * @author ZackB
 *
 */

import java.util.Scanner;
import java.lang.Integer;

public class exercise3_6 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num, EvenCount = 0, OddCount = 0, ZeroCount = 0;
		System.out.printf("Enter an integer (enter 0 to quit): \n");
		num = sc.nextInt();
		final int LIMIT = num + 1;
		// for(num = 1; num <= LIMIT;) {
		System.out.println(num);
		String number = String.valueOf(num);
		char[] digits1 = number.toCharArray();
		// or:
		try {

			String[] digits2 = number.split("(?<=.)");
			System.out.println(digits1);
			String a = String.copyValueOf(digits1);
			if (num >= LIMIT)
				;
			int b = Integer.parseInt(a);

			for (int i = 0; i < digits2.length; i++) {
				if (b % 10 == 0)
					;
				EvenCount++;

				if (b % 10 != 0)
					;
				OddCount++;

				if (b <= 0)
					;
				ZeroCount++; // throws an exception

				if (EvenCount >= 0) {
					EvenCount = Math.abs(EvenCount);
				}
				if (OddCount >= 0) {
					OddCount = Math.abs(OddCount);
				}
				if (ZeroCount >= 0) {
					ZeroCount = Math.abs(ZeroCount);
				}
			}
		} catch (NumberFormatException nfe) {
			System.out.print("Number overflow exception! System break");
			System.exit(1);
		}
		;

		System.out.format("\nThe number contains %d even(s),", EvenCount);
		System.out.format("\n %d odd(s)", OddCount);
		System.out.format("\n and %d zero(s)", ZeroCount);
	}
	// The program currently reads each number from 0 to its limit
}