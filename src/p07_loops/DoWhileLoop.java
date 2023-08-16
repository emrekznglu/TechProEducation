package p07_loops;
import java.util.Scanner;
public class DoWhileLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// Do-While: Soru 1: Kullanıcıdan iki pozitif sayı isteyin
// Kullanıcı negatif sayı girdiğinde girilen negatif sayıları yok edip, yeniden değer isteyin
// Kullanıcı doğru giriş yaptığında "Well Done" ve sayıların çarpımını yazdırın.
System.out.println("Lütfen iki pozitif tam sayı giriniz: ");
int num1;
int num2;
do {
num1=scan.nextInt();
num2=scan.nextInt();
if(num1>0&&num2>0) {
System.out.println("Well Done \nGirilen sayıların çarpımı:"+(num1*num2));
}
else {
System.out.println("Lütfen  pozitif iki tam sayı giriniz.");
}	
} while (!(num1>0 && num2>0));

System.out.println("----------------------------------------------------");

// Soru 2: Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
// Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
// Kullanıcı negatif sayı girerse ignore (görmezden gelin) edin.
System.out.println("Lütfen pozitif tam sayılar giriniz: ");
int x;
int count=0;
int total=0;
do {
System.out.println("Lütfen toplamak için pozitif sayılar girin\nİşlemi bitirmek için 0'a basın.");
x=scan.nextInt();
// Kullanıcıdan alınan sayıyı pozitif mi diye kontrol edicez.
if (x>0) {
total+=x;
count++;
}
else if (x<0) {
System.out.println("Pozitif bir sayı girmeliydiniz (bu sayı negatif olduğu için yok sayıyorum.)");
}
else {
}
} while (x!=0);
System.out.println("Girdiğiniz sayılardan "+count+" tanesi pozitifti\nPozitif sayıların toplamı ise: "+total);
scan.close();
}}