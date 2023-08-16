package p00_examples;
import java.util.Scanner;
public class Ternary_Operator_Ornekler {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//Ornek1: Kullanıcıdan iki sayı alın büyük olanı yazdırın.
System.out.println("Lütfen birinci sayıyı giriniz:");
int a = scan.nextInt();
System.out.println("Lütfen ikinci sayıyı giriniz:");
int b = scan.nextInt();
int ornek1 = a>b ? a:b;
System.out.println(ornek1+"\n1. Örnek bitti.");
//Ornek2: Kullanıcıdan bir sayı alın ve sayının mutlak değerini yazdırın.
System.out.println("Negatif veya Pozitif bir sayı giriniz:");
int c = scan.nextInt();
int ornek2 = c<0 ? c*(-1):c;
System.out.println(ornek2+"\n2. Örnek bitti.");
//Ornek3: Kullanıcıdan bir sayı alın. Sayı pozitif yazdırın , negatifse sayının karesini yazdırın.
System.out.println("Negatif veya Pozitif bir sayı giriniz:");
int x = scan.nextInt();
System.out.println(x<0 ? x*x : x +"Girdiğiniz sayı pozitif.");
scan.close();
}}