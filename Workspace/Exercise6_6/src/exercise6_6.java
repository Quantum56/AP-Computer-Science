import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class exercise6_6 {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> accountNumbers = new ArrayList<Integer>();
		ArrayList<String> holders = new ArrayList<String>();
		ArrayList<Double> balances = new ArrayList<Double>();
		System.out.println("Create a new account? (Y/N)");
		String a = sc.next();
		if (a == "Y" || a == "y") {
			System.out.println("Input account holders name: ");
			String name = sc.nextLine();
			System.out.println("Input desired account number: ");
			int acctnum = sc.nextInt();
			System.out.println("Input initial deposit: ");
			double initial = sc.nextDouble();
			Account 
		} else
			System.exit(0);
	}

}
