import java.util.Scanner;

/**
 * @author ZackB
 *
 */
public class exercise7_4 {
	private static Scanner sc = new Scanner(System.in);
	private static int choice, choice1;
	private static SportTrack.Football team1; 
	private static SportTrack.Baseball team2; 
	private static SportTrack.Hockey team3; 
	private static SportTrack.Soccer team4;
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1 for a new football team, 2 for a new baseball team, 3 for a new hockey team, and 4 for a new soccer team. \n");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Football Chosen");
			String teamName, division;
			int wins, losses, pointsScored, pointsScoredOn;
			System.out.println("Enter the team name: \n");
			teamName = sc.nextLine();
			System.out.println("Enter the division name: \n");
			division = sc.nextLine();
			System.out.println("Enter number of wins: \n");
			wins = sc.nextInt();
			System.out.println("Enter number of losses: \n");
			losses = sc.nextInt();
			System.out.println("Enter number of points scored: \n");
			pointsScored = sc.nextInt();
			System.out.println("Enter number of points scored on: \n");
			pointsScoredOn = sc.nextInt();
			team1 = new SportTrack.Football(teamName, division, wins, losses, pointsScored, pointsScoredOn);
			System.out.println(team1.toString(teamName));
			
			
		case 2:
			System.out.println("Baseball Chosen");
			String teamName1;
			int wins1, losses1, scoringRuns, homeRuns, hits, rbi, stolenBases, totalRuns;
			System.out.println("Enter team name: \n");
			teamName1 = sc.nextLine();
			System.out.println("Enter number of wins: \n");
			wins1 = sc.nextInt();
			System.out.println("Enter number of losses: \n");
			losses1 = sc.nextInt();
			System.out.println("Enter number of scoring runs: \n");
			scoringRuns = sc.nextInt();
			System.out.println("Enter number of home runs: \n");
			homeRuns = sc.nextInt();
			System.out.println("Enter number of hits: \n");
			hits = sc.nextInt();
			System.out.println("Enter number of runs batted in: \n");
			rbi = sc.nextInt();
			System.out.println("Enter number of bases stolen: \n");
			stolenBases = sc.nextInt();
			System.out.println("Enter number of total runs: \n");
			totalRuns = sc.nextInt();
			team2 = new SportTrack.Baseball(teamName1, wins1, losses1, scoringRuns, homeRuns, hits, rbi, stolenBases, totalRuns);
			System.out.println(team1.toString(teamName1));
		case 3:
			System.out.println("Hockey Chosen");
			String teamName2, division2, subDivision2;
			int wins2, losses2, pointsScored2, pointsScoredOn2;
			System.out.println("Enter the team name: \n");
			teamName2 = sc.nextLine();
			System.out.println("Enter the division name: \n");
			division2 = sc.nextLine();
			System.out.println("Enter the subdivision name: \n");
			subDivision2 = sc.nextLine();
			System.out.println("Enter number of wins: \n");
			wins2 = sc.nextInt();
			System.out.println("Enter number of losses: \n");
			losses2 = sc.nextInt();
			System.out.println("Enter number of points scored: \n");
			pointsScored2 = sc.nextInt();
			System.out.println("Enter number of points scored on: \n");
			pointsScoredOn2 = sc.nextInt();
			team3 = new SportTrack.Hockey(teamName2, subDivision2, division2, wins2, losses2, pointsScored2, pointsScoredOn2);
			System.out.println(team3.toString(teamName2));
		case 4:
			System.out.println("Soccer Chosen");
			String teamName3, division3, subDivision3;
			int wins3, losses3, pointsScored3, pointsScoredOn3;
			System.out.println("Enter the team name: \n");
			teamName3 = sc.nextLine();
			System.out.println("Enter the division name: \n");
			division3 = sc.nextLine();
			System.out.println("Enter the subdivision name: \n");
			subDivision3 = sc.nextLine();
			System.out.println("Enter number of wins: \n");
			wins3 = sc.nextInt();
			System.out.println("Enter number of losses: \n");
			losses3 = sc.nextInt();
			System.out.println("Enter number of points scored: \n");
			pointsScored3 = sc.nextInt();
			System.out.println("Enter number of points scored on: \n");
			pointsScoredOn3 = sc.nextInt();
			team4 = new SportTrack.Soccer(teamName3, subDivision3, division3, wins3, losses3, pointsScored3, pointsScoredOn3);
			System.out.println(team4.toString(teamName3));
		default:
			System.out.println("Enter a team name: ");
			String team5 = sc.nextLine();
			System.out.println("Is this a football, baseball, hockey, or soccer team? (enter 1, 2, 3, or 4 respectively) \n");
			choice1 = sc.nextInt();
			switch(choice1) {
			case 1:
				System.out.println(team1.toString(team5));
			case 2:
				System.out.println(team2.toString(team5));
			case 3:
				System.out.println(team3.toString(team5));
			case 4:
				System.out.println(team4.toString(team5));
			default:
				System.out.println("Exiting...");
				Thread.sleep(100);
				System.exit(0);
			}
		}
	}

}