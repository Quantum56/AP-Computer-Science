/**
 * 
 */
import java.lang.*;
/**
 * @author student
 *
 */
public class Sorts {

	public static void selectionSort(int[] numbers) {
		int min, temp;

		for (int index = 0; index < numbers.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < numbers.length; scan++) {
				if (numbers[scan] < numbers[min]) {
					min = scan;
				}
			}

			temp = numbers[min];
			numbers[min] = numbers[index];
			numbers[index] = temp;
		}
		
		numbers = System.arraycopy(numbers.length - 1, 0);
		
		/*
		for (int i = 0; i < numbers.length; i++) {
			if (i < (numbers.length - 1) / 2) {
			// numbers[i] = numbers[numbers.length - (i + 1)];
			numbers[numbers.length - (i + 1)] = numbers[i];
			}
		}
		*/
		
	/*	int a = 0;
		for (int i = 0; i < numbers.length; i++) {
			while (a > 0) {
				if (10 - a > 0)
					numbers[i] = numbers[10 - a];
				a++;
			}
		}
		*/
		
	}
}
