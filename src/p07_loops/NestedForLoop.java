package p07_loops;
import java.util.Scanner;
public class NestedForLoop {
public static void main(String[] args) {
// Nested For Loop ( İç İçe For Döngüsü) 
/* Soru 1: Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
asagidaki sekli cizdirin
"*
* *
* * *
* * * *"
*/
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen bir rakam giriniz (Sıfır hariç): ");
byte a = scan.nextByte();
for(byte x=1;x<=a;x++) {
for(byte y=1;y<=x;y++) {
System.out.print("*");
}
System.out.println();
}
scan.close();
}}