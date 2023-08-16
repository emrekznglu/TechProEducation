package p10_arraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists4 {

	public static void main(String[] args) {
		
		// 100'den büyük ilk 20 fibonaci sayısını list olarak yazdırın.
		
		List <Integer> fibonacci=new ArrayList<>();
		List <Integer> istenenSayilar=new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		int count=1;
		int sayi=0;
		int i=1;
		
		do {	
			sayi=fibonacci.get(i+1)+fibonacci.get(i);
			fibonacci.add(sayi);
			
			if(sayi>100) {
				istenenSayilar.add(sayi);
				count++;
			}
			i++;
		}while(count<=20);
		
		System.out.println(istenenSayilar);
		System.out.println(fibonacci);
	}

}
