package operator;

public class ConditionalLogicalOperator {
	
	public static void main(String[] args) {
		
		String name="KARTHIKEYAN";
		
		String name2="PRAKASH";
		
		String name3="KARTHIKEYAN";

		String result=!(name.equals(name2)&&name.equals(name3))?"SAME":"NOTSAME";
		
		System.out.println(result);
		
		
	   String res=(name.equals(name2)?"SAME":(name3.equals(name2)?"QWERTY":"DFGHJ"));
		
	}
	
	

}
