package p07_loops;
import java.util.Scanner;
public class DoWhileLoop3 {
public static void main(String[] args) {
// Soru 6: Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam istemeyi ettirin.
// Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin
Scanner scan = new Scanner(System.in);
int x=0;
int timer=0;
int total=0;
do {
System.out.println("Bir sayı giriniz: ");
x=scan.nextInt();
if(x>0) {
total+=x;
timer++;
}
} while(total<500);
System.out.println("Girilen sayıların toplamı = "+total+" | "+timer+" tane sayı girdiniz.");
scan.close();
}}