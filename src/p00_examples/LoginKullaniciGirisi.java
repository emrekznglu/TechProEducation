package p00_examples;

import java.util.Scanner;

public class LoginKullaniciGirisi {

	public static void main(String[] args) {
		
			try (Scanner login = new Scanner(System.in)) {
				String giris="";
				String id="";
				String sifre="";
				String kadi="";
				String parola="";
				
				// Girişe mi gidilecek yoksa Kayıta mi gidilecek
				
				System.out.println("Giriş yapmak için Giriş yazın eğer hesabınız yoksa sadece Enter 'a basın.");
				giris = login.nextLine();
				if(giris.equals("Giriş") || giris.equals("giriş") || giris.equals("giris") || giris.equals("gırıs")){
				
				
				//Giriş kısmı 1

				System.out.println("Kullanıcı Adını Giriniz : ");
				kadi = login.nextLine();		
				System.out.println("Parolanızı Giriniz : ");
				parola = login.nextLine();
				if(kadi.equals(id) && parola.equals(sifre)) { 
					System.out.println("Hoşgeldiniz.");
					}
				else { System.out.println("Kullanıcı adınız veya şifreniz yanlış!");
				}
					}
					
				else {
				
				//Kayıt Kısmı
				
				System.out.println("Kullanmak istediniz kullanıcı adınızı giriniz : ");
				id = login.nextLine();
				System.out.println("Kullanmak istediğiniz şifreyi giriniz : ");
				sifre = login.nextLine();
				}
				
				//Giriş Kısmı 2

				System.out.println("Kullanıcı Adınızı Giriniz : ");
				kadi = login.nextLine();
				System.out.println("Parolanızı Giriniz : ");
				parola = login.nextLine();
				if(kadi.equals(id) && parola.equals(sifre)) {
					System.out.println("Hoşgeldiniz.");
				}
					else {System.out.println("Kullanıcı adınız veya şifreniz Yanlış!");}
			}
		}
	    
	}
	    
	    
	