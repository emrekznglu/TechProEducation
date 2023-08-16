package p00_examples;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		try (Scanner hesapmakinesi = new Scanner(System.in)) {
			double sayi1 , sayi2;
			System.out.println("İlk sayıyı giriniz : ");
			sayi1 = hesapmakinesi.nextDouble();
			System.out.println("İkinci sayıyı giriniz : ");
			sayi2 = hesapmakinesi.nextDouble();
			System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
			System.out.println("> Toplama ( + ) \n> Çıkarma ( - ) \n> Çarpma ( * ) \n> Bölme ( / ) \n Hangisiyse işaretini veya ismini yazın : ");
			
			String secim = hesapmakinesi.next();
			if (secim.equals("toplama") || secim.equals("+") || secim.equals("Toplama")) { System.out.println("Sonuç = " + (sayi1 + sayi2));}
			else if (secim.equals("Çıkarma") || secim.equals ("-") || secim.equals ("Çıkarma")) { System.out.println("Sonuç =" + (sayi1 - sayi2));}
			else if (secim.equals("Çarpma") || secim.equals ("*") || secim.equals ("Çarpma")) { System.out.println("Sonuç = " + (sayi1 * sayi2));}
			
			if (sayi2 == 0) { System.out.println("0 tarafından bölünemez.!!!");}
			else if (secim.equals("bölme") || secim.equals("/") || secim.equals ("Bölme")) { System.out.println("Sonuç = " + (sayi1 / sayi2));}
			else { System.out.println("Yapılacak işlem bulunamadı.!!!");}
}}}