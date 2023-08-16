package p14_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValueSoru4 {

	public static void main(String[] args) {
/* Bir list ve bir array olusturalim ve eleman olarak 10,11,12 ekleyelim. Iki method olusturup list ve array’i degistirmeyi deneyelim
- 1. Method’da array’e yeni bir array assign edelim ve yeni halini yazdiralim
- 2. Method’da list’e yeni bir list assign edelim ve yeni halini yazdiralim
- Method call’dan sonra main method’da yeniden yazdirip degisip degismediklerini kontrol edelim. */
		
		int arr[]= {10,11,12};
		System.out.println("ilk oluştuğunda array: "+Arrays.toString(arr)); // [10,11,12]
		
		arrayiDegistir(arr);
		System.out.println("arrayiDegistir methodundan sonra arr: "+Arrays.toString(arr));
		
List<Integer> sayiList = new ArrayList <>();
	
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("İlk oluşturduğumuz liste: "+sayiList); // [10,11,12]
		
		listDegistir(sayiList);
		System.out.println("listDegistir methodundan sonraki list: "+sayiList);
		
	}

	private static void listDegistir(List<Integer> sayiList) {
		// Bu method'da sayiList'e yeni bir değer atayalım.
		
		sayiList=new ArrayList<>();
		sayiList.add(50);
		System.out.println("Method içinde değişen list: "+sayiList);
	}

	private static void arrayiDegistir(int[] arr) {
		// Bu method'da array'e yeni bir array assign edelim.
		
		arr= new int[4];
		arr[0]=15;
		arr[1]=25;
		arr[2]=35;
		arr[3]=45;
		System.out.println("Method içinde arr: "+Arrays.toString(arr));
	}
	
	
	
	
	
}