package p16_dateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter01 {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// MM: Month / mm: Minute
		
		LocalDate tarih=LocalDate.now();
		
		System.out.println(dtf.format(tarih));
		
	}

}