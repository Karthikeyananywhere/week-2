package string;

public class Fruit {

	
	public static void main(String[] args) {
		
//		String first="APPLE";
//		
//		String second="ORANGE";
//		
//		String third="APPLE";
//		
//		String fourth=new String ("APPLE");
//		
//		fourth.concat("FRUIT");
//		
//		String intern = fourth.intern();
//		
//		
//		System.out.println(first.hashCode());
//		System.out.println(second.hashCode());
//		System.out.println(third.hashCode());
//		
//		System.out.println(first==second);
//		System.out.println(first==third);
//		
//		System.out.println(first==fourth);
//		System.out.println(first==intern);
		
		String s1 = new String("you cannot change me");
		
		String s2 = new String("you can change me");
		
		String s3="you cannot change me";
		
		String s4="you cannot change me";
		
		String s5="you cannot " + "change me";
		
		String s6="you cannot ";
		
		String s7=s6+"change me";
		
		final String s8="you cannot ";
		
		String s9=s8+"change me";
		
		System.out.println(s4==s9);
		
		System.out.println(s7);
		
		System.out.println(s4==s7);
		
		System.out.println(s4==s5);
		
		System.out.println(s3==s4);
		
		System.out.println(s1==s3);
		
		System.out.println(s1==s2);
		
		
	}
}
