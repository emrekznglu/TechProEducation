package p05_stringManipulation;
import java.util.Scanner;
public class Ornekler3_String_Manipulations {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// Örnek 3: Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
System.out.println("Lütfen 4 harfli bir kelime giriniz:");
String kelime =scan.next();
boolean uzunluk=kelime.length()==4;
if(uzunluk) {
System.out.println(kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
}
else {
System.out.println("Hata! Girdiğiniz kelime 4 harften kısa veya uzundur.");	
}
scan.close();
}}