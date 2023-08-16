package p05_stringManipulation;
import java.util.Scanner;
public class Ornekler2_String_Manipulation {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
/* Örnek 2: Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
yazdirin
- Ilk harf buyuk harf olmali
- Son harf kucuk harf olmali
- Sifre bosluk icermemeli
- Sifre uzunlugu en az 8 karakter olmali */
System.out.println("Lütfen Oluşturmak istediğinizi şifreyi giriniz: ");
String pw = scan.nextLine();
boolean ilkharfKontrol = pw.charAt(0)>= 'A' && pw.charAt(0)<='Z';
boolean sonHarfKontrol = pw.charAt(pw.length()-1) >= 'a' && pw.charAt(pw.length()-1) <= 'z';
boolean spaceKontrol =! pw.contains(" ");
boolean uzunlukKontrol = pw.length()>8;
if(ilkharfKontrol && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
System.out.println("Sifre basari ile tanimlandi");	
}
else {
System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
}
scan.close();
}}