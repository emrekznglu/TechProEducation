package p07_loops;
import java.util.Scanner;
public class NestedForLoop2 {
public static void main(String[] args) {
// Soru 2: Interview Question Kullanicidan 10 ve 10'dan kucuk bir sayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen 10 veya daha küçük pozitif bir tam sayı giriniz: ");
byte a=scan.nextByte();
int faktoriyel= 1;
for(byte b=1;b<=a;b++) {
faktoriyel = faktoriyel * b;
}
System.out.println("Girdiğiniz sayının ("+a+"!) faktöriyeli= "+faktoriyel);
// Soru 3: Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz.
System.out.println("Lütfen ilki büyük diğeri küçük olacak şekilde  2 tane pozitif tam sayı giriniz:");
int y= scan.nextInt();
int x=scan.nextInt();
int toplam = y;
for(int z=x;z<y;z++) {
toplam= toplam+z;
}
System.out.println(toplam);
/* Soru 4:) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
1 2 3
2 4 6
3 6 9
*/
System.out.println("Lütfen bir rakam giriniz: ");
int num = scan.nextInt();
for(int satırNo=1;satırNo<=num;satırNo++) {
for (int i = 1; i <=num; i++) {
System.out.print(satırNo*i+" ");
}
System.out.println();
}
scan.close();
}}