/**
 * Disassembles a string and prints number of specific characters.
 */

/**
 * @author ZackB
 *
 */
import java.util.Scanner;

public class exercise3_13 {

	private static Scanner sc;
  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("String classification \n Enter a string: ");
		String str = sc.next();
		int vowels = 0, consonants = 0, spaces = 0, punctuations = 0;
		char[] vowel = new char[] { 'a', 'e', 'i', 'o', 'u' };
		char[] consonant = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };
		char[] space = new char[] { ' ' };
		char[] punct = new char[] { '!', ',', '.', '"', '`' };
		// first attempt
		 for (int i = 0; i == str.length(); i++) {
			 char[] array = new char[str.length()]; 
			 if (vowel.toString().substring(i, vowel.toString().length()) == array.toString().substring(i, str.length())) { 
			 vowels++; 
			 } 
		 else if((consonant.toString()).substring(i, consonant.toString().length()) == array.toString().substring(i, str.length())) { 
			 consonants++;
			 } 
		 else if((space.toString()).substring(i, punct.toString().length()) == array.toString().substring(i, str.length())) { 
			 punctuations++;
			 } 
		 else if((punct.toString()).substring(space.toString().length()) == array.toString().substring(i, str.length())) { 
			 spaces++; 
			 }
		 }
		// second attempt
		long a = str.indexOf(vowel.toString());
		long b = str.indexOf(consonant.toString());
		long c = str.indexOf(space.toString());
		long d = str.indexOf(punct.toString());
		for (int i = 0; i == str.length() * str.length(); i++) {
			if (a == vowel.toString().indexOf(str)) {
				vowels++;
			}
			if (b == consonant.toString().indexOf(str)) {
				consonants++;
			}
			if (c == space.toString().indexOf(str)) {
				spaces++;
			}
			if (d == punct.toString().indexOf(str)) {
				punctuations++;
			}
		}
		int z = consonants + spaces + punctuations;
		System.out.format("The string contains %d vowels", vowels);
		System.out.format("\nand %d other characters.", z);
	}
}
