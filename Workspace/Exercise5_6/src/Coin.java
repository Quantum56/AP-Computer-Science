// import java.util.Scanner;

public class Coin implements Lockable {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
//	public static int INPUT;
	public static int passwd;
//	private static Scanner sc = new Scanner(System.in);
	public static boolean locked;
	// private Object passwdObj = (String) passwd;

	public void setKey(int input) {
		// System.out.println("Input original password: ");
		// int input1 = sc.nextInt();
		// System.out.println("Retype: ");
		// int input2 = sc.nextInt();
		// if (input1 == input2) {
		// INPUT = input1;
		// }
		passwd = input;
	}

	public void unlock(int attempt) throws Exception {
		// System.out.println("Input password: ");
		// int attempt = sc.nextInt();
		if (attempt == passwd) {
			locked = false;
			return;
		} else
			throw new Exception();
	}

	public void lock(int attempt) throws Exception {
		System.out.println("Press a key to lock...");
		if (IsKeyPressed.isWPressed()) {
			// System.out.println("Enter password to lock: ");
			// int attempt = sc.nextInt();
			if (attempt == passwd) {
				locked = true;
				return;
			}
		} else
			throw new Exception();
	}

	public boolean locked() {
		return locked;
	}

	public Coin() {
		flip();
	}

	public void flip() {
		face = (int) (Math.random() * 2);
	}

	public boolean isHeads() {
		return (face == HEADS);
	}

	public String toString() {
		String faceName;
		if (face == HEADS) {
			faceName = "Heads";
		} else
			faceName = "Tails";
		return faceName;
	}

}
