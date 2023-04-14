package controlflow;

public class Test {
	
	public static void main(String[] args) {
		
		int input=5;
		
		for (int i = 0; i < args.length; i++) {
		
			
		
		
		
		if (input>3) {
			if (input >4) {
			
               if (input>6) {
            	   
               } else if(input==5) {
            	   break;
               }
				System.out.println("OUTSIDE THE THIRD CONDITION");
			} 
				
			System.out.println("OUTSIDE THE SECOND CONDITION");
			
			
		}
		System.out.println("OUTSIDE THE FIRST CONDITION");
		
	}

}

}