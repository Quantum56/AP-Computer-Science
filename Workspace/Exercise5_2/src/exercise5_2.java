import java.util.Scanner;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class exercise5_2 {

	private static Scanner sc;
	private static Rational a;
	private static Rational b;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Input numerator:");
		double numer = sc.nextDouble();
		System.out.println("Input denominator:");
		double denom = sc.nextDouble();
		a = new Rational(numer, denom);
		Object obj1 = (int) numer;
		Object obj2 = (int) denom;
		if(((Rational) obj1).compareTo(obj2) > 0) {
			System.out.println("Object numerator is less than object denominator.");
		} else
		if(((Rational) obj2).compareTo(obj1) > 0) {
			System.out.println("Object denominator is less than object numerator.");
		} else
		System.out.println("They are equal.");
				
	}

}
