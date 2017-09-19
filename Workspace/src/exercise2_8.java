
/**
 * @author ZackB
 *
 */
import java.util.Scanner;

public class exercise2_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	int x = 2;
			int x2 = 5;
			int y = 7;
			int y2 = 4; */
		String message;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Point Distance Calculator - Press Enter to initialize");
	    message = sc.nextLine();
	    
	    int x1;
	    System.out.println("Enter x1: ");
	    x1 = sc.nextInt();
	    
	    int x2;
	    System.out.println("Enter x2: ");
	    x2 = sc.nextInt();
	    
	    int y1;
	    System.out.println("Enter y1: ");
	    y1 = sc.nextInt();
	    
	    int y2;
	    System.out.println("Enter y2: ");
	    y2 = sc.nextInt();
	    
	    
	   //  int x = sc.nextInt();
	   //  int x2 = sc.nextInt();
	   //  int y = sc.nextInt();
	   //  int y2 = sc.nextInt();
	     
	     
		double z = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
		System.out.printf("The distance between the first point and the second is " + z);
	}

}
