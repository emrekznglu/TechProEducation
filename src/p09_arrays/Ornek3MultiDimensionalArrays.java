package p09_arrays;

import java.util.Arrays;

public class Ornek3MultiDimensionalArrays {

	public static void main(String[] args) {
		
		//Soru 3: Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
		// birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana yazdiran bir program yaziniz 
		// { {1,2,3}, {4,5}, {6,7} }
		
		int arr[][]={{1,2,3},{4,5},{6,7}};
		int i=0;
		int arr2[]= new int[arr.length];
		
		for (i = 0; i < arr.length; i++) {
			int toplam=0;
			for (int j = 0; j < arr[i].length; j++) {
			toplam+=arr[i][j];
			arr2[i]=toplam;
			
			}
		
		}
		System.out.print(Arrays.toString(arr2));
	}

}