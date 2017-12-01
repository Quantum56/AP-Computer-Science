import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise6_6 {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	public static Account s;
	private static String exit = "Y";
	private static DecimalFormat fmt = new DecimalFormat("#.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create a new account? (Y/N)");
		String z = sc.nextLine();
		if (z.equals("Y") || z.equals("y")) {
			System.out.println("Input account holders name: ");
			String name = sc.nextLine();
			System.out.println("Input initial deposit: ");
			double initial = sc.nextDouble();
			System.out.println("Input desired account number: ");
			int accountNum = sc.nextInt();
			s = new Account(name, initial, accountNum);
		} else {
			System.exit(0);
		}

		do {
			System.out.println("Enter account number: ");
			int acctNumber = sc.nextInt();
			System.out.println("Welcome " + s.getAccountName(acctNumber) + ". ");
			System.out.println("Type '1' for holder's name, '2' for balance, '3' for deposit, and '4' for withdrawal. (5 to quit) ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("Input account number: ");
				int acctNum = sc.nextInt();
				String a = s.getAccountName(acctNum);
				System.out.println(a + " is the holder's name.");
				System.out.println("Return to menu? (Y/N)");
				exit = sc.nextLine();
				continue;
			} else if (input == 2) {
				System.out.println("Input account number: ");
				int acctNum = sc.nextInt();
				double a = s.getBalance(acctNum);
				System.out.println("Balance: " + fmt.format(a) + "$");
				System.out.println("Return to menu? (Y/N)");
				exit = sc.nextLine();
				continue;
			} else if (input == 3) {
				System.out.println("Input account number: ");
				int acctNum = sc.nextInt();
				System.out.println("Input deposit (must be over $2.00): ");
				double amount = sc.nextDouble();
				double a = s.deposit(amount, acctNum);
				System.out.println(fmt.format(a) + " is the account's current balance.");
				System.out.println("Return to menu? (Y/N)");
				exit = sc.nextLine();
				continue;
			} else if (input == 4) {
				System.out.println("Input account number: ");
				int acctNum = sc.nextInt();
				System.out.println("Input withdrawal: ");
				double amount = sc.nextDouble();
				double a = s.withdraw(amount, acctNum);
				System.out.println(fmt.format(a) + " is the account's current balance.");
				System.out.println("Return to menu? (Y/N)");
				exit = sc.nextLine();
				continue;
			} else if (input == 5) {
				System.exit(0);
			} else
				System.exit(0);
		} while (exit == "y" || exit == "Y");
		// System.out.println("Loop done.");
	}
}
