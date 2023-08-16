package p00_examples;
import java.util.Scanner;
public class Nested_Ternary_Ornekler {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//Ornek 1: Kullanıcıdan iki adet uzunluk alıp, girilen değerlerle oluşturulan dörtgenin kare mi yoksa dikdörtgen mi olduğunu yazdır.
System.out.println("Lütfen dörtgenin birinci uzunluğunu giriniz: ");
int a = scan.nextInt();
System.out.println("Lütfen dörtgenin ikinci uzunluğunu giriniz: ");
int b = scan.nextInt();
String dortgen = a==b ? "Kare" : "Dikdörtgen";
System.out.println(dortgen);
//Ornek 2: Kullanıcıdan bir sayı alın ve üç basamaklı ise üç basamaklı sayı değilse üç basamaklı sayı değil yazdırın.
System.out.println("1. Örnek bitti.\nLütfen bir sayı giriniz:");
int x = scan.nextInt();
System.out.println(x<100 ? "Üç basamaklı sayı değil" : "Üç basamaklı sayı");
scan.close();
}}