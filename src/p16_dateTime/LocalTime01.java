package p16_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTime01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Java'da saat ile işlem yapmak için
		// LocalTime class'indan obje kullanırız.
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);
		
		System.out.println(saat.plusHours(15));
		
		System.out.println(saat.now(ZoneId.of("Japan")));

	}

}
