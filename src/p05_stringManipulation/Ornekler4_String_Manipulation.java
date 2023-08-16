package p05_stringManipulation;
public class Ornekler4_String_Manipulation {
public static void main(String[] args) {
/* Örnek 4: String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
String str1 = “$13.99”
String str2 = “$10.55”
ipucu : Double.parseDouble() methodunu kullanabilirsiniz.  */
String str1 = "$13.99";
String str2 = "$10.55";
str1=str1.replace("$","");
str2=str2.replace("$","");
double num1= Double.parseDouble(str1);
double num2= Double.parseDouble(str2);
System.out.println("İki sayının toplamı: $"+ (num1+num2));
}}