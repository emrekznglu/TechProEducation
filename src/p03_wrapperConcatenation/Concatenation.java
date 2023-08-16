package p03_wrapperConcatenation;
public class Concatenation {
public static void main(String[] args) {
String str1="Hello",str2="World";
int sayi1=3,sayi2=4;
//Sadece variable kullanarak verilenleri yazdır.
//Hello1 yazdır.
System.out.println(str1+(sayi2-sayi1));
//Hello 5 World yazdır.
System.out.println(str1+" "+(sayi1*sayi1-sayi2)+" "+str2);
//Hello 34
System.out.println(str1+" "+sayi1+sayi2);
//7World
System.out.println(sayi1+sayi2+str2);
//34
System.out.println(sayi1+""+sayi2); // Data Türleri: sayi1=int,sayi2=int,bunların buradaki sonucu
//Olan 34 ise String araya içi boş çift tırnak koyulursa String olarak algılar.
char ilkHarf='a';
int sayi=7;
String str="Java";
System.out.println(sayi+str+ilkHarf);
System.out.println(sayi+ilkHarf+str); //Bu satırda char olan 'a' nın ascii değeri ile int toplandı.97
//7a
System.out.println(sayi+""+ilkHarf);
}}