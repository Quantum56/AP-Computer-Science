import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class exercise6_4 {

	private static Scanner sc;
	private static String a;
	private static String b;
	private static String c;
	private static String d;
	private static String e;
	private static String f;
	private static String g;
	private static String h;
	private static String j;
	private static String k;
	private static int x;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[100];
		int[] count = new int[100];
		int i = 0, temp = 0;
		int again;
		String z;
		/*
		 * for (i = 0; i < num.length; i++) {
		 * System.out.println("Enter integers between 1 and 100 (0 to quit): "); num[i]
		 * = sc.nextInt(); if (num[i] == 0) { break; } }
		 * 
		 * for (i = 0; i < num.length; i++) { temp = num[i]; count[temp]++; }
		 */
		do {
			z = JOptionPane.showInputDialog("Input integer (1-100) (0 to quit)");
			x = Integer.parseInt(z);
			x = num[i];
			again = JOptionPane.showConfirmDialog(null, "Input another value?");
			i++;
		} while (again == JOptionPane.YES_OPTION);
		for (int l = 0; l < num.length; l++) {
			int firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			if (firstDigit == 1 || num[l] == 10) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 10) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 1 || num[l] == 10) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 20) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 2 || num[l] == 30) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 30) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 3 || num[l] == 40) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 40) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 4 || num[l] == 50) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 50) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 5 || num[l] == 60) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 60) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 6 || num[l] == 70) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 70) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 7 || num[l] == 80) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 80) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 8 || num[l] == 90) {
				a += "*";
			}
		}
		for (int l = 0; l < num.length; l++) {
			int firstDigit = 0;
			if (num[l] != 90) {
				firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			}
			if (firstDigit == 9 || num[l] == 100) {
				a += "*";
			}
		}
		System.out.println("Chart of Integer Ranges");
		System.out.println("1  - 10  | " + a);
		System.out.println("11 - 20  | " + b);
		System.out.println("21 - 30  | " + c);
		System.out.println("31 - 40  | " + d);
		System.out.println("41 - 50  | " + e);
		System.out.println("51 - 60  | " + f);
		System.out.println("61 - 70  | " + g);
		System.out.println("71 - 80  | " + h);
		System.out.println("81 - 90  | " + k);
		System.out.println("91 - 100 | " + j);
	}
}
