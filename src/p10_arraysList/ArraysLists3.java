package p10_arraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists3 {

	public static void main(String[] args) {
		
		// 200'e kadar olan  fibonacci sayılarını  bir list olarak yazdırın.
		// 1,1,2,3,5,8,13,21,34,.....
		
		List <Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		
		System.out.println(fibonacci);
		
		int i=0;
		int index=1;
		
		 while (i<200) {
			i=fibonacci.get(index)+fibonacci.get(index+1);
		if(i<200) {
			fibonacci.add(i);
		}
			index++;
		}
		
		System.out.println(fibonacci);

	}

}
