
public class icyHot {
	public boolean icyHot_1(int temp1, int temp2) {
		  if ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0)) {
		    return true;
		  } else {
		    return false;
		  }
		}

}
