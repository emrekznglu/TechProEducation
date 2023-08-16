package p07_loops;
import java.util.Scanner;
public class WhileLoop3 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// While: Soru 9: Kullanıcıdan iki pozitif sayı isteyin
// Kullanıcı negatif sayı girdiğinde girilen negatif sayıları yok edip, yeniden değer isteyin
// Kullanıcı doğru giriş yaptığında "Well Done" ve sayıların çarpımını yazdırın.
System.out.println("Lütfen iki pozitif tam sayı giriniz: ");
int num1=0;
int num2=0;
while(!(num1>0 && num2>0)) {
num1=scan.nextInt();
num2=scan.nextInt();
if(num1>0&&num2>0) {
System.out.println("Well Done \nGirilen sayıların çarpımı:"+(num1*num2));
}
else {
System.out.println("Lütfen  pozitif iki tam sayı giriniz.");
}
}
scan.close();
}}