package p06_methodCreation;
import java.util.Scanner; 
public class Soru3_Method_Creation {
public static void main(String[] args) {
/*Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
- @ isareti icermiyorsa gecersiz email yazdirin
- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz.*/
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen email adresinizi yazınız: ");
String email=scan.next();
emailcontrol(email);
scan.close();
}
public static void emailcontrol(String email) {
if (!email.contains("@")) {
System.out.println("Geçersiz e-mail.");	
}
else if(!email.contains("@gmail.com")) {
System.out.println("Lütfen @gmail.com 'lu bir e mail giriniz.");	
}
else if(!email.endsWith("@gmail.com")) {
System.out.println("Lütfen email'iniz @gmail.com ile bitsin.");
}
else {
System.out.println("Girişiniz gerçekleştirildi.");	
}
}
}