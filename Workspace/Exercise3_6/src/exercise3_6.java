/**
 * Work on an integer parser that reads number of odd, even and 0 digits.
 */

/**
 * @author ZackB
 *
 */

import java.util.Scanner;

public class exercise3_6 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num, EvenCount = 0, OddCount = 0, ZeroCount;
		System.out.printf("Enter an integer (enter 0 to quit): \n");
		num = sc.nextInt();
		final int LIMIT = num - 1;
		for (num = 1; num <= LIMIT;) {
			System.out.println(num);
		/*while(num != 0)
			while(num % 2 == 0) {
			EvenCount++;
			}
			while(num % 2 == 0) {
			OddCount++;
			} */
			String number = String.valueOf(num);

			char[] digits1 = number.toCharArray();
			// or:
			String[] digits2 = number.split("(?<=.)");
			System.out.print(digits1);
			// The program currently reads each number from 0 to its limit
		}
	}

}
