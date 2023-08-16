package p05_stringManipulation;
import java.util.Scanner;
public class Ornekler6_String_Manipulation {
public static void main(String[] args) {
// Örnek 6 : Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

Scanner scan = new Scanner(System.in);
System.out.println("Lütfen isminizi giriniz: ");
String name = scan.next();
System.out.println("Lütfen soyisminizi girinizi: ");
String surname = scan.next();
if (name.length()>surname.length()) {
System.out.println("İsminiz daha uzun : "+name);	
}
else {
System.out.println("Soyisminiz daha uzun : "+surname);
}
scan.close();
}}