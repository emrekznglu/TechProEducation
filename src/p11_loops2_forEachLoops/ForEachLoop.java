package p11_loops2_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		//for-each loop index veya size'a bakmadan tek tek tüm elementleri bize getirir.
		// Aşşağıdaki listelerdeki isimlerden 4 harften uzun olan isimleri direkt yazdiralim.
		
List <String> list1=new ArrayList<>();
		
		list1.add("ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
		List <String> list2=new ArrayList<>();
		
		list2.add("Ali");
		list2.add("Kemal");
		list2.add("Hatice");
		list2.add("FATma");
		list2.add("Omer");
		list2.add("Yusuf");
		
		//   ilk string gelecek elementlerin data türü / ikinci ise getirdiği elementlere verilecek geçici isim (genelde each ismi kullanılır)
		for (String each : list2) {
	   //                     3. olarakta elementlerin geleceği collection (array,list)
		
		 if(each.length()>4) {
			 System.out.print(each+" ");
		 }
		}
		
		
		
		
		
	}

}
