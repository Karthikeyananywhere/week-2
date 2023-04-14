package exception;

import java.util.Scanner;

public class Login {

	static Scanner scanner = new Scanner(System.in);

	static Boolean result=false;
	
	
	static Integer count=0;

	public static Boolean loginpage(Intern  []intern) {
		
		System.out.println("ENTER THE USERNAME");
		String userName=scanner.next();
		System.out.println("ENTER THE PASSWORD");
		String password=scanner.next();
		
		Intern newIntern =null;
		for(Intern intern1 : intern) {
			if(intern1.getName().equals(userName)) {
				newIntern = intern1;
				break;
			}
		}
		
		if(newIntern==null) {
			try {
				throw new NoUserFoundException("PLEASE SIGNUP FIRST ");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
		} else {
			for (int i = 0; i < intern.length; i++) {
				
			      if (intern[i].getName().equals(userName) && intern[i].getPassword().equals(password)) {
					
			    	  count++;
			    	  
			    	  result=true;
			    	  return result;
				}
				
				
			}
			
			if (count==0) {
				try {
					throw new InvalidCredentials("INVALID CREDENTIALS"); 
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
					// TODO: handle exception
				}
			}

			
		}
	
				
		return result;
		
		

		
	}
}
