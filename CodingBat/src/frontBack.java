
public class frontBack {
	public String frontBack_1(String str) {
		  if (str.length() <= 1) {
		    return str;
		  }
		  String mid = str.substring(1, str.length()-1);
		   return str.charAt(str.length()-1) + mid + str.charAt(0);
		}

}
