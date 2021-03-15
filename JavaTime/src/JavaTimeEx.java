import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeEx {

	public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	System.out.println("today : " + today);
	System.out.println("today+2 : " + today.plusDays(2));
	System.out.println("100th day of 2021 :" + LocalDate.ofYearDay(2021, 100));
	System.out.println("today is DayOfYear :" + today.getDayOfYear());
	
	LocalTime time = LocalTime.now();
	System.out.println("Current time : " + time);
	
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println("Current Date Time : " + dateTime);
	
	// current date time using local date , local time
	dateTime = LocalDateTime.of(today, time);
	System.out.println("Current Date Time : " + dateTime);
	
	// Parsing and Formatting of date
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	System.out.println("formatted date : " + dtf.format(dateTime));
	
	String strDate = dtf.format(dateTime);
	dateTime = LocalDateTime.parse(strDate, dtf);
	System.out.println("parsed date : " + dateTime);
	}

}
