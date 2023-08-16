package p30_maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> objeMap =  new HashMap<>();
		
		objeMap.put(101, "Ali, Can, java");
		objeMap.put(102, "Veli, Yan, java");
		objeMap.put(103, "Ali, Yan, C#");
		
		System.out.println(objeMap);
	}

}