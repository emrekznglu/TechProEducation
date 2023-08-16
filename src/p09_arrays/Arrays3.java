package p09_arrays;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		
		// Verilen bir array'i büyükten küçüğe sıralayan bir method yazın.
		
		int arr[]= {90,30,10,11,9,23};
		arr = arrayiSirala(arr);
		arr=arrayiTerstenSirala(arr);
		System.out.println(Arrays.toString(arr));
}
	private static int[] arrayiSirala(int[] arr) {
		// Öncelikle array'i küçükten büyüğe sıralamalıyız.	
		Arrays.sort(arr);
		return arr;
}
	private static int[] arrayiTerstenSirala(int[] arr) {

		int[] temp = new int[arr.length]; // eski array ile aynı uzunlukta bir array oluşturdum.
		
		for (int i = 0; i < temp.length;i++) {
			
		temp[i]=arr[arr.length-1-i];	
		}
		// temp array'i istediğim gibi arr'nin ters sıralanışı oldu bunu main method'a return etmem lazım.
		return temp;
}



}