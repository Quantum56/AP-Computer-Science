/**
 * A simple program that takes 2 integers, and processes their sum and product, then prints out the result.
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author ZackB
 *
 */
public class exercise5_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr1, numStr2, result;
		int num1, num2, sum, prod, again;

		do {
			numStr1 = JOptionPane.showInputDialog("Enter first integer: ");
			numStr2 = JOptionPane.showInputDialog("Enter second integer: ");
			num1 = Integer.parseInt(numStr1);
			num2 = Integer.parseInt(numStr2);
			sum = num1 + num2;
			prod = num1 * num2;
			result = "The sum of the numbers is: " + sum + ", and the product is: " + prod + ". ";
			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Calculate another set of values?");
		} while (again == JOptionPane.YES_OPTION);
	}

}
