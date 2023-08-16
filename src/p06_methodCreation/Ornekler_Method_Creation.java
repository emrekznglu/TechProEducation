package p06_methodCreation;
import java.util.Scanner;
public class Ornekler_Method_Creation {
public static void main(String[] args) {
// Kullanıcıdan 2 tam sayı isteyin, bu sayıların toplamlarını ve çarpımlarını iki ayrı method'da hesaplayıp yazdırın.
Scanner scan = new Scanner(System.in);
System.out.println("ilk tam sayınızı giriniz:");
int num1 = scan.nextInt();
System.out.println("ikinci tam sayınızı giriniz:");
int num2 = scan.nextInt();
toplama(num1,num2);
carpma(num1,num2);
scan.close();
}
// bir method sadece konsolda bir şeyler yazdıracaksa return type olarak void yazılır. Bu durumda return keyword'une ihtiyac olmaz ve
// method bize bir sonuç döndürmez
public static void toplama(int num1,int num2) {
System.out.println("Girilen sayıların toplamı: "+(num1+num2));
}
public static void carpma(int num1,int num2) {
System.out.println("Girilen sayıların çarpımı: "+num1*num2);	
}
}