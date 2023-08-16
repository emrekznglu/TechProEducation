package p20_inheritance;

public class UstaBasi03 extends Isci03{
	
	public String bolum="takimhane";
	public int sorOldIscisay=20; // sorumlu olduğu işçi sayısı
	
	public static void main(String[] args) {
		
		UstaBasi03 ub1=new UstaBasi03();
		// Objeyi torun clasinda olusturunca 3 class'a da ulasabiliyoruz

		System.out.println(ub1.bolum);// UstaBasi03
		System.out.println(ub1.sorOldIscisay);// UstaBasi03
		System.out.println(ub1.saatUcreti);// Isci03
		System.out.println(ub1.isim);// Personel03
		
		//List<String> list = new ArrayList<>();
		//Object str=new String("Hasan");
		Isci03 ub2=new UstaBasi03();
		// Extends ile birbirine bagli olan class'larda IS-A relation olan 
		// Data turleri istege bagli olarak kullanilabilir.
		// Daha genis Data turu Yazmanin avantaji :
		// Kapsamin daha genis olmasi
		// Daha genis Data turu Yazmanin dezavantaji :
		// Data turu olarak sectigimiz class ve parent(larina) ait datalara ulasabiliriz
		System.out.println(ub2.departman);//Isci03
		System.out.println(ub2.izindeMi);//Personel03
		
		
		Personel03 ub3=new UstaBasi03();
		System.out.println(ub3.id); //Personel03
		
		
	}

}
