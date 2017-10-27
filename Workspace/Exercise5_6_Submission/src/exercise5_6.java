import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise5_6 {

	private static Coin a;
	private static int b;
	private static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		a = new Coin();
		System.out.println("Set key: ");
		b = sc.nextInt();
		a.setKey(b);
		a.unlock(b);
		System.out.println("Input number of flips: ");
		for (int i = 0; i < b; i++) {
			System.out.println("Input code to unlock: ");
			a.unlock(sc.nextInt());
			a.flip();
			System.out.println("Coin is: " + a);
			System.out.println("Input code to lock: ");
			a.lock(sc.nextInt());
		}
		a.lock(b);
	}

}
