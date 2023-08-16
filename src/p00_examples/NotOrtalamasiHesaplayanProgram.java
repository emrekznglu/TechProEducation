package p00_examples;

import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {
		//Birer tane quiz, vize ve final. Oranları; quiz = 10% , vize = 30% , final = 60%
		
		Scanner notlar = new Scanner(System.in);
		double quiz1,vize1,final1;
		System.out.println("Birinci Quiz Notunuzu Giriniz : ");
		quiz1 = notlar.nextDouble();
		System.out.println("Birinci Vize Notunuzu Giriniz : ");
		vize1 = notlar.nextDouble();
		System.out.println("Birinci Final Notunuzu Giriniz : ");
		final1 = notlar.nextDouble();
				 double ortalama1 = (quiz1 * 10 / 100) + (vize1 * 30 / 100) + (final1 * 60 / 100) ;
		System.out.println("Not Ortalamanız : " + ortalama1);
		String sonuc = (ortalama1 >= 49.5) ? "Geçtiniz :) " : "Başarısız Oldunuz :( ";
		System.out.println(sonuc);
	notlar.close();
	}

}
