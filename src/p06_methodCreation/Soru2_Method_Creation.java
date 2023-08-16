package p06_methodCreation;
import java.util.Scanner;
public class Soru2_Method_Creation {
public static void main(String[] args) {
/* Örnek 2 : Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.*/
Scanner scan = new Scanner(System.in);
System.out.println("Kaç adet sayıyı toplamak istersiniz: ");
byte adeti=scan.nextByte();
adet(adeti);

scan.close();
}
public static void adet(byte adeti) {
switch(adeti) {
case 2:ikilitoplama();
break;
case 3:uclutoplama();
break;
case 4:dortlutoplama();
break;
default: System.out.println("Hatalı tuşlama yaptınız lütfen 2,3 veya 4 'ü tuşlayınız.");
}
}
public static void ikilitoplama() {
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen tek tek sayılarınızı giriniz: ");
int num1=scan.nextInt();
int num2=scan.nextInt();
System.out.println("Girilen sayılarınızın toplamı = "+(num1+num2));
scan.close();
}
public static void uclutoplama() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen tek tek sayılarınızı giriniz: ");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int num3=scan.nextInt();
	System.out.println("Girilen sayılarınızın toplamı = "+(num1+num2+num3));
	scan.close();
}
public static void dortlutoplama() {
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen tek tek sayılarınızı giriniz: ");
int num1=scan.nextInt();
int num2=scan.nextInt();
int num3=scan.nextInt();
int num4=scan.nextInt();
System.out.println("Girilen sayılarınızın toplamı = "+(num1+num2+num3+num4));
scan.close();
}
}