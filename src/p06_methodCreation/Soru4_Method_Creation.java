package p06_methodCreation;
import java.util.Scanner;
public class Soru4_Method_Creation {
public static void main(String[] args) {
/* Örnek 4 : Kullanıcıdan ismini,soyismini ve boşluk bırakmadan 16 hane olarak kredi kartı numarasını alın.
İsim ve soyismi ilk harfleri büyük diğer harfler küçük olacak şekilde, 
KK numarısını ise 4 rakamlık 4 blok ve aralarında boşluk olacak şekilde düzelten 2 method yazın,
ve programda kullanabilmek için düzenlenmiş hallerini geri döndürün. Örnek: Mehmet Bulutluoz 1234 5698 7854 1256*/
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen isminizi yazınız:");
String name=scan.next();
name=ismiDuzelt(name); // artık 12. satırdan sonra name variablesi kalıcı olarak method sayesinde düzeltildi.
System.out.println("Lütfen Soyisminizi giriniz:");
String surname = scan.next();
surname = ismiDuzelt(surname);
System.out.println("Lütfen kart numaranızı boşluksuz giriniz:");
String kkNo=scan.next();
kkNo=kkNoDuzelt(kkNo);
System.out.println(name+" "+surname+"\n"+kkNo);
scan.close();
}
public static String ismiDuzelt(String name) {
// Bu method'un amacı müşteri ismini nasıl yazarsa	yazsın ilk harf büyük değerleri küçük harf olacak şekilde düzenlemek
// aynı zamanda başta ve sondaki boşlukları silmek.
name = name.trim(); // atama yapmazsak değişiklikler kalıcı olmaz.
name = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
// name de yaptığım değişiklikleri main method'a gönderebilmek için return type 'i void yerine variable 'in data türüne uygun şekilde döndürmeliyiz
return name;
}
public static String kkNoDuzelt(String kkNo) {
kkNo = kkNo.replace(" ", " ").trim();
kkNo = kkNo.substring(0, 4)+" "+kkNo.substring(4, 8)+" "+kkNo.substring(8, 12)+" "+kkNo.substring(12);
return kkNo;
}
}