import java.util.ArrayList;

/**
 * 
 */

/**
 * @author student
 *
 */
public class SportTrack {
	
	public SportTrack() {
		// TODO Auto-generated constructor stub
		
	}
	
	public class Football extends SportTrack {
		private ArrayList<String> names = new ArrayList<String>();
		private ArrayList<String> divisions = new ArrayList<String>();
		private ArrayList<Integer> winsArr = new ArrayList<Integer>();
		private ArrayList<Integer> lossesArr = new ArrayList<Integer>();
		private ArrayList<Integer> pointsScoredArr = new ArrayList<Integer>();
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
			winLossPctArr.add((double) wins / losses);
			pointDiffArr.add(pointsScored - pointsScoredOn);
			gamesPlayedArr.add(wins + losses);
			winMarginArr.add((double) pointDiffArr.get(names.indexOf(teamName) / gamesPlayedArr.get(names.indexOf(teamName))));
			
		}
		
		
	}
	
	public class Baseball extends SportTrack {
		public Baseball() {}
	}
	
	public class Hockey extends SportTrack {
		public Hockey() {}
	}
	
	public class Soccer extends SportTrack {
		public Soccer() {}
	}

}
