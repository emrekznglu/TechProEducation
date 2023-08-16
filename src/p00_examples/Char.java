package p00_examples;
import java.util.Scanner;
public class Char {
public static void main(String[] args) {
// Kullanıcıdan ismini alıp isminin baş harfini yazdırma.
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen isminizi giriniz: ");
	char ilkHarf=scan.nextLine().charAt(0);
	System.out.println("isminizin ilk harfi: "+ilkHarf);
scan.close();
}}
