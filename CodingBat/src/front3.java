
public class front3 {
	public String front3_1(String str) {
		  String threeChars;
		  if (str.length() >= 3) {
		    threeChars = str.substring(0, 3);
		  }
		  else {
		    threeChars = str;
		  }
		  return threeChars + threeChars + threeChars;
		}

}
