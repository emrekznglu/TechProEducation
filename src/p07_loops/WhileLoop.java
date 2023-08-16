package p07_loops;
import java.util.Scanner;
public class WhileLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// Soru 1: While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
byte a =3;
while (a<=13) {
if(a%2==1) {
System.out.print(a+" ");
}
a++;
}
System.out.println();
// Soru 2: For loop ve while Loop kullanarak 2 basamakli sayilardan 5, 7 ve 13’e tam bolunebilen sayilari yazdirin.
for(byte b =10;b<100;b++) {
while (b%5==0||b%7==0||b%13==0) {
System.out.print(b+" ");
b++;
}
}
System.out.println();
// Soru 3: Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri 
// dahil aralarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
System.out.println("Başlangıç ve bitiş değerlerini ilkini küçük sonra büyük olacak şekilde giriniz: ");
byte i=scan.nextByte();
byte j=scan.nextByte();
while(i<=j) {
if(i%2==0) {
System.out.print(i+" ");
}
i++;
}
System.out.println();
// Soru 4: Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip 
// bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.
System.out.println("Lütfen ilk harfi girin: ");
char ilkHarf=scan.next().toUpperCase().charAt(0);
System.out.println("Lütfen son harfi girin: ");
char sonHarf= scan.next().toUpperCase().charAt(0);
char harf = ilkHarf;
while(harf<=sonHarf) {
System.out.print(harf+" ");
harf+=1;
}
scan.close();
}}