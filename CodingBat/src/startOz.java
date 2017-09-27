
public class startOz {
	public String startOz_1(String str) {
		  String a = "";
		  if (str.length() >= 1 && str.charAt(0) == 'o') {
		    a = a + str.charAt(0);
		  }
		  if (str.length() >= 2 && str.charAt(1) == 'z') {
		    a = a + str.charAt(1);
		  }
		  return a;
		}
}
