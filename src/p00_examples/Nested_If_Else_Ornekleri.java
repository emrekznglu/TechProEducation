package p00_examples;
import java.util.Scanner;
public class Nested_If_Else_Ornekleri {
public static void main(String[] args) {
/* Kullanıcıdan 4 basamaklı bir sayı girmesini isteyin. Girdiği sayı 5 'e bölünüyorsa son rakamını
kontrol edin. Son rakamı 0 ise ekrana "5'e bölünen çift sayı" yazdırın. Son rakamı 0 değil ise "5'e 
bölünen tek sayı" yazdıran. Girdiği password 5'e bölünmıyorsa ekrana "5'e bölünebilen bir sayı giriniz"
yazdırın.*/
Scanner scan =new Scanner(System.in);
System.out.println("4 basamaklı bir sayı giriniz:");
int sayi = scan.nextInt();
if (sayi>999 || sayi<-999) {
if(sayi%5==0){	
if (sayi%10==0) {System.out.println("5'e bölünebilen 4 basamaklı çift sayı.");}
else{System.out.println("5'e bölünebilen 4 basamaklı tek sayı.");}
}
else {System.out.println("5'e bölünebilen bir 4 basamaklı sayı giriniz.");}
}
else{System.out.println("Lütfen 4 basamaklı bir sayı giriniz.");}
scan.close();
}}