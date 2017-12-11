import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise7_4 {
	private static Scanner sc = new Scanner(System.in);
	private static int choice;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportTrack main = new SportTracker();
		
		System.out.println("Enter 1 for a new football team, 2 for a new baseball team, 3 for a new hockey team, and 4 for a new soccer team. ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			String teamName, int wins, int losses, int pointsScored int pointsScoredOn;
			System.out.println("Enter the team name");
			SportTrack.Football player1 = new SportTrack.Football(teamName, int wins, int losses, int pointsScored, int pointsScoredOn);
		
		}
	}

}
