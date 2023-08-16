package p00_examples;
import java.util.Scanner;
public class If_Statements_Ornekler {
public static void main(String[] args) {
/*Kullanıcıdan gün isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gün isimlerini
yazdırın. örneğin: girilen harf "P" çıktı olarak: "Pazartesi,Pazar,Perşembe"
(Büyük küçük harf problemi olmaması için "toUpperCase" methodunu kullanın.)
*/
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen istediğiniz gün isminin ilk harfini giriniz:");
char harf=scan.next().toLowerCase().charAt(0);
if (harf =='p') { System.out.println("Pazartesi, Perşembe ve Pazar."); }
else if (harf =='s') {System.out.println("Salı.");}
else if (harf=='ç') {System.out.println("Çarşamba.");}
else if (harf=='c') {System.out.println("Cuma ve Cumartesi.");}
else {System.out.println("İstenilenlerden birini girmediniz.");}

/*Kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve dikdörtgenin kare olup olmadığını yazdırın.*/
System.out.println("Dikdörtgen için istediğiniz kenar uzunluklarını giriniz:\n İlk kenar:");
int a = scan.nextInt();
System.out.println("İkinci kenar:");
int b = scan.nextInt();
if (a==b) {System.out.println("Girdiğiniz kenar uzunlukları eşit olduğu için sonuç bir 'Karedir'.");}
else {System.out.println("Girdiğiniz kenar uzunlukları: "+a+" cm, "+b+" cm uzunluklarında bir 'Dikdörtgendir'.");}
scan.close();
}}