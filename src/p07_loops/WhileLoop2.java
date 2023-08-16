package p07_loops;
import java.util.Scanner;
public class WhileLoop2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// Soru 5: Kullanicidan toplamak üzere sayı isteyin. Toplam 200 oluncaya kadar sayı istemeye devam edin.
// Toplam 200'ü geçtiğinde kullanıcının kaç sayı girdiğini ve bu sayıların toplamının kaç olduğunu yazdırın.

// For Loop da bir işlem yapabilmek için tekrar sayısını bilmek lazım ama While Loop 'da ise adım sayısı değil bitirme koşulu önemlidir.

short sayi=0,toplam=0,sayac=0;
while (toplam<200) {
System.out.println("Lütfen toplamak için bir tam sayı giriniz: ");
sayi=scan.nextShort();
toplam+=sayi;
sayac++;
}
// toplam 200 ü geçti demektir eğer bu satıra gelebildiysek.
System.out.println("Toplamda "+sayac+" adet sayı girdiniz ve bu sayıların toplamı: "+toplam);
// eğer adım sayısı bilinmiyor veya öngörülemiyorsa for loop değilde while loop kullanmak daha mantıklıdır. eğer adımlar belli ise
// for loop kullanmak daha mantıklı olabilir. iki satır fazla yazmaktan, veya değişimi unutup sonsuz loop'a girmekten kurtulmuş oluruz.

//Soru 6: Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.
//  Ornegin kullanici 3 girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
System.out.println("Lütfen bir rakam giriniz: ");
byte x = scan.nextByte();
byte y = 1;
while (y<=9) {
System.out.print(x+"x"+y+"="+(x*y)+" | ");
y++;
}
//Soru 7:  Kullanicidan bir sayi alin, bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin.
System.out.println("\nBir sayı giriniz: ");
short num=scan.nextShort();
short divide=1,times=0;
while(divide<=num) {
if(num%divide==0) {
System.out.print(divide+" ");
times++;
}
divide++;	
}
System.out.print(" | "+num+" sayısının "+times+" tane tam böleni vardır.");

//Soru 8: Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin.
System.out.println("\nLütfen bir sayı giriniz: ");
int i =scan.nextInt();
int total=0;
while (i>=1) {
int rakam=i%10;
total+=rakam;
i=i/10;
}
System.out.println("Girdiğiniz sayının rakamlar toplamı: " +total);

scan.close();
}}