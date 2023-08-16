package p02_mathematicalOperators;
public class PreIncrement_PostIncrement {
public static void main(String[] args) {
int sayi1=20;
int sayi2=++sayi1;/*bu satırda (5. satır) iki işlem var 
1) sayı1 1 arttırılıyor. 
2) sayı2 oluştuluyor ve değer atanıyor
Bu iki işlemden hangisinin olacağını "Pre Increment" (önce değeri arttır ---> sonra atama yap)
veya "Post Increment" (önce atama yap ---> sonra değeri arttır) belirliyor. */
System.out.println("PreIncrement sayi1: "+sayi1+"\nPreIncrement sayi2: "+sayi2);
System.out.println("-----------------------");
sayi2=sayi1++;
System.out.println("PostIncrement sayi1: "+sayi1+"\nPostIncrement sayi2: "+sayi2);
System.out.println("-----------------------");
int sayi3=10;
System.out.println("PreIncrement sayi3: "+ ++sayi3 +"\nPostIncrement sayi3: " + sayi3++);
System.out.println("PostIncrement 'tan sonraki aşamada sayi3: " +sayi3);
}}