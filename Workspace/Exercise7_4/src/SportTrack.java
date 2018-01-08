import java.util.ArrayList;

/**
 * @author ZackB
 *
 */
public class SportTrack {

	public SportTrack() {
		// TODO Auto-generated constructor stub
	}

	public static class Football extends SportTrack {
		private ArrayList<String> names = new ArrayList<String>();
		private ArrayList<String> divisions = new ArrayList<String>();
		private ArrayList<Integer> winsArr = new ArrayList<Integer>();
		private ArrayList<Integer> lossesArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredOnArr = new ArrayList<Integer>();
		private ArrayList<Double> winLossPctArr = new ArrayList<Double>();
		private ArrayList<Integer> pointDiffArr = new ArrayList<Integer>();
		private ArrayList<Integer> gamesPlayedArr = new ArrayList<Integer>();
		private ArrayList<Double> winMarginArr = new ArrayList<Double>(); // defined as ( pointDiff / gamesPlayed )

		public Football(String teamName, String division, int wins, int losses, int pointsScored, int pointsScoredOn) {
			names.add(teamName);
			divisions.add(division);
			winsArr.add(wins);
			lossesArr.add(losses);
			pointsScoredArr.add(pointsScored);
			pointsScoredOnArr.add(pointsScoredOn);
			winLossPctArr.add((double) wins / losses);
			pointDiffArr.add(pointsScored - pointsScoredOn);
			gamesPlayedArr.add(wins + losses);
			winMarginArr.add((double) pointDiffArr.get(names.indexOf(teamName) / gamesPlayedArr.get(names.indexOf(teamName))));

		}

		public String getDivision(String teamName) {
			return divisions.get(names.indexOf(teamName));
		}

