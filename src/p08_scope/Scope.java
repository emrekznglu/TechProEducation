package p08_scope;
public class Scope {
//1- Main method'un dışında oluşturulan variable'lara class level variable denir.
int sayi1;
int sayi2=10;
//3- static olmayan variable'lar static alanlardan ulaşılamaz.
String str1;
String str2="Java";

static boolean anladinMi;
//2- static olarak tanımlanan variable'lar class içinde her yerden kullanilabilir. 
// (static olarak tanımlanan variable'lar static olsun veya olmasın her method'un içinden ulaşabiliriz ve kullanabiliriz.)
static boolean biliyormusun=true;
// 4- Class level'da oluşturulan variable'lara (static olsun veya olmasın) değer atamadan da kullanılabilir.
// eğer biz değer atamazsak Java, class level'daki variable'lara default değerler atar
// Örneğin; sayısal değerler için =0 | boolean = false | string = null | char = '' (hiçlik)


public static void main(String[] args) {
for (int i = 0; i<10; i++) {
System.out.println(i+" ");
i=10;
}
// System.out.println(i); // Scope (Kapsama alanı) dışında i yi kullanamayız. 
// "i" variable'ı for döngüsü içerisinde tanımlandığı için oranın dışında kullanılamaz
// i=10; // scope dışında i yi kullanamayız.
// int sayi;
// sayi++;
// System.out.println(sayi);

// method1(); // main method static kulübüne üye, bu kulübe üye olmayanları muhatap almaz.
method2();
anladinMi=true;
// System.out.println(str1);

}
public void method1() {
System.out.println("method1 çalıştı");
sayi1=20;
System.out.println(anladinMi);
System.out.println(str1);
}


public static void method2() {
System.out.println("method2 çalıştı");
System.out.println(biliyormusun);
// System.out.println(sayi2);
}

}