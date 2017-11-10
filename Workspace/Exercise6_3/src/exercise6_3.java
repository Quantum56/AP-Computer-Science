import java.util.Random;

/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class exercise6_3 {
	private static Random a = new Random();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sorting = {a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, a.nextInt(100) + 1, };
		Sorts.selectionSort(sorting);
		
		for (int i = 0; i < sorting.length; i++) {
			if (i > 0) {
			System.out.println(sorting[i] + "");
			}
		}
	}

}