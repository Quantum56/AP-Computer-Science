import java.util.Scanner;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class Lockable implements Comparable<Object> {
	private static String INPUT = "";
	private String passwd = "";
	private Scanner sc;
	private boolean locked;
	// private Object passwdObj = (String) passwd;

	public String setKey() {
		sc = new Scanner(System.in);
		System.out.println("Input original password: ");
		String input1 = sc.nextLine();
		System.out.println("Retype: ");
		String input2 = sc.nextLine();
		if (input1.compareTo(input2) == 0) {
			INPUT = input1;
		}
		passwd = INPUT;
		return INPUT;
	}

	public void unlock() throws Exception {
		System.out.println("Input password: ");
		String attempt = sc.nextLine();
		if (attempt.compareTo(passwd) == 0) {
			locked = false;
			return;
		} else
			throw new Exception();
	}
	
	public void lock() throws Exception {
		System.out.println("Press a key to unlock...");
		if (IsKeyPressed.isWPressed()) {
			System.out.println("Enter password: ");
			String attempt = sc.nextLine();
			if (attempt == passwd) {
				return;
			}
		} else
			throw new Exception();
		locked = true;
	}

	public boolean locked() {
		return locked;
	}
	
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
