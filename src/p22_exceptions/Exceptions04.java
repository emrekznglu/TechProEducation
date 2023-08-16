package p22_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions04 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		// Java "Ya dosyayi bulamazsam" der ve bizden cozum uretmemizi bekler
		// dosya bulma ile ilgili exception turu : FileNotFoundException
		// Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exceptions diyoruz
		//
		try {
			FileInputStream fis = new FileInputStream("HatalıKonumVerelimC:\\Users\\emrek\\eclipse-workspace\\Techproeducation\\src\\p22_exceptions\\File");
		
		
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage()); // daha az hata aciklamasi yazdirir
		}
		System.out.println("Kod bloke olmamisss");
		
	}

}