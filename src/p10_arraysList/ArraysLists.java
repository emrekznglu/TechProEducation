package p10_arraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists {

	public static void main(String[] args) {
		// Oluşturma:
		List <String> isimler = new ArrayList<>();
		//Ekleme:
		isimler.add("Ali");
		System.out.println(isimler);
		isimler.add("Veli");
		isimler.add("Ali");
		System.out.println(isimler);
		// Özel bir index'e eklemek isterseniz, o zaman index'li add method'unu kullanmalıyız.
		isimler.add(1, "Hasan");
		System.out.println(isimler);
		
		List <String> names = new ArrayList<>();
		
		names.add("Fırat");
		System.out.println(names);
		// names listesinin sonuna isimler listesini eklemek istersek:
		names.addAll(isimler);
		System.out.println(names);
		
		// Eleman sayısını öğrenmek için: .size() methodu (Sayı çevirir)
		System.out.println(names.size());
		
		// List'e boş mu dolu mu öğrenmek için: .isEmpty() methodu (True ve False çevirir)
		System.out.println(names.isEmpty());
		
		// List'ten bir eleman kaldırmak (silmek) için: .remove() methodu
		List <Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
		sayilar.add(20);
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar); // [10, 20, 30, 40] çevirir
		System.out.println(sayilar.remove(2)); // 2. indexteki elemanı sildiğini gösterir. 30 çevirir
		System.out.println(sayilar); // 42. satırda 2. indexte bulunan 30 sayisini sildiği için [10, 20, 40] çevirir
		int  silinenEleman = sayilar.remove(1); // 1. indexte bulunan 20 sayısını silip bir yere atadık
		System.out.println(sayilar); // [10, 40] çevirir
		System.out.println(silinenEleman); // 20 çevirir
		// remove methodu ile hem yukarıdaki gibi index girerek bir değeri silebiliriz
		// aşşağıda olduğu gibi değerin kendisini girerekte silebiliriz
		
		// sayilar.remove(10); hata verir eğer listemiz sayılardan oluşuyorsa biz silmesini istediğimiz sayıyı girdiğimizde
		//  java index olarak algılar ama string liste için böyle bir problem olmaz
		System.out.println(names);
		names.remove("Ali"); // ilk ali kelimesini siler
		System.out.println(names);
		// index'siz remove() methodu true veya false döndürür.
		//System.out.println("Ali"); // kaldırdıysa true kaldrmadıysa false çevirir.
		
		boolean sonuc = names.remove("Mehmet");
		if (sonuc) {System.out.println("Mehmet 'i buldum ve sildim.");
		}
		else { System.out.println("Mehmet 'i bulamadım dolayısıyıla silemedim.");
		}
		
		names.removeAll(names);
		System.out.println(names);
		System.out.println(isimler);
		names.addAll(isimler);
		System.out.println(names); // [Ali, Hasan, Veli, Ali]
		
		// List'teki elemanlar üzerinde değişiklik yapmak için: set() methodu
		names.set(0, "Fatma"); // [Fatma, Hasan, Veli, Ali]
		System.out.println(names);
		
		System.out.println(names.set(0, "Adem")); // değiştirilen elemanı verir bize "Fatma"
		
		
	}
}
