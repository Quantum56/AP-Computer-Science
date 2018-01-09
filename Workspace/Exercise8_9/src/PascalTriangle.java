import java.util.Scanner;

/**
 * @author ZackB
 *
 */

class PascalTriangle {
	private static Scanner sc = new Scanner(System.in);
	private static int triGen(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			int num = (triGen(n - 1, k - 1) + triGen(n - 1, k)); // recursion to generate numbers
			return num;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of rows to print: ");
		int num0 = sc.nextInt();
		System.out.println("Pascal's Triangle");
		sc.close(); // Eliminates use of getter / setter of scanner
		// Prints space before number
		for (int i = 0; i < num0; i++) {
			for (int x = 0; x < (num0 - i); x++) {
				System.out.print(" ");
			}
			// Prints number and space
			for (int y = 0; y <= i; y++) {
				int num1 = triGen(i, y);
				System.out.print(num1 + " ");
			}
			System.out.println();
		}
	}
}