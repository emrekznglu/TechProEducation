package p07_loops;
import java.util.Scanner;
public class ForLoop {
public static void main(String[] args) {
//For Döngüsü: Soru 1: 10 kere "Java güzeldir." yazdır.
for(int i=1;i<=10;i++) {
System.out.print("Java güzeldir. - ");
}
// Soru 2 : 30'dan başlayarak 10'a kadar olan çift sayıları arasında virgül olacak şekilde tek satırda yazdır.
for(int a=30;a>=10;a-=2) {
System.out.print(a+" , ");
}
// Soru 3: Kullanicidan 100’den kucuk bir pozitif tam sayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
Scanner scan = new Scanner(System.in);
System.out.println("\nLütfen 100'den küçük pozitif bir tam sayı giriniz: ");
int b =scan.nextInt();
for(int c=3;c<=b;c+=3) {
System.out.print(c+" ");
}
/* Soru 4: Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.  Ancak;
- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin. */
System.out.println("\nLütfen 100'den küçük pozitif bir tam sayı giriniz: ");
int x =scan.nextInt();
for(int y=1;y<=x;y++) {
if (y%15==0) {
System.out.print("Java Güzeldir, ");	
}
else if (y%5==0) {
System.out.print("Güzeldir, ");
}
else if(y%3==0) {
System.out.print("Java, ");	
}
else {
System.out.print(y+", ");
}
}
scan.close();
}}