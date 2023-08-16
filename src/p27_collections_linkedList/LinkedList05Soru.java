package p27_collections_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList05Soru {

	public static void main(String[] args) {
		/* Soru: Elemanları "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun. Kullanicidan bir isim alin. 
		Bu isim LinkedList'de varsa silin ve kullaniciya "Bu isim LinkedList'de vardi ve silindi“ diye mesaj verin.
		Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin.
		*/
		LinkedList <String> names = new LinkedList<>();
		
		names.add("Ali");
		names.add("Veli");
		names.add("Can");
		names.add("Ayse");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz: ");
		String input1 = scan.next();
		
		if (names.contains(input1)) {
			names.remove(input1);
			System.out.println("Bu isim LinkedList'de vardi ve silindi.");
		}
		else {
			System.out.println("Bu isim LinkedList'de yoktu o yüzden silinemedi.");
		}
		
		scan.close();
	}
}