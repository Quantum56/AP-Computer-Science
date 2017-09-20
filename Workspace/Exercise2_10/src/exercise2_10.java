
/**
 * @author ZackB
 *
 */

import java.util.Scanner;
import java.lang.Math; // is this line needed?

public class exercise2_10 {

	private static String message;
	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Heron's Formula Calculator - Press enter to initialize");
		System.out.println("-------------------------------------------------------");
		setMessage(sc.nextLine());

		double a;
		System.out.printf("Enter first length: ");
		a = sc.nextInt();

		double b;
		System.out.printf("Enter second length: ");
		b = sc.nextInt();

		double c;
		System.out.printf("Enter third length: ");
		c = sc.nextInt();

		double s;
		s = ((a + b + c) / 2);

		double z = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		Math.round((z * 1.000) / 1.000); // attempt to round to 3 decimals
		System.out.printf("The area of the triangle is " + z);
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		exercise2_10.message = message;
	}

}