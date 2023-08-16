package p14_passByValue;

import java.util.ArrayList;
import java.util.List;

public class PassByValueSoru3 {
	
	
	
	
	public static void main(String[] args) {
	/*Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup list elemanlarini artirmayi deneyelim
     - 1. Method’da elemanlari for each loop kullanarak artirin - 2. Method’da elemanlari set method’u kullanarak artirin
     - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.  */
		
		List<Integer> sayiList = new ArrayList <>();
		
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("İlk oluşturduğumuz liste: "+sayiList); // [10,11,12]
		
		forEachLoopIleArtir(sayiList);
		System.out.println("Foreach Loop Methodundan sonra Liste: "+sayiList); // [10,11,12]
		
		setIleArttir(sayiList);
		System.out.println("Set ve For Loop kullanarak methoddan sonra Liste: "+sayiList);
	
	
	}

	public static void setIleArttir(List<Integer> sayiList) {
		// Set ile elemanları arttıralım.
		int temp=0;
		for (int i = 0; i < sayiList.size(); i++) {
			
			temp=sayiList.get(i)+5;
			sayiList.set(i, temp);	
		}
		System.out.println(sayiList); // [15,16,17]
	}

	public static void forEachLoopIleArtir(List <Integer> sayiList) {
		// for each loop ile elemanları arttıralım.
		System.out.print("Foreach loop ile arttırdığımız elementler: ");
		for (Integer each : sayiList) {
		each+=2;	
		System.out.print(each+" "); // 12 13 14
		}
		System.out.println();
		System.out.println("Foreach loop'dan sonra list:  "+sayiList); // [10,11,12]
		
		// Foreach loop'da atama yapamadığımız için listeyi kalıcı olarak değiştiremedik.
	   // For loop kullanıp get method'u ile elementleri çağırınca da atama yapamadık,
	  // Dolayısıyla for loop ile elementleri kalıcı olarak değiştiremedik.
	}

}
