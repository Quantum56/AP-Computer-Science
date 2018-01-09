import java.util.Scanner;

/**
 * @author ZackB
 *
 */

public class PascalTriangle_Original {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print:");
		int rows = sc.nextInt();
		System.out.println("Pascal Triangle:");
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < rows - i; k++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
		sc.close(); // needed to close variable, prevents getter / setter as used before
	}
}