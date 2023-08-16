package p22_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanıcıdan 2 tam sayı alın ve bölümlerini yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bölünecek tam sayıyı yazın: ");
		int sayi1=scan.nextInt();
		System.out.println("Lütfen bölen tam sayıyı yazın: ");
		int sayi2=scan.nextInt();
		
		// java exceptions'i handle etmek için try-catch blogu olusturmuş.
		
		try {
			
		System.out.println("sonuç: "+sayi1/sayi2);
		
		} catch (ArithmeticException e) {
		System.out.println("Sayıyı 0' a bölemezsin.");
		}
		
		
		scan.close();
	}

}
