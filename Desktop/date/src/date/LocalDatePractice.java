package date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class LocalDatePractice {

	
	public static void main(String[] args) {
	
			
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		
		now.getMonth();
		now.getYear();
		now.getDayOfWeek();

		LocalDateTime now2 = LocalDateTime.now();
		
	     DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     
	     String format = now2.format(ofPattern);
	     
	     System.out.println(format);
	     
		
		DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String format2 = now2.format(ofPattern2);
		
		System.out.println(format2);
		
	
		
	//System.out.println(now.getChronology());
				
			}
		

	}


