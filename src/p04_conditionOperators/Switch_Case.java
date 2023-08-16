package p04_conditionOperators;
import java.util.Scanner;
public class Switch_Case {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//Kullanıcıdan haftanın kaçıncı günü olduğunu sorun ve gün ismini yazdırın.
System.out.println("Haftanın günlerinden birini tuşlayın (1,2,3,4,5,6,7):");
byte day = scan.nextByte();
switch (day) {
case 1 : System.out.println("Pazartesi"); break;
case 2 : System.out.println("Salı"); break;
case 3 : System.out.println("Çarşamba"); break;
case 4 : System.out.println("Perşembe"); break;
case 5 : System.out.println("Cuma"); break;
case 6 : System.out.println("Cumartesi"); break;
case 7 : System.out.println("Pazar"); break; 
default : System.out.println("Hatalı tuşlama yaptınız."); }
//Kullanıcıdan "SDET" Kısaltmasındaki harflerden birini girmesini isteyin S->"Software" / D->"Developer / E->"Engineer" / T->"Testing"
System.out.println("SDET kısaltmasındaki harflerden birini giriniz:");
String ornek2 = scan.next().toLowerCase();
char sdet = ornek2.charAt(0);
switch(sdet) {
case 's' : System.out.println("Software"); break;
case 'd' : System.out.println("Developer"); break;
case 'e' : System.out.println("Engineer"); break;
case 't' : System.out.println("Testing"); break;
default : System.out.println("Hatalı tuşlama yaptınız."); }
scan.close();
}}