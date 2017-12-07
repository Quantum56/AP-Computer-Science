import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class hospital {

	private static Scanner sc = new Scanner(System.in);
	private static DecimalFormat fmt = new DecimalFormat("##.##");
	
	
	private static ArrayList<String> doctors = new ArrayList<String>();
	private static ArrayList<String> nurses = new ArrayList<String>();
	private static ArrayList<String> administrators = new ArrayList<String>();
	private static ArrayList<String> surgeons = new ArrayList<String>();
	private static ArrayList<String> receptionists = new ArrayList<String>();
	private static ArrayList<String> janitors = new ArrayList<String>();
	private static ArrayList<Double> patientTimes = new ArrayList<Double>();

	public hospital(Object[] doctorInfo, Object[] nurseInfo, Object[] administratorInfo, Object[] surgeonInfo, Object[] receptionistInfo, Object[] janitorInfo) throws Exception {
		doctor(doctorInfo);
		nurse(nurseInfo);
		administrator(administratorInfo);
		surgeon(surgeonInfo);
		receptionist(receptionistInfo);
		janitor(janitorInfo);
	}

	public void doctor(Object[] doctorInfo) throws Exception {
		double time = 0;
		String name = (String) null;
		for (int i = 0; i < doctorInfo.length; i++) {
			if (doctorInfo[i] instanceof String) {
				name = doctorInfo[i].toString();
			} else if (doctorInfo[i] instanceof Integer) {
				time = Integer.parseInt(doctorInfo[i].toString());
			} else
				throw new Exception();
		}
		doctors.add(name);
		patientTimes.add(Double.parseDouble(fmt.format(time)));

	}

	public void nurse(Object[] nurseInfo) throws Exception {
		double time = 0;
		String name = (String) null;
		for (int i = 0; i < nurseInfo.length; i++) {
			if (nurseInfo[i] instanceof String) {
				name = nurseInfo[i].toString();
			} else if (nurseInfo[i] instanceof Integer) {
				time = Integer.parseInt(nurseInfo[i].toString());
			} else
				throw new Exception();
		}
		nurses.add(name);
		patientTimes.add(Double.parseDouble(fmt.format(time)));

	}

	public void administrator(Object[] administratorInfo) throws Exception {
		String name = (String) null;
		for (int i = 0; i < administratorInfo.length; i++) {
			if (administratorInfo[i] instanceof String) {
				name = administratorInfo[i].toString();
			} else
				throw new Exception();
		}
		administrators.add(name);

	}

	public void surgeon(Object[] surgeonInfo) throws Exception {
		double time = 0;
		String name = (String) null;
		for (int i = 0; i < surgeonInfo.length; i++) {
			if (surgeonInfo[i] instanceof String) {
				name = surgeonInfo[i].toString();
			} else if (surgeonInfo[i] instanceof Integer) {
				time = Integer.parseInt(surgeonInfo[i].toString());
			} else
				throw new Exception();
		}
		surgeons.add(name);
		patientTimes.add(Double.parseDouble(fmt.format(time)));

	}

	public void receptionist(Object[] receptionistInfo) throws Exception {
		double time = 0;
		String name = (String) null;
		for (int i = 0; i < receptionistInfo.length; i++) {
			if (receptionistInfo[i] instanceof String) {
				name = receptionistInfo[i].toString();
			} else if (receptionistInfo[i] instanceof Integer) {
				time = Integer.parseInt(receptionistInfo[i].toString());
			} else
				throw new Exception();
		}
		receptionists.add(name);
		patientTimes.add(Double.parseDouble(fmt.format(time)));

	}
	
	public void janitor(Object[] janitorInfo) throws Exception {
		String name = (String) null;
		for (int i = 0; i < janitorInfo.length; i++) {
			if (janitorInfo[i] instanceof String) {
				name = janitorInfo[i].toString();
			} else
				throw new Exception();
		}
		janitors.add(name);

	}
	
	public String getDoctorName(int index) {
		return doctors.get(index);
	}
	
	public String getNurseName(int index) {
		return nurses.get(index);
	}
	
	public String getAdministratorName(int index) {
		return administrators.get(index);
	}
	
	public String getSurgeonName(int index) {
		return surgeons.get(index);
	}
	
	public String getReceptionistName(int index) {
		return receptionists.get(index);
	}
	
	public String getJanitorName(int index) {
		return janitors.get(index);
	}
	
	public static void examine(String doctor) throws InterruptedException {
		if(doctors.indexOf(doctor) >= 0) {
			System.out.println("What is your name?");
			String name = sc.nextLine();
			char first = name.charAt(0);
			String time = fmt.format(patientTimes.get(((int) first) % 10));
			System.out.println("Your appointment is at: " + time);
			System.out.println("Would you like to take the appointment?");
			String answer = sc.nextLine();
			if(answer.equals("YES") || answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y")) {
				System.out.println("Exercising physical");
				for (int i = 0; i < 5; i++) {
					System.out.println(". ");
					Thread.sleep(20);
				}
				System.out.println("Done!");
			} else {
				System.out.println("Goodbye!");
			}
		} else
			System.out.println(doctor + ": \"I'm not a doctor, I can't examine patients!\"");
	}
	
	public static void assist(String nurse) {}
	
	public static void administrate(String administrator) {}
	
	public static void operate(String surgeon) {}
	
	public static void manage(String receptionist) {}
	
	public static void sanatize(String janitor) {}
	
}
