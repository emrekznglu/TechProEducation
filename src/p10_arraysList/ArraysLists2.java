package p10_arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysLists2 {

	public static void main(String[] args) {
		
		// Verilen bir array'de tekrar eden elementleri silip,tekrarsız yeni bir array haline getirin.
		
		int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3}; //length'i 13
		
		List <Integer> sayilar=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!sayilar.contains(arr[i])) {
			sayilar.add(arr[i]);
	}
}
		System.out.println(sayilar); // liste olarak tekrarsız elementlerden oluşur.
		Collections.sort(sayilar);
		System.out.println(sayilar);
		// yeni bir array oluşturup bu elemanları yeni array'e eklemeliyiz. yeni array'in length 'i 7 olacak. 
		int yeniArr[]=new int[sayilar.size()];
		for (int i = 0; i < yeniArr.length; i++) {
			yeniArr[i]=sayilar.get(i);
		}
		System.out.println(Arrays.toString(yeniArr));

	}

}
