package p16_dateTime;

import java.time.LocalDate;

public class LocalDate01 {
	
	public static void main(String[] args) {
		
		// Java' da sadece tarih kullanmak istiyorsak
		// LocalDate Class'indan bir obje üretiriz.
		
		LocalDate tarih= LocalDate.now();
		System.out.println(tarih);
		System.out.println(tarih.plusWeeks(20)); // 20 hafta sonra
		System.out.println(tarih.plusDays(500)); // 500 gün sonra
		System.out.println(tarih.plusYears(3)); // 3 yıl sonra
		System.out.println(tarih.plusYears(3).plusMonths(2).plusWeeks(16).minusDays(30)); // 3 yıl 2 ay 16 hafta ileri 30 gün geri.
		
		System.out.println(tarih.isLeapYear()); // artık yıl mıdır değil midir?
		
		// Eğer şuan ki tarih ile değilde eski bir tarih ile işlem yapacaksak
		// LocalDate.of() methodunu kullanıyoruz.
		
		LocalDate tarih1 = LocalDate.of(1995,12,15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); // tarih1, tarih2 den sonra mı? onu kontrol eder. true
		System.out.println(tarih1.isBefore(tarih2)); // false
		
		System.out.println(tarih.getDayOfMonth()); // Ayın kaçıncı günü
		LocalDate dogumGunu=LocalDate.of(2002, 5, 10);
		System.out.println("Yılın "+dogumGunu.getDayOfYear()+". günü, ayın "+dogumGunu.getDayOfMonth()+". günü, haftanın "
		+dogumGunu.getDayOfWeek()+" günü");
		
	}

}
