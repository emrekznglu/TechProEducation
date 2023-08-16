package p22_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions09 {

	public static void main(String[] args) {
		// List ve array'de varolmayan bir index ile islem yapmak isterseniz
		// Java IndexOutOfBoundsException verir
		
		int arr[]= {1,2,5,6};
		
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 6
		
		try {
			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
			} catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			}
		
		List<String> list= new ArrayList<>();
		list.add("Bahattin");
		list.add("Kazim");
		list.add("Celil");
		
		System.out.println(list);
		System.out.println(list.get(1));//Kazim
		
		try {
		System.out.println(list.get(3)); // IndexOutOfBoundsException
		} catch(IndexOutOfBoundsException e) {
		e.printStackTrace();
		}
	
		System.out.println("Kod sonu");
	
	}
}