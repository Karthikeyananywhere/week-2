package string;

import java.util.stream.Stream;

public class StringMethodPractice {
	
	
	public static void main(String[] args) {
		
		String input1="JAVA ROCKS";
		
		String input2="PYTHON";
		
		char charAt = input1.charAt(2);
		
		boolean endsWith = input1.endsWith("A");
		
		boolean contains = input1.contains("JAVA");
		
		int compareTo = input1.compareTo(input2);
		
		String[] split = input1.split(" ");
		
		for (String string : split) {
			System.out.println(string);
		}
		
		String repeat = input1.repeat(2);
		
		System.out.println(repeat);
		
		String substring = input1.substring(0);
		String substring2 = input1.substring(4,9);
		
		System.out.println(substring);
		System.out.println(substring2);
		
		String lowerCase = input1.toLowerCase();
		
		boolean equals = input1.equals(lowerCase);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = input1.equalsIgnoreCase(lowerCase);
		System.out.println(equalsIgnoreCase);
		
		System.out.println(lowerCase);
		
      
		String original="OOPS";
		
		String reversed="";
		
		for (int i = original.length()-1; i>=0; i--) {
			
			reversed=reversed+original.charAt(i);
		}
		
	
		System.out.println(reversed);
	}
	

}
