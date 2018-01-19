import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise9_5 {

	/**
	 * @param args
	 */

	private static boolean run = false;
	private static Scanner sc = new Scanner(System.in);
	private static Customer main = new Customer();
	private static Random gen = new Random();

	public static void main(String[] args) throws InterruptedException {
		do {
			String name;
			int value = 0, time = 0;
			System.out.println("Enter the customer's name: ");
			name = sc.nextLine();
			System.out.println("Enter the customer's payment");
			value = sc.nextInt();
			System.out.println("Enter the showtime: ");
			time = sc.nextInt();
			new Customer(name, value, time);
			System.out.println("Add a new customer? (y/n)");
			String input = sc.nextLine();
			sc.nextLine();
			if (input == "y" || input == "Y") {
				run = true;
			} else {
				run = false;
			}
		} while (run != false && main.isReady());
		for (int i = 0; i < main.queueSize(); i++) {
			System.out.println("Customer " + main.getCustomerName() + "is done paying.");
			main.remove();
		}
	}

	private static class Customer {
		private int currentTime = 1;
		Queue<Object> customerList = new LinkedList<Object>();

		public Customer(String name, int value, int timeThreshold) throws InterruptedException {
			currentTime = timeThreshold;
			Thread.sleep((gen.nextInt(value) + 1));
			customerList.add(this);
		}

		public Customer() {
			customerList.poll();
		}

		public Object remove() throws InterruptedException {
			Thread.sleep(currentTime);
			return customerList.remove();
		}

		public boolean isReady() {
			try {
				Thread.sleep(currentTime);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return false;
			}
			return true;
		}

		public String getCustomerName() {
			return customerList.peek().toString().replaceAll("[^a-zA-Z]", "");
		}

		public int queueSize() {
			return customerList.size();
		}
	}
}
