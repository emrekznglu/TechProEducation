package p15_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClasses04 {

public static void main(String[] args) {
		
	List <String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
//		list.add(7); Hata verir
		
		for(String s : list) {
		System.out.println(s);
		}
		
	}

}
