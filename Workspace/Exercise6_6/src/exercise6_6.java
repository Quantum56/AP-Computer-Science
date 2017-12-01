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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> accountNumbers = new ArrayList<Integer>();
		// ArrayList<String> holders = new ArrayList<String>();
		// ArrayList<Double> balances = new ArrayList<Double>();
		System.out.println("Create a new account? (Y/N)");
		String a = sc.next();
		if (a == "Y" || a == "y") {
			System.out.println("Input account holders name: ");
			String name = sc.nextLine();
			System.out.println("Input initial deposit: ");
			double initial = sc.nextDouble();
			Account s = new Account(name, initial);

			System.out.println(
					"Type 'a' for account number, 'b' for balance, 'd' for deposit, and 'w' for withdrawal. (q to quit) ");
			String input = sc.nextLine();
			if (input == "a") {
				System.out.println("Input account holder's name: ");
				String holdername = sc.nextLine();
				s.getAccountNumber(holdername);
			} else if (input == "b") {
				System.out.println("Input account holder's name: ");
				String holdername = sc.nextLine();
				s.getBalance(holdername);
			} else if (input == "d") {
				System.out.println("Input account holder's name: ");
				String holdername = sc.nextLine();
				System.out.println("Input deposit (must be over $2.00): ");
				double amount = sc.nextDouble();
				s.deposit(amount, holdername);
			} else if (input == "w") {
				System.out.println("Input account holder's name: ");
				String holdername = sc.nextLine();
				System.out.println("Input withdrawal: ");
				double amount = sc.nextDouble();
				s.withdraw(amount, holdername);
			} else if (input == "q")
				System.exit(0);

		} else
			System.exit(0);
	}

}