// import java.util.Arrays;
// import java.util.Collections;

/**
 * 
 */

/**
 * @author ZackB
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
		
		for (int i = 0; i < numbers.length / 2; i++) {
			  int temp1 = numbers[i];
			  numbers[i] = numbers[numbers.length - 1 - i];
			  numbers[numbers.length - 1 - i] = temp1;
		}
	}
}
//		Collections.reverse(Arrays.asList(numbers));
		
//		List<int[]> Numbers = Arrays.asList(numbers);
//		Collections.reverse(Numbers);
		
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