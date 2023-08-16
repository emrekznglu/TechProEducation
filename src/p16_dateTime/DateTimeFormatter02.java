package p16_dateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatter02 {
public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);  // 2023-05-25T16:14:58.148
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		/*
		 yy : yilin son iki rakamini
		 yyyy: yilin tamamini 
		 M: ay sirasini verir mart icin : 3
		 MM: ay sirasini verir mart icin : 03
		 MMM : Ay isminin ilk uc harfini verir
		 MMMM : Ay isminin tamamini veir
		 */
		
		System.out.println(dtf.format(ldt)); // 23/Mayıs/25 16:15
		
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt)); // 23/May/25
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm"); // HH : 24 saat'lik sisteme gore
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm"); // hh : pm/am sistemine gore
		System.out.println(dtf3.format(ldt)); // 16:20  24 saat'lik sisteme gore
		System.out.println(dtf4.format(ldt)); // 04:20  pm/am sistemine gore
		
		
		LocalDate dogumTarihi = LocalDate.of(1999, 12, 16);
		LocalDate bugun = LocalDate.now();
		
		
		Period benimYasim = Period.between(dogumTarihi, bugun);// P23Y5M9D
		System.out.println(benimYasim);
		
		int yas=Period.between(dogumTarihi, bugun).getYears();
		System.out.println(yas);
		
	}
}
