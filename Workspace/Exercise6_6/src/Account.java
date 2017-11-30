import java.text.NumberFormat;
import java.util.ArrayList;

public class Account {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private final double RATE = 0.03;
	
//	private int[] acctNumbers = new int[30];
//	private double[] balances = new double[30];
//	private String[] names = new String[30];
	
	ArrayList<Integer> acctNumbers = new ArrayList<Integer>();
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<Double> balances = new ArrayList<Double>();
	
	public Account(String owner, int account, double initial) {
		names[account] = owner;
		acctNumbers[account] = account;
		balances[account] = initial;
	}
	
	public double deposit(double amount, int account) {
		if (amount < 0) {
			System.out.println("\n");
			System.out.println("Error: Deposit amount is invalid.");
			System.out.println(acctNumbers[account] + " " + fmt.format(amount));
		}
		else {
			balances[account] = balances[account] + amount;
		}
		addInterest(account);
		return balances[account];
	}
	
	public double withdraw(double amount, double fee, int account) {
		amount += fee;
		
		if (amount < 0) {
			System.out.println("\n");
			System.out.println("Error: Withdraw amount is invalid.");
			System.out.println("Account: " + acctNumbers[account]);
			System.out.println("Requested: " + fmt.format(amount));
		} else {
			if (amount > balances[account]) {
				System.out.println("\n");
				System.out.println("Error: Insufficient funds.");
				System.out.println("Account: " + acctNumbers[account]);
				System.out.println("Requested: " + fmt.format(amount));
				System.out.println("Available: " + fmt.format(balances[account]));
			} else {
				balances[account] = balances[account] - amount;
			}
		}
		addInterest(account);
		return balances[account];
	}
	
	public double addInterest(int account) {
		balances[account] += (balances[account] * RATE);
		return balances[account];
	}
	
	public double getBalance(int account) {
		return balances[account];
	}
	
	public int getAccountNumber(String holderName) {
		int index = -1;
		for (int i = 0; i < names.length;i++) {
		    if (names[i].equals(holderName)) {
		        index = i;
		        break;
		    }
		}
		return acctNumbers[index];
	}
	
	public String toString(int account) {
		return (acctNumbers[account] + "\t" + names[account] + "\t" + fmt.format(balances[account]));
	}
}
