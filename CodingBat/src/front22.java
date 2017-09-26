
public class front22 {
	public String front22_1(String str) {
		  int a = 2;
		  if (a > str.length()) {
		    a = str.length();
		  }
		  
		  String firstTwo = str.substring(0, a);
		  return firstTwo + str + firstTwo;
		}

}
