package p06_methodCreation;
import java.util.Scanner;
public class Soru_Method_Creation {
public static void main(String[] args) {
/* Örnek 1 : Kullanicidan bir sayi alin. 
 1. Method: Bu sayinin tek mi cift mi oldugunu,
 2. Method: Sifirdan buyuk mu kucuk mu oldugunu 
 3. Method: Ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini, 
 100’den kucukse sadece 1’ler basamagini yazdirin.*/
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen bir tam sayı giriniz: ");
int num = scan.nextInt();
tekcift(num);
pozneg(num);
rakamtoplamı(num);

scan.close();
}
public static void tekcift(int num) {
if(num%2==0) {
System.out.println("Girilen sayı çift bir sayıdır.");	
}
else {
System.out.println("Girilen sayı tek bir sayıdır.");
}
}
public static void pozneg(int num) {
if(num>0) {
System.out.println("Girilen sayı pozitif bir sayıdır.");
}
else if(num<0) {
System.out.println("Girilen sayı negatif bir sayıdır.");
}
else {
System.out.println("0 negatif veya pozitif bir sayı değildir.");	
}
}
public static void rakamtoplamı(int num) {
if(num<100) {
System.out.println("Girdiğiniz sayının birler basamağı : "+(num%10));
}
else {
int rakamlartoplami=0,rakam=0;
rakam=num%10;
rakamlartoplami+=rakam;
num/=10;

rakam=num%10;
rakamlartoplami+=rakam;
num/=10;

rakam=num%10;
rakamlartoplami+=rakam;
num/=10;
System.out.println("Sayının birler,onlar ve yüzler basamağındaki rakamlar toplamı : "+rakamlartoplami);
}
}}