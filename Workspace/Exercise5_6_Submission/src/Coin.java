// import java.util.Scanner;

public class Coin implements Lockable {
	private final int HEADS = 0;
	// private final int TAILS = 1;
	private int face;
	private static int passwd;
	// private static Scanner sc = new Scanner(System.in);

	public static boolean locked;

	public static void main(String[] args) {

	}

	public void setKey(int input) throws Exception {
		passwd = input;
		lock(input);
		locked = true;
	}

	public void unlock(int attempt) throws Exception {
		if (locked == true) {
			if (attempt == passwd) {
				locked = false;
				System.out.println("Unlocked");
				return;
			} else
				throw new Exception();
		}
	}

	public void lock(int attempt) throws Exception {
		if (attempt == passwd) {
			locked = true;
			System.out.println("Locked");
			return;
		} else
			throw new Exception();
	}

	public boolean locked() {
		return locked;
	}

	public Coin() throws Exception {
		flip();
		// lock(a);
	}

	public void flip() {
		if (!locked) {
			face = (int) (Math.random() * 2);
			/* System.out.print(face); */
		} else
			System.exit(0);
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
