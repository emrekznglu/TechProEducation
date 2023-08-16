package p03_wrapperConcatenation;
public class Wrapper_Class {
public static void main(String[] args) {
//Integer sayi=10;
//System.out.println(sayi.MAX_VALUE+"\n"+sayi.MIN_VALUE); int in max ve minimum değerlerini görürürüz.
//Short sayi2=10;
//System.out.println(sayi2.MAX_VALUE+"\n"+sayi2.MIN_VALUE);
//Wraper Class'a bir örnek olarak:
String okulNo="858";
int okulNoSayiOlarak= Integer.parseInt(okulNo);
//System.out.println(++okulNo); Bu satır kullanım dışı çünkü okulNo bir string.
System.out.println(++okulNoSayiOlarak);
//Character basHarf='a';
//System.out.println(basHarf.toUpperCase('a'));
}}