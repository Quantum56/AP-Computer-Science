import java.util.Random;

public class Die {
	private final int MIN_FACES = 4;
	
	private static Random gen = new Random();
	private int numFaces;
	private int faceValue;
	
	public Die() {
		numFaces = 6;
		faceValue = 1;
	}
	
	public Die(int faces) {
		if (faces < MIN_FACES)
			numFaces = 6;
		else
			numFaces = faces;
		
		faceValue = 1;
	}
	public int roll() {
		faceValue = gen.nextInt(numFaces) + 1;
		return faceValue;
	}
	public int getFaceValue() {
		return faceValue;
	}
	
}
