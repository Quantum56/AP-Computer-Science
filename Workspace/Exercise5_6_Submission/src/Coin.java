import java.util.Random;
import java.util.Scanner;

public class Coin implements Lockable {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
	private static int passwd;
	private static Scanner sc = new Scanner(System.in);
	private static Random gen = new Random();
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
				return;
			} else
				throw new Exception();
		}
	}

	public void lock(int attempt) throws Exception {
			if (attempt == passwd) {
				locked = true;
				return;
			} else
			throw new Exception();
	}

	public boolean locked() {
		return locked;
	}

	public Coin() throws Exception {
		System.out.println("Set key: ");
		int a = sc.nextInt();
		setKey(a);
		unlock(a);
		flip();
		lock(a);
	}

	public void flip() {
		face = (int) (gen.nextInt() * 2);
/*		System.out.print(face); */
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
