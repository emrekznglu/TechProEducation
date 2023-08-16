package p02_mathematicalOperators;
import java.util.Scanner;
public class Matematiksel_Operatorler_Soruları {
public static void main(String[] args) {
// Kullanıcıdan alınan dört haneli sayının rakamları toplamını yazdırma.
Scanner scan = new Scanner(System.in);
System.out.println("4 Haneli bir sayı giriniz: ");
int sayi= scan.nextInt();
int rakamlarToplami=0;
//bir sayının rakamlar toplamını bulmak için her basamak değerinde 3 işlem yaparız.
//1-Sayı 'nın mod10 'unu alarak son basamağını elde ederiz.
int rakam=sayi%10;
//2-Bu rakamı rakamlarToplamina ekleriz.
rakamlarToplami +=rakam;
//3-Değerini aldığımız son basamaktan kurtulmak için sayıyı 10'a böleriz.
sayi /=10;
//İlk durumda sayımız=ABCD ise bu aşamalardan sonra sayımız ABC olacak ve bunu hane sayısı kadar tekrarlayacağız.
rakam=sayi%10;
rakamlarToplami +=rakam;
sayi /=10;
rakam=sayi%10;
rakamlarToplami +=rakam;
sayi /=10;
rakam=sayi%10;
rakamlarToplami +=rakam;
sayi /=10;
System.out.println("Girilen Sayı' nın rakamları toplamı: "+rakamlarToplami);
scan.close();
}}