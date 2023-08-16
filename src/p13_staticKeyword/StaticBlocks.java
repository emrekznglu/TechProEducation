package p13_staticKeyword;
public class StaticBlocks {
	
	static int sayi=10;
	
	static { // Static block her şeyden önce çalışmaya başlar. Main method'dan bile önce çalışmaya başlar.
		      // Fakat Main Method olmadan Static Block'lar çalışmaz.
		System.out.println("Birinci Static Block çalıştı.");
	sayi=20;
	}
	
	static {
		System.out.println("İkinci Static Block çalıştı.");
	sayi=20;
	}
	
	static {
		System.out.println("Üçüncü Static Block çalıştı.");
	sayi=30;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method'un ilk satırında sayi: "+sayi); // Static block ilk çalıştığı için 10 değilde 20 olur sonuç.
		// Kullanılan class'ların 80% inde static block bulunmaz, istisnai bir durumdur.

	}
	
	static {
	System.out.println("Main Method'dan sonraki Static Block yani 4. Static Block çalıştı.");
	sayi=40;
	}
}