package p02_mathematicalOperators;
public class Ornek_Increment_Decrement {
public static void main(String[] args) {
	int sayi1=10, sayi2=20;
	System.out.println(sayi1+" "+sayi2);
	sayi1-=5;
	sayi2+=10;
	System.out.println(sayi1+" "+sayi2);
	System.out.println(sayi2/sayi1);
	sayi1*=2;
	sayi2++;
	System.out.println(sayi1+" "+sayi2);
	System.out.println(sayi2/sayi1); // İnt değeri olduğundan 3.1 değilde 3 olarak çıkar sonucu.
	sayi1/=2;
	float sayi3=sayi2/10;
	System.out.println(sayi3); /* Auto Widening yapılmasına rağmen küsüratı yanlış vermesinin sebebi;
int olarak işlemini yapıp float olarak yazdırmamızdır.*/
	System.out.println(sayi1*sayi2);
	System.out.println(sayi1*sayi3);
	sayi3 = (float)sayi2/10;
	System.out.println(sayi3);
	System.out.println(sayi2);
}}