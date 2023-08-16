package p00_examples;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		Scanner atm = new Scanner(System.in);
		int bakiye=1000,secim,miktar;

		System.out.println("Cici Kuş bankasına hoşgeldiniz." + "\nişimiz paranız.");
		System.out.println("Güncel bakiyeniz: " + bakiye + " TL");
		while(bakiye >= 0) {
			System.out.println("\n1-) Para Yatır\n2-) Para Çek\n3-) Bakiye Sorgula\n4-) Kartı İade et\nYapmak istediğiniz işlemi tuşlayın: ");
			secim = atm.nextInt();
			if(secim == 1) {
				System.out.println("Yatırmak istediğiniz tutarı giriniz (TL) : ");
				miktar = atm.nextInt();
				System.out.println("Yatırmak istediğiniz tutar: " + miktar + " TL");
				bakiye +=miktar;
			}
			else if(secim ==2){
				System.out.println("Çekmek istediğiniz miktarı giriniz (TL) :");
				miktar = atm.nextInt();
				System.out.println("Çektiğiniz tutar: "+ miktar +" TL");
				bakiye -=miktar;
				if(miktar>bakiye) {
					System.out.println("Yetersiz bakiye lütfen tekrar deneyiniz.");

				}
				else{
					bakiye -=miktar;
				}
			}
			else if(secim ==3) {
				System.out.println("Bakiyeniz : " + bakiye + " TL");
			}
			else if(secim ==4) {
				System.out.println("Güle Güle Cici Kuş Bankası İyi Günler Diler. :)");
				break;
			}
			else{
				System.out.println("Hatalı tuşlama yaptınız lütfen seçeneklerden birini tuşlayın.");
			}
		}
		atm.close();
	}
}
