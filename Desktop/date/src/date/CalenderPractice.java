package date;

import java.util.Calendar;

public class CalenderPractice {
	
	
	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		
		System.out.println(instance.getTime());
		System.out.println(instance.get(Calendar.DATE));
		System.out.println(instance.get(Calendar.MONTH));
		System.out.println(instance.get(Calendar.YEAR));
		System.out.println(instance.get(Calendar.HOUR));
		System.out.println(instance.get(Calendar.MINUTE));
		System.out.println(instance.get(Calendar.SECOND));
		
		
		//add method
	    instance.add(instance.YEAR, 20);
		instance.add(Calendar.MONTH, 8);
		System.out.println(instance.getTime());
		
		//min && max
		
		int minimum = instance.getMinimum(Calendar.DAY_OF_MONTH);
		
		System.out.println("MINIMUM DAY OF THE MONTH "+minimum);
		
		int maximum = instance.getMaximum(Calendar.WEEK_OF_YEAR);
		
		System.out.println("MAXIMUM WEEK OF THE YEAR "+maximum);
	}
	
	

}
