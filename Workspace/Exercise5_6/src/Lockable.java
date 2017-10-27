/**
 * @author ZackB
 *
 */
public interface Lockable {
	
	void setKey(int input);

	void lock(int passwd) throws Exception;
	void unlock(int attempt) throws Exception;
	boolean locked();
	
/*	public static String INPUT = "";
	public String passwd = "";
	public Scanner sc = new Scanner(System.in);
	public boolean locked;
	// private Object passwdObj = (String) passwd;

	public static String setKey() {
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

	public static void unlock() throws Exception {
		System.out.println("Input password: ");
		String attempt = sc.nextLine();
		if (attempt.compareTo(passwd) == 0) {
			locked = false;
			return;
		} else
			throw new Exception();
	}
	
	public static void lock() throws Exception {
		System.out.println("Press a key to lock...");
		if (IsKeyPressed.isWPressed()) {
			System.out.println("Enter password to lock: ");
			String attempt = sc.nextLine();
			if (attempt == passwd) {
				return;
			}
		} else
			throw new Exception();
		locked = true;
	}

	public static boolean locked() {
		return locked;
	}
	*/
}
