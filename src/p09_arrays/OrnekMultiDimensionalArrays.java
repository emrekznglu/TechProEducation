package p09_arrays;
public class OrnekMultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		// Soru 1: Aşşağıdaki multi dimensional Array'in tüm elemanlarının çarpımını ekrana yazdıran bir method yazınız.
		int arr[] []= {{1},{2,3,4}};
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
		carpim*=arr[i][j];
		}
		}
		System.out.println(carpim);
	}

	
	
	
}