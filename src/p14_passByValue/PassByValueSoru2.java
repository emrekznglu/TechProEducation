package p14_passByValue;
public class PassByValueSoru2 {
	
	public static void main(String[] args) {
		// Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun. 
		// - Method’da indirim uygulayip fiyati main method’da yazdirin
		// - Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
		
		int fiyat=100;
		
		
		System.out.println("10% indirilmiş hali: "+indirimYap10(fiyat));
		
		System.out.println("20% indirilmiş hali: "+indirimYap20(fiyat));
		
		System.out.println("25% indirilmiş hali: "+indirimYap25(fiyat));
		
		System.out.println("Method Call sonrası fiyat: "+fiyat);
	}

	public static int indirimYap25(int fiyat) {
		fiyat=fiyat*75/100;
		return fiyat;
	}

	public static int indirimYap20(int fiyat) {
		fiyat=fiyat*80/100;
		return fiyat;
	}

	public static int indirimYap10(int fiyat) {
		
		fiyat-=fiyat/10;
		return fiyat;
		}
	
}