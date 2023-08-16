package p09_arrays;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		
		String str = "Java, candir.";
		
		//Split method'u bize bir array döner, dönen array'i ya  direkt yazdırmalıyız,
		System.out.println(Arrays.toString(str.split(",")));
		
		// Ya da method'dan dönen String'i barındıran bir array olduğunda bir array oluşturup ona assign edebiliriz.
		String bolunmusKelimeArray[]=str.split(",");
		System.out.println(bolunmusKelimeArray[1]); // " candir."
		
		String bolunmusKelimeArray2[]=str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2)); // "J, v, , c, ndir."
		System.out.println(bolunmusKelimeArray2.length); // 4
		
		String bolunmusKelimeArray3[]=str.split("");
		System.out.println(Arrays.toString(bolunmusKelimeArray3)); // String' i karakterlerine ayırır. "J, a, v, a, ,, , c, a, n, d, i, r, ."
		System.out.println(bolunmusKelimeArray3.length); // 13
		
		
		String cumle="Java ogren, rahat yasa"; // cümle kaç kelimeden oluşur?
		String kelimeArrayi[]=cumle.split(" ");
		System.out.println("Cümledeki kelime sayısı: "+kelimeArrayi.length);
		//harf sayısını bulmak için :
		String cumle2=cumle.replaceAll("\\W", "");
		System.out.println(cumle2);
		System.out.println("Harf sayısı: "+cumle2.length()); // 18
		
		String harfArrayi[]=cumle2.split("");
		System.out.println(harfArrayi.length); // 18
		
	}

}
