
public class posNeg {
	public boolean posNeg_1(int a, int b, boolean negative) {
		  if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
		  
		}
}
