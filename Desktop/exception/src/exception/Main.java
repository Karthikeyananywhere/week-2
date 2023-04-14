package exception;

public class Main {
	
	public static void main(String[] args) {
		
		Intern  objArray []=new Intern [3];
		
		objArray[0]=new Intern("KARTHIKEYAN","QWERTYUIOP","karthikeyan.kumar@anywhere.co",7708070434l);
		objArray[1]=new Intern("KUMARAN","asdfghjkl","kumar@anywhere.co",6374379895l);
		objArray[2]=new Intern("PRAKASH","zxcvbnm","prakash@anywhere.co",9566414519l);
		
		Boolean loginpage = Login.loginpage(objArray);
		
		if (loginpage) {
			System.out.println("LOGIN SUCCESSFULL");
		}
		
		
	}

}
