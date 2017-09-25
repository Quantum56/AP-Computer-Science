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
		int count;
		System.out.printf("Enter an integer (enter 0 to quit): \n");
		count = sc.nextInt();
		final int LIMIT = count;
		for (count = 1; count <= LIMIT; count++) {
			System.out.println(count);
			// The program currently reads each number from 0 to its limit
		}
	}

}
