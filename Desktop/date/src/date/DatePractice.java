package date;

import java.util.Date;

public class DatePractice {
	
	public static void main(String[] args) {
		Date date =new Date();
		
		System.out.println(date);

		Date date1=new Date(2023, 04, 14, 06, 33, 25);
		
		System.out.println(date1);
		
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getHours());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
	
	}

}
