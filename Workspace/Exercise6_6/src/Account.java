import java.text.NumberFormat;
import java.util.ArrayList;

public class Account {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();

	private final double RATE = 0.03;
	private static double fee = 2.00;

	// private int[] acctNumbers = new int[30];
	// private double[] balances = new double[30];
	// private String[] names = new String[30];

	ArrayList<Integer> acctNumbers = new ArrayList<Integer>(30);
	ArrayList<String> names = new ArrayList<String>(30);
	ArrayList<Double> balances = new ArrayList<Double>(30);

	public Account(String owner, double initial) {
		names.add(owner); // [account] = owner;
		acctNumbers.add(names.indexOf(owner)); // [account] = account;
		balances.add(names.indexOf(owner), initial); // [account] = initial;
	}

	public double deposit(double amount, String holdername) {
		int account = names.indexOf(holdername);
		if (amount < 0 || amount <= fee) {
			System.out.println("\n");
			System.out.println("Error: Deposit amount is invalid.");
			System.out.println(acctNumbers.get(account) + " " + fmt.format(amount));
		} else {
			balances.add(account, amount); // [account] = balances[account] + amount;
		}
		addInterest(holdername);
		return balances.get(account); // [account];
	}

	public double withdraw(double amount, String holdername) {
		amount += fee;
		int account = names.indexOf(holdername);

		if (amount < 0) {
			System.out.println("\n");
			System.out.println("Error: Withdraw amount is invalid.");
			System.out.println("Account: " + acctNumbers.get(account));
			System.out.println("Requested: " + fmt.format(amount));
		} else {
			if (amount > balances.get(account)) {
				System.out.println("\n");
				System.out.println("Error: Insufficient funds.");
				System.out.println("Account: " + acctNumbers.get(account));
				System.out.println("Requested: " + fmt.format(amount));
				System.out.println("Available: " + fmt.format(balances.get(account)));
			} else {
				balances.add(account, -(amount)); // [account] = balances[account] - amount;
			}
		}
		addInterest(holdername);
		return balances.get(account); // [account];
	}

	public double addInterest(String holdername) {
		int account = names.indexOf(holdername);
		balances.add(account, (balances.get(account) * RATE)); // [account] += (balances[account] * RATE);
		return balances.get(account); // [account];
	}

	public double getBalance(String holdername) {
		int account = names.indexOf(holdername);
		if (account != -1) {
			return balances.get(account);
		} else
			return 0;
	}

	public int getAccountNumber(String holderName) {
		/*
		 * int index = -1; for (int i = 0; i < names.length;i++) { if
		 * (names[i].equals(holderName)) { index = i; break; } }
		 */
		int a = names.indexOf(holderName);
		return acctNumbers.get(a); // [index];
	}

	public String toString(int account) {
		return (acctNumbers.get(account) + "\t" + names.get(account) + "\t" + fmt.format(balances.get(account)));
	}
}