		public int getWins(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getLosses(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getPointsScored(String teamName) {
			return pointsScoredArr.get(names.indexOf(teamName));
		}

		public int getPointsScoredOn(String teamName) {
			return pointsScoredOnArr.get(names.indexOf(teamName));
		}

		public double getWinLossPct(String teamName) {
			return winLossPctArr.get(names.indexOf(teamName));
		}

		public int getPointDiff(String teamName) {
			return pointDiffArr.get(names.indexOf(teamName));
		}

		public int getGamesPlayed(String teamName) {
			return gamesPlayedArr.get(names.indexOf(teamName));
		}

		public double getWinMargin(String teamName) {
			return winMarginArr.get(names.indexOf(teamName));
		}

		public String toString(String teamName) {
			String team;
			team = "Team: " + teamName + "\n Division: " + getDivision(teamName) + " Wins: " + getWins(teamName)
					+ " Losses: " + getLosses(teamName) + " Points Scored: " + getPointsScored(teamName)
					+ " Points Scored On: " + getPointsScoredOn(teamName) + " Wins/Losses Percent: "
					+ getWinLossPct(teamName) + " Points Differential: " + getPointDiff(teamName) + " Games Played: "
					+ getGamesPlayed(teamName) + " Win Margin: " + getWinMargin(teamName);
			return team;
		}
	}

	public static class Baseball extends SportTrack {
		private ArrayList<String> names = new ArrayList<String>();
		private ArrayList<Integer> winsArr = new ArrayList<Integer>();
		private ArrayList<Integer> lossesArr = new ArrayList<Integer>();
		private ArrayList<Integer> runsArr = new ArrayList<Integer>();
		private ArrayList<Integer> homeRunsArr = new ArrayList<Integer>();
		private ArrayList<Double> winLossPctArr = new ArrayList<Double>();
		private ArrayList<Integer> hitsArr = new ArrayList<Integer>();
		private ArrayList<Integer> gamesPlayedArr = new ArrayList<Integer>();
		private ArrayList<Integer> rbiArr = new ArrayList<Integer>();
		private ArrayList<Integer> totalRunsArr = new ArrayList<Integer>();
		private ArrayList<Integer> basesStolenArr = new ArrayList<Integer>();

		public Baseball(String teamName, int wins, int losses, int scoringRuns, int homeRuns, int hits, int rbi, int stolenBases, int totalRuns) {
			names.add(teamName);
			winsArr.add(wins);
			lossesArr.add(losses);
			runsArr.add(scoringRuns);
			homeRunsArr.add(homeRuns);
			hitsArr.add(hits);
			winLossPctArr.add((double) wins / losses);
			gamesPlayedArr.add(wins + losses);
			rbiArr.add(rbi);
			totalRunsArr.add(totalRuns);
			basesStolenArr.add(stolenBases);

		}

		public int getWins(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getLosses(String teamName) {
			return lossesArr.get(names.indexOf(teamName));
		}

		public int getScoringRuns(String teamName) {
			return runsArr.get(names.indexOf(teamName));
		}

		public int getHomeRuns(String teamName) {
			return homeRunsArr.get(names.indexOf(teamName));
		}

		public double getWinLossPct(String teamName) {
			return winLossPctArr.get(names.indexOf(teamName));
		}

		public int getTotalHits(String teamName) {
			return hitsArr.get(names.indexOf(teamName));
		}

		public int getGamesPlayed(String teamName) {
			return gamesPlayedArr.get(names.indexOf(teamName));
		}

		public int getRbi(String teamName) {
			return rbiArr.get(names.indexOf(teamName));
		}

		public int getTotalRuns(String teamName) {
			return totalRunsArr.get(names.indexOf(teamName));
		}

		public int getBasesStolen(String teamName) {
			return basesStolenArr.get(names.indexOf(teamName));
		}

		public String toString(String teamName) {
			String team;
			team = "Team: " + teamName + "\n Wins: " + getWins(teamName) + " Losses: " + getLosses(teamName)
					+ " Points Scored: " + getScoringRuns(teamName) + " Home Runs: " + getHomeRuns(teamName)
					+ " Wins/Losses Percent: " + getWinLossPct(teamName) + " Total Hits: " + getTotalHits(teamName)
					+ " Games Played: " + getGamesPlayed(teamName) + " Runs Batted In: " + getRbi(teamName)
					+ " Total Runs: " + getTotalRuns(teamName) + " Bases Stolen: " + getBasesStolen(teamName);
			return team;
		}
	}

	public static class Hockey extends SportTrack {
		private ArrayList<String> names = new ArrayList<String>();
		private ArrayList<String> divisions = new ArrayList<String>();
		private ArrayList<String> subDivisions = new ArrayList<String>();
		private ArrayList<Integer> winsArr = new ArrayList<Integer>();
		private ArrayList<Integer> lossesArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredOnArr = new ArrayList<Integer>();
		private ArrayList<Double> winLossPctArr = new ArrayList<Double>();
		private ArrayList<Integer> pointDiffArr = new ArrayList<Integer>();
		private ArrayList<Integer> gamesPlayedArr = new ArrayList<Integer>();
		private ArrayList<Double> winMarginArr = new ArrayList<Double>(); // defined as ( pointDiff / gamesPlayed )

		public Hockey(String teamName, String division, String subDivision, int wins, int losses, int pointsScored, int pointsScoredOn) {
			names.add(teamName);
			divisions.add(division);
			subDivisions.add(subDivision);
			winsArr.add(wins);
			lossesArr.add(losses);
			pointsScoredArr.add(pointsScored);
			pointsScoredOnArr.add(pointsScoredOn);
			winLossPctArr.add((double) wins / losses);
			pointDiffArr.add(pointsScored - pointsScoredOn);
			gamesPlayedArr.add(wins + losses);
			winMarginArr.add((double) pointDiffArr.get(names.indexOf(teamName) / gamesPlayedArr.get(names.indexOf(teamName))));

		}

		public String getDivision(String teamName) {
			return divisions.get(names.indexOf(teamName));
		}
		
		public String getSubDivision(String teamName) {
			return subDivisions.get(names.indexOf(teamName));
		}

		public int getWins(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getLosses(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getPointsScored(String teamName) {
			return pointsScoredArr.get(names.indexOf(teamName));
		}

		public int getPointsScoredOn(String teamName) {
			return pointsScoredOnArr.get(names.indexOf(teamName));
		}

		public double getWinLossPct(String teamName) {
			return winLossPctArr.get(names.indexOf(teamName));
		}

		public int getPointDiff(String teamName) {
			return pointDiffArr.get(names.indexOf(teamName));
		}

		public int getGamesPlayed(String teamName) {
			return gamesPlayedArr.get(names.indexOf(teamName));
		}

		public double getWinMargin(String teamName) {
			return winMarginArr.get(names.indexOf(teamName));
		}

		public String toString(String teamName) {
			String team;
			team = "Team: " + teamName + "\n Division: " + getDivision(teamName) + " Sub-Division: " + getSubDivision(teamName) 
					+ " Wins: " + getWins(teamName) + " Losses: " + getLosses(teamName) + " Points Scored: " 
					+ getPointsScored(teamName) + " Points Scored On: " + getPointsScoredOn(teamName) + " Wins/Losses Percent: "
					+ getWinLossPct(teamName) + " Points Differential: " + getPointDiff(teamName) + " Games Played: "
					+ getGamesPlayed(teamName) + " Win Margin: " + getWinMargin(teamName);
			return team;
		}
	}

	public static class Soccer extends SportTrack {
		private ArrayList<String> names = new ArrayList<String>();
		private ArrayList<String> divisions = new ArrayList<String>();
		private ArrayList<String> subDivisions = new ArrayList<String>();
		private ArrayList<Integer> winsArr = new ArrayList<Integer>();
		private ArrayList<Integer> lossesArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredOnArr = new ArrayList<Integer>();
		private ArrayList<Double> winLossPctArr = new ArrayList<Double>();
		private ArrayList<Integer> pointDiffArr = new ArrayList<Integer>();
		private ArrayList<Integer> gamesPlayedArr = new ArrayList<Integer>();
		private ArrayList<Double> winMarginArr = new ArrayList<Double>(); // defined as ( pointDiff / gamesPlayed )

		public Soccer(String teamName, String division, String subDivision, int wins, int losses, int pointsScored, int pointsScoredOn) {
			names.add(teamName);
			divisions.add(division);
			subDivisions.add(subDivision);
			winsArr.add(wins);
			lossesArr.add(losses);
			pointsScoredArr.add(pointsScored);
			pointsScoredOnArr.add(pointsScoredOn);
			winLossPctArr.add((double) wins / losses);
			pointDiffArr.add(pointsScored - pointsScoredOn);
			gamesPlayedArr.add(wins + losses);
			winMarginArr.add((double) pointDiffArr.get(names.indexOf(teamName) / gamesPlayedArr.get(names.indexOf(teamName))));

		}

		public String getDivision(String teamName) {
			return divisions.get(names.indexOf(teamName));
		}
		
		public String getSubDivision(String teamName) {
			return subDivisions.get(names.indexOf(teamName));
		}

		public int getWins(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getLosses(String teamName) {
			return winsArr.get(names.indexOf(teamName));
		}

		public int getPointsScored(String teamName) {
			return pointsScoredArr.get(names.indexOf(teamName));
		}

		public int getPointsScoredOn(String teamName) {
			return pointsScoredOnArr.get(names.indexOf(teamName));
		}

		public double getWinLossPct(String teamName) {
			return winLossPctArr.get(names.indexOf(teamName));
		}

		public int getPointDiff(String teamName) {
			return pointDiffArr.get(names.indexOf(teamName));
		}

		public int getGamesPlayed(String teamName) {
			return gamesPlayedArr.get(names.indexOf(teamName));
		}

		public double getWinMargin(String teamName) {
			return winMarginArr.get(names.indexOf(teamName));
		}

		public String toString(String teamName) {
			String team;
			team = "Team: " + teamName + "\n Division: " + getDivision(teamName) + " Wins: " 
					+ getWins(teamName) + " Losses: " + getLosses(teamName) + " Points Scored: " 
					+ getPointsScored(teamName) + " Points Scored On: " + getPointsScoredOn(teamName) + " Wins/Losses Percent: "
					+ getWinLossPct(teamName) + " Points Differential: " + getPointDiff(teamName) + " Games Played: "
					+ getGamesPlayed(teamName) + " Win Margin: " + getWinMargin(teamName);
			return team;
		}
	}

}