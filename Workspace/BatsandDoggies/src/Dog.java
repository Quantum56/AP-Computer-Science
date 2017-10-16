import java.util.Scanner;

public class Dog {

	private final int NUM_LEGS = 4;
	private static Scanner scan = new Scanner(System.in);
	private int legs;
	private double weight;
	private String name, color;

	public Dog() {
		System.out.println("Enter your dog's name here:");
		name = scan.next();
		System.out.println("Enter your dog's color: ");
		color = scan.next();
		System.out.println("Enter your dog's weight in pounds: ");
		weight = scan.nextDouble();
	}

	public Dog(int heavy, String colordog, String dogname) {
		weight = heavy;
		name = dogname;
		color = colordog;
	}

	public String getDogName() {
		return name;
	}

	public String getDogColor() {
		return color;
	}

	public double getDogWeight() {
		return weight;
	}

	public int getLegNumber() {
		legs = NUM_LEGS;
		return legs;
	}

}