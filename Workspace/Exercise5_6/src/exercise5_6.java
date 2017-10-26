import java.util.Scanner;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class exercise5_6 {

	private static String attempt = "";
	private static Scanner sc;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setSc(new Scanner(System.in));
		System.out.println("Input password");
		attempt = sc.nextLine();
		
	}
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		exercise5_6.sc = sc;
	}

}
