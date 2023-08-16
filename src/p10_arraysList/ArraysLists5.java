package p10_arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysLists5 {

	public static void main(String[] args) {
		// Kullanicidan isimler isteyin ve bunlari bir list'te depolayin. Kullanici yeter yazana kadar isim istemeye devam edin.
		// isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin.
		// isimList = Ali,Veli,Ayse,Fatma,Zeki,Kemal
		// Not: yeter için kucuk buyuk harf onemli degil
		Scanner scan = new Scanner(System.in);
		List<String> girilenIsimler=new ArrayList<>();
		String isim;
		byte count=0;
		do {
			System.out.println("Lütfen listeye eklemek için isim giriniz:\nBitirmek için yeter yazınız.");
			isim=scan.nextLine();
			if(!isim.equalsIgnoreCase("yeter")) {
			girilenIsimler.add(isim);
			}
			
		} while(!isim.equalsIgnoreCase("yeter"));
		
		String isimler[]={"Ali","Veli","Ayse","Fatma","Zeki","Kemal"};
		List <String> isimList = Arrays.asList(isimler);
		
		System.out.println("Toplam: "+girilenIsimler.size()+" isim girdiniz.");
		
		for (int i = 0; i < girilenIsimler.size(); i++) {
		girilenIsimler.get(i);
		if(isimList.contains(girilenIsimler.get(i))) {
		count++;
		}
		}
		System.out.println("Girdiğiniz isimlerden "+count+" tanesi bende yazılı.");
		
scan.close();
}
}