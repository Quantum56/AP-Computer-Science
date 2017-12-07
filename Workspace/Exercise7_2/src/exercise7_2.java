import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise7_2 {
	private static Scanner sc = new Scanner(System.in);
	private static Object[] doctorInfo, nurseInfo, administratorInfo, surgeonInfo, receptionistInfo, janitorInfo;
	private static String exit = "Y";
	private static String doctorName;
	private static String nurseName;
	private static String administratorName;
	private static String surgeonName;
	private static String receptionistName;
	private static String janitorName;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter name of hospital");
			String name0 = sc.nextLine();
			System.out.println("Enter doctor's name: ");
			doctorName = sc.nextLine();
			doctorInfo[1] = doctorName;
			System.out.println("Enter doctor's appointment time: ");
			doctorInfo[2] = sc.nextInt();

			System.out.println("Enter nurse's name: ");
			nurseName = sc.nextLine();
			nurseInfo[1] = nurseName;
			System.out.println("Enter nurse's appointment time: ");
			nurseInfo[2] = sc.nextInt();

			System.out.println("Enter administrator's name: ");
			administratorName = sc.nextLine();
			administratorInfo[1] = administratorName;
			System.out.println("Enter administrator's appointment time: ");
			administratorInfo[2] = sc.nextInt();

			System.out.println("Enter surgeon's name: ");
			surgeonName = sc.nextLine();
			surgeonInfo[1] = surgeonName;
			System.out.println("Enter surgeon's appointment time: ");
			surgeonInfo[2] = sc.nextInt();

			System.out.println("Enter receptionist's name: ");
			receptionistName = sc.nextLine();
			receptionistInfo[1] = receptionistName;
			System.out.println("Enter receptionist's appointment time: ");
			receptionistInfo[2] = sc.nextInt();

			System.out.println("Enter doctor's name: ");
			janitorName = sc.nextLine();
			janitorInfo[1] = janitorName;

			new Hospital(doctorInfo, nurseInfo, administratorInfo, surgeonInfo, receptionistInfo, janitorInfo, name0);
			System.out.println("Add more people? (y/n)");
			exit = sc.nextLine();
		} while (exit != "n" || exit != "N");
	}

}
