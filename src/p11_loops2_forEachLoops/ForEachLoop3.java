package p11_loops2_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop3 {

	public static void main(String[] args) {
		// Soru 2: İki String array oluşturunuz ve bu array'lerdeki ortak elemanları For-each loop kullanarak bulunuz.
		// Ortak eleman yoksa ekrana "Ortak eleman yok" yazdırınız.

		String arr1[]= {"A","b","C","d"};
		String arr2[]= {"A","z","W","d","c"};
		
		List<String> ortaklar=new ArrayList<>();
		
		for (String each1:arr1) {
			for(String each2:arr2) {
				if (each1.equalsIgnoreCase(each2)) {
					ortaklar.add(each1);
				}
			}
		}
		
		if (ortaklar.isEmpty()) {
		System.out.println("Ortak eleman yok.");
		}
		else {
		System.out.println(ortaklar);
		}
		}
	

}
