package p02_mathematicalOperators;
public class PreDecrement_PostDecrement {
public static void main(String[] args) {
int sayi1=20;
int sayi2=--sayi1;/*bu satırda (5. satır) iki işlem var 
1) sayı1 1 azaltılıyor. 
2) sayı2 oluşturuluyor ve değer atanıyor
Bu iki işlemden hangisinin olacağına "Pre Decrement" (önce değeri azalt ---> sonra atama yap)
veya "Post Decrement" (önce atama yap ---> sonra değeri azalt) belirliyor. */
System.out.println("PreDecrement sayi1: "+sayi1+"\nPreDecrement sayi2: "+sayi2);
System.out.println("-----------------------");
sayi2=sayi1--;
System.out.println("PostDecrement sayi1: "+sayi1+"\nPostDecrement sayi2: "+sayi2);
System.out.println("-----------------------");
int sayi3=10;
System.out.println("PreDecrement sayi3: "+ --sayi3 +"\nPostDecrement sayi3: " + sayi3--);
System.out.println("PostDecrement 'tan sonraki aşamada sayi3: " +sayi3);
}}