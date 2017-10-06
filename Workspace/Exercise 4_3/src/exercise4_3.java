import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise4_3 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter number of sides of die: ");
		int a = sc.nextInt();
		Die die1 = new Die(a);
		int b = die1.roll();
		System.out.println(b);
	}

}
