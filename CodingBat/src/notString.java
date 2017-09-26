
public class notString {
	public String notString_1(String str) {
		  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  return "not " + str;
		}

}
