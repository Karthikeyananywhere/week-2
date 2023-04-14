package controlflow;

public class Whileloop {
	
	
	public static void main(String[] args) {
	
		Integer count=12345;
		
		Integer element=0;
		while(count>0) {
			element++;
			count/=10;
			
			
		}
		
		System.out.println(element);
	}

}
