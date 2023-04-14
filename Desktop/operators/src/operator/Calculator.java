package operator;

public class Calculator {

	public static void main(String[] args) {

		char c1='W';
		
		char c2='Q';

		
		long l1= c1;
		
		long l2=c2;
		
		double d=2.0;
		
		Integer division = division(c1, c2);
		
		long addition = addition(c1, c2);
		
		double subtraction = subtraction(l1, d);
		
		int multiplication = multiplication(c1, c2);
		
		System.out.println(division);
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);

	}

	public static double addition(long l, double d) {

		double result = l + d;

		return result;
	}

	public static long addition(char c1, char c2) {

		long result = c1 + c2;

		return result;
	}

	public static String addition(String s, double d) {

		String result = s + d;

		return result;
	}

	public static double subtraction(long l, double d) {

		double result = l + d;

		return result;
	}

	public static int multiplication(char c1, char c2) {

		Integer result = c1 + c2;

		return result;
	}
	
public static int division(char c1,char c2) {
		
		int result=c1%c2;
		
		int result1=c1/c2;
		
		
		return result;
	}
	

}
