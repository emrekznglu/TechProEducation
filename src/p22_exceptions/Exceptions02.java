package p22_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullanıcıdan 2 tam sayı alın ve bölümlerini yazdırın.
		// bu işlemi aralıksız 100 kere yapın.
		
		int count=1;
		
		Scanner scan = new Scanner(System.in);
		while(count<100) {
		
		System.out.println("Lütfen bölünecek tam sayıyı yazın: ");
		int sayi1=scan.nextInt();
		System.out.println("Lütfen bölen tam sayıyı yazın: ");
		int sayi2=scan.nextInt();
		
		// java'ya exceptions' i handle etmek için bir çözüm üretmezsek
		// java exception ile karşılaştıgında calismayi durdurur (stops execution)
		// throws exception (exception firlatir) (problemin kaynağını bize gösterir)
		// dolayısıyla tüm application durmuş olur, müşterinin kullandığı bir uygulama için bu 	KABUL EDİLEMEZ.
		// bunun için kod yazan kişi muhtemel sorunları öngörmeli ve Java'ya bu sorunla handle edebilmesi için yol göstermeli.
			System.out.println("işlem no: "+count);
			try {
			System.out.println("sonuç: "+sayi1/sayi2);
			} catch (ArithmeticException e) {
			System.out.println("sayıyı 0' a bölemezsin.");	
			}
			
			count++;		
		}
		scan.close();
	}
}