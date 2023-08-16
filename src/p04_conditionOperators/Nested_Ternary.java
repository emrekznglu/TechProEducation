package p04_conditionOperators;
import java.util.Scanner;
public class Nested_Ternary {
public static void main(String[] args) {
//Kullanıcıdan bir tam sayı alın ve sayı 10'dan küçükse "Rakam", 100'den küçükse "iki basamaklı sayi" değilse "üç basamaklı sayı" yazsın
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen bir tam sayı giriniz:");
int a = scan.nextInt();
System.out.println(a<10 ? "Rakam veya Negatif" : a<100 ? "İki basamaklı sayı" : "Üç basamaklı sayı");
scan.close();
}}