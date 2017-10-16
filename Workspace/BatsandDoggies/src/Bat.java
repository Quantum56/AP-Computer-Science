import java.util.Random;
import java.util.Scanner;

/*
 * Bat A. Sienkiewicz
 */
public class Bat {

	private static Scanner scan = new Scanner(System.in);
	private int legs;
	private double weight;
	private String name, color;

	public Bat() {
		System.out.println("Enter your bat's name here:");
		name = scan.next();
		System.out.println("Enter your bat's color: ");
		color = scan.next();
		System.out.println("Enter your bat's weight in pounds: ");
		weight = scan.nextDouble();
	}

	public Bat(int heavy, String colorbat, String batname) {
		weight = heavy;
		name = batname;
		color = colorbat;
	}

	public String getBatName() {
		return name;
	}

	public String getBatColor() {
		return color;
	}

	public double getBatWeight() {
		return weight;
	}

	public int getBatNumLegs() {
		Random generator = new Random();
		legs = generator.nextInt(10) + 1;
		return legs;
	}

}
