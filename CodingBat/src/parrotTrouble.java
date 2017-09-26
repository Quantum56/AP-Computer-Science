
public class parrotTrouble {
	public boolean parrotTrouble_1(boolean talking, int hour) {
		  if (talking && hour == 6) {
		    return true;
		  }
		  if (talking && hour == 7){
		    return false;
		  } 
		  if (talking && hour == 21){
		    return true;
		  } 
		  if (talking && hour == 23){
		    return true;
		  } 
		  else {
		    return false;
		  }
		}

}
