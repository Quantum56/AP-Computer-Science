
public class delDel {
	public String delDel_1(String str) {
		  if(str.length() >= 4 && str.substring(1, 4).equals("del")) {
		    return str.substring(0, 1) + str.substring(4);
		  } else {
		  return str;
		  }
		    
		}

}
