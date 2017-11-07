
//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class exercise6_4 {

	// private static Scanner sc;
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
	private static Integer integer;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[100];
		// int[] count = new int[100];
		int i = 0; // temp = 0;
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
			int x;
			z = JOptionPane.showInputDialog("Input integer (1-100) (0 to quit)");
			// System.out.println(z);
			x = Integer.parseInt(z);
			num[i] = x;
			System.out.println(x);
			again = JOptionPane.showConfirmDialog(null, "Input another value?");
			i++;
		} while (again == JOptionPane.YES_OPTION);

		for (int l = 0; l < num.length; l++) {
			int firstDigit = Integer.parseInt(Integer.toString(num[l]).substring(0, 1));
			if (firstDigit == 0 || num[l] == 10) {
				a += "*";
			}
		}
		for (int l1 = 0; l1 < num.length; l1++) {
			int firstDigit1 = 0;
			if (num[l1] != 10) {
				firstDigit1 = Integer.parseInt(Integer.toString(num[l1]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit1 = integer;
			}
			if (firstDigit1 == 1 || num[l1] == 10) {
				b += "*";
			}
		}
		for (int l2 = 0; l2 < num.length; l2++) {
			int firstDigit2 = 0;
			if (num[l2] != 20) {
				firstDigit2 = Integer.parseInt(Integer.toString(num[l2]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit2 = integer;
			}
			if (firstDigit2 == 2 || num[l2] == 30) {
				c += "*";
			}
		}
		for (int l3 = 0; l3 < num.length; l3++) {
			int firstDigit3 = 0;
			if (num[l3] != 30) {
				firstDigit3 = Integer.parseInt(Integer.toString(num[l3]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit3 = integer;
			}
			if (firstDigit3 == 3 || num[l3] == 40) {
				d += "*";
			}
		}
		for (int l4 = 0; l4 < num.length; l4++) {
			int firstDigit4;
			if (num[l4] != 40) {
				firstDigit4 = Integer.parseInt(Integer.toString(num[l4]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit4 = integer;
				if (firstDigit4 == 4 || num[l4] == 50) {
					e += "*";
				}
			}
		}
		for (int l5 = 0; l5 < num.length; l5++) {
			int firstDigit5;
			if (num[l5] != 40) {
				firstDigit5 = Integer.parseInt(Integer.toString(num[l5]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit5 = integer;
				if (firstDigit5 == 4 || num[l5] == 50) {
					e += "*";
				}
			}
		}
		for (int l6 = 0; l6 < num.length; l6++) {
			int firstDigit6 = 0;
			if (num[l6] != 60) {
				firstDigit6 = Integer.parseInt(Integer.toString(num[l6]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit6 = integer;
			}
			if (firstDigit6 == 6 || num[l6] == 70) {
				g += "*";
			}
		}
		for (int l7 = 0; l7 < num.length; l7++) {
			int firstDigit7 = 0;
			if (num[l7] != 70) {
				firstDigit7 = Integer.parseInt(Integer.toString(num[l7]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit7 = integer;
			}
			if (firstDigit7 == 7 || num[l7] == 80) {
				h += "*";
			}
		}
		for (int l8 = 0; l8 < num.length; l8++) {
			int firstDigit8 = 0;
			if (num[l8] != 80) {
				firstDigit8 = Integer.parseInt(Integer.toString(num[l8]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit8 = integer;
			}
			if (firstDigit8 == 8 || num[l8] == 90) {
				k += "*";
			}
		}
		for (int l9 = 0; l9 < num.length; l9++) {
			int firstDigit9 = 0;
			if (num[l9] != 90) {
				firstDigit9 = Integer.parseInt(Integer.toString(num[l9]).substring(0, 1));
			} else {
				integer = (Integer) null;
				firstDigit9 = integer;
			}
			if (firstDigit9 == 9 || num[l9] == 100) {
				j += "*";
			}
		}
		System.out.println("Chart of Integer Ranges");
		System.out.println("1  - 10  |  " + a);
		System.out.println("11 - 20  |  " + b);
		System.out.println("21 - 30  |  " + c);
		System.out.println("31 - 40  |  " + d);
		System.out.println("41 - 50  |  " + e);
		System.out.println("51 - 60  |  " + f);
		System.out.println("61 - 70  |  " + g);
		System.out.println("71 - 80  |  " + h);
		System.out.println("81 - 90  |  " + k);
		System.out.println("91 - 100 |  " + j);
	}
}
