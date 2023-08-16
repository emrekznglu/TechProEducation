package p05_stringManipulation;
import java.util.Scanner;
public class Ornekler_String_Manipulation {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
/* Örnek 1: Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
(isim-soyisim : M***** B*******kart no : **** **** **** 1234) */
System.out.println("Lütfen isminizi giriniz:");
String ad = scan.next();
System.out.println("Lütfen soyisminizi giriniz:");
String soyad = scan.next();
System.out.println("Lütfen 16 haneli kart numaranızı tuşlayınız:");
String kkNo = scan.next();
System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\w", "*")
+" "+
soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w", "*"));
String kredi = kkNo.substring(12);
System.out.println("**** **** **** "+kredi);
scan.close();
}}