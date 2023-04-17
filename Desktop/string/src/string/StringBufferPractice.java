package string;

public class StringBufferPractice {   

	public static void main(String[] args) {
		
		  StringBuffer buffer=new StringBuffer("HELLO ");
		  
		  
		  buffer.append(" WORLD");
		  
		  System.out.println(buffer.capacity()); 
		  
		  buffer.ensureCapacity(30);
		  
		  
		  System.out.println(buffer.capacity());
		  System.out.println(buffer.reverse());
		 buffer.replace(0, 5, "HI");
		 
		 System.out.println(buffer.toString());
		 
		 buffer.delete(2, 4);
		 
		 System.out.println(buffer.toString());
		 
		
		
		
		
		
		  
		  
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
}
