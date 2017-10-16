/**
 * 
 */

/**
 * @author student
 *
 */
public class dogsandbats {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Bat bat1 = new Bat();
		String dog1Name = dog1.getDogName();
		String dog1Color = dog1.getDogColor();
		double dog1Weight = dog1.getDogWeight(); // end of dog
		String bat1Name = bat1.getBatName();
		String bat1Color = bat1.getBatColor();
		double bat1Weight = bat1.getBatWeight();
		int bat1NumLegs = bat1.getBatNumLegs();
		int numLegs = bat1NumLegs + 4;
		double totalWeight = bat1Weight + dog1Weight;
		System.out.println(dog1Name + " is " + dog1Weight + " LBS and is " + dog1Color + ".");
		System.out.println(bat1Name + " is " + bat1Weight + " LBS and is " + bat1Color + ".");
		System.out.println("There are " + numLegs + " total legs with " + dog1Name + " and " + bat1Name + " weighing " + totalWeight + " LBS.");
		
	}

}
