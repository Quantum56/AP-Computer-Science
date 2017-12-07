import java.text.DecimalFormat;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class Hospital {

	private static Scanner sc = new Scanner(System.in);
	private static DecimalFormat fmt = new DecimalFormat("##.##");
	private static final int HOSPITAL_MAX_CAPACITY = 500;
	private static Random gen = new Random();

	private static ArrayList<String> doctors = new ArrayList<String>();
	private static ArrayList<String> nurses = new ArrayList<String>();
	private static ArrayList<String> administrators = new ArrayList<String>();
	private static ArrayList<String> surgeons = new ArrayList<String>();
	private static ArrayList<String> receptionists = new ArrayList<String>();
	private static ArrayList<String> janitors = new ArrayList<String>();
	private static ArrayList<Double> patientTimes = new ArrayList<Double>();
	private static ArrayList<String> patients = new ArrayList<String>(HOSPITAL_MAX_CAPACITY);
	private static final int month = gen.nextInt(12) + 1;
	private static String monthString;

	private static Clock now = Clock.systemUTC();

	public Hospital(Object[] doctorInfo, Object[] nurseInfo, Object[] administratorInfo, Object[] surgeonInfo, Object[] receptionistInfo, Object[] janitorInfo) throws Exception {
		monthSwitch();
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

	public void examine(String doctor) throws InterruptedException {
		if (doctors.indexOf(doctor) >= 0) {
			System.out.println("What is your name?");
			String name = sc.nextLine();
			char first = name.charAt(0);
			String time = fmt.format(patientTimes.get(((int) first) % 10));
			System.out.println("Your appointment is at: " + time);
			System.out.println("Would you like to take the appointment?");
			String answer = sc.nextLine();
			if (answer.equals("YES") || answer.equals("Yes") || answer.equals("yes") || answer.equals("y")
					|| answer.equals("Y")) {
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

	public void assist(String nurse) {
		if (nurses.indexOf(nurse) >= 0) {
			for (int i = 0; i < patientTimes.size(); i++) {
				if (patientTimes.get(i) == now.hashCode() && patientTimes.indexOf(patientTimes.get(i)) % 2 == 0)
					System.out.println("Helped nurse " + nurses.get(i / 2) + "!");
				else if (patientTimes.get(i) == now.hashCode() && patientTimes.indexOf(patientTimes.get(i)) % 3 == 0)
					System.out.println("Helped surgeon" + surgeons.get(i / 3) + "! ");
				else
					System.out.println("Helped doctor" + doctors.get(i) + "!");
			}
		}
	}

	public void administrate(String administrator) {
		System.out.println("At " + now.hashCode() + ", overseen " + doctors.get(now.hashCode() % 10) + ", "
				+ nurses.get(now.hashCode() % 10) + ", " + surgeons.get(now.hashCode() % 10) + ", "
				+ receptionists.get(now.hashCode() % 10) + ", " + janitors.get(now.hashCode() % 10) + ".");
	}

	public void operate(String surgeon) {
		System.out.println("Entered the emergency room at " + now.hashCode() + ",  operating on"
				+ patients.get(Clock.systemUTC().hashCode() % 10));
	}

	public void manage(String receptionist) {
		System.out.println("Would you like to add a patient time and name, or do you have an emergency? (t / e)");
		String answer = sc.nextLine();
		if (answer == "t" || answer == "T") {
			System.out.println("Enter the patient's name here: ");
			String name = sc.nextLine();
			patients.add(name);
			System.out.println("Enter the time of appointment: ");
			double time = Double.parseDouble(fmt.format(sc.nextDouble()));
			patientTimes.add(time);
			System.out.println("Your appointment is in " + monthString + ", on the " + gen.nextInt(31) + "th, and at " + time + ".");
		} else if (answer == "e" || answer == "E") {
			System.out.println("Quickly, enter the emergency room!");
		}
	}

	public void sanatize(String janitor) {
		System.out.println("Cleaned floor at: " + now.hashCode() + ".");
	}

	private static void monthSwitch() {
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "error";

		}
	}

}