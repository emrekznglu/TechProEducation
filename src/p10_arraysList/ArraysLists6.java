package p10_arraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists6 {

	public static void main(String[] args) {
		/* Input olarak verilen 2 listeyi parametre olarak kabul edip,ortak isimleri yazdiran bir method yazın.

Input:    list1={Ali,Veli,Ayse,Fatma,Omer}
             list2={Ali,Kemal,Hatice,Fatma,Omer,Yusuf}
Output= [Ali,Fatma,Omer]
		 */
		
		List <String> list1=new ArrayList<>();
		
		list1.add("ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("FAtMa");
		list1.add("Omer");
		
		List <String> list2=new ArrayList<>();
		
		list2.add("Ali");
		list2.add("Kemal");
		list2.add("Hatice");
		list2.add("Fatma");
		list2.add("Omer");
		list2.add("Yusuf");
		
		ortakList(list1,list2);
	}

	public static void ortakList(List<String> list1, List<String> list2) {
		List<String> ortakIsimler = new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
			if(list1.get(i).equalsIgnoreCase(list2.get(j))) {
			ortakIsimler.add(list1.get(i));
			}
			}
		}
	System.out.println(ortakIsimler);
	}

}
