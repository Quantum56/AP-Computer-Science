/**
 * 
 */

/**
 * @author ZackB
 *
 */
public class Rational implements Comparable<Object> {
	private int numerator, denominator;
	
	public Rational(double numer, double denom) {
		if(denom == 0) {
			denom = 1;
		}
		
		if(denom < 0) {
			numer = numer * -1;
			denom = denom * -1;
		}
		
		numerator = (int) numer;
		denominator = (int) denom;
		reduce();
	}

	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public Rational reciprocal() {
		return new Rational(denominator, numerator);
	}
	
	public Rational add(Rational op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getDenominator() * numerator;
		int sum = numerator1 + numerator2;
	
		return new Rational(sum, commonDenominator);
	}
	
	public Rational subtract(Rational op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = denominator * op2.getDenominator();
		int numerator2 = op2.getDenominator() * denominator;
		int difference = numerator1 - numerator2;
	
		return new Rational(difference, commonDenominator);
	}
	
	public Rational multiply(Rational op2) {
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		
		return new Rational(numer, denom);
	}
	
	public Rational divide(Rational op2) {
		return multiply(op2.reciprocal());
	}
	
	boolean equals(Rational op2) {
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}
	
	public String toString() {
		String result;
		
		if(numerator == 0) {
			result = "0";
		} else
			if(denominator == 1) {
				result = numerator + "";
			}
			else
				result = numerator + "/" + denominator;
		return result;
	}
	
	private void reduce() {
		if(numerator != 0) {
			int common = gcd(Math.abs(numerator), denominator);
			
			numerator = numerator / common;
			denominator = denominator / common;
		}
	}
	
	private int gcd(int num1, int num2) {
		while(num1 != num2) {
			if(num1 > num2) {
					num1 = num1 - num2;
			}
			else
				num2 = num2 - num1;
		}
		return num1;
	}

	//@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Rational a = new Rational(numerator, denominator);
		double numer = a.getNumerator();
		double denom = a.getDenominator();
		if(numer < denom) {
			return -1;
		} else
		if(numer > denom) {
			return 1;
		} else
		return 0;
	}
}
