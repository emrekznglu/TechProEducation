package p08_scope;
public class Scope2 {
//7- eğer birden fazla local'de (method'da) kullanacağınız variable varsa bunu class level'da oluşturmalısınız.

//8- variable 'nin static olup olmamasına nasıl karar veririz?
// bu sorunun cevabı variable'nin kullanılacağı local'lerle ilgilidir.
// eğer kullanılacak local static ise o zaman variable'i static  yapmak zorundayız.

static int sayiClass=10;
	
public static void main(String[] args) {
//5- class level'da olmayan variable'lara "local variable" denir.

//6- local variable'lar static olarak tanımlanamaz.
int sayiMain=10;
System.out.println(sayiClass);
System.out.println(sayiMain);
for (int i = 0; i<10; i++) {
String isim = "Mehmet"; // bu bir loop variable'dir ve loop'un dışında kullanılamaz
System.out.print(isim);

}

// System.out.println(isim);

}
public void method1() {
//System.out.println(sayiMain);

}

public static void method2() {
//System.out.println(sayiMain);


}





}