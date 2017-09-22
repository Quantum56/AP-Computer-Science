/**
 * Programming project 3.2
 */

/**
 * @author ZackB
 *
 */

import java.util.Scanner;

public class exercise3_2 {
	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Leap year calculator");
		int year;
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		Start:
		// TODO Auto-generated method stub
		if ((year % 4 == 0) || (year % 100 != 0) && (year % 400 == 0)) {
			System.out.format("\n %d IS a leap year\n", year);
			break Start;
		}

		else {
			System.out.format("\n %d is NOT a leap year", year);
		}
	}
}