package basic;

public class UncheckedPropogation {
	
	static String trial;
	public static void main(String[] args)  {
    
		
		String input=null;
		
		
		try {
			
			 trial = trial(input);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			//System.out.println(e.getMessage());
			//System.out.println(trial);
		}
		
	}
	
	
	
	public static String trial (String input) throws NullPointerException {
		
		
		String upperCase = input.toUpperCase();
		
		return upperCase;
		
	}
	
	
	
	
	
		
	}


