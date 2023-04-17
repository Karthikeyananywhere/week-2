package date;

public class Truck {
	
	private static Long rpm;
	
	public static Long testRun() {
		
		rpm=7500l ;
		
		return rpm;
		
	}
	
	
	public static void main(String[] args) {
		
		 Long testRun = testRun();
		 
		 assert testRun>7000:"MAX RPM FAILED";
		 
		 System.out.println("THE MAX RPM IS "+testRun);
	}

}
