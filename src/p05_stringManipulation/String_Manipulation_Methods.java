package p05_stringManipulation;
import java.util.Locale;
public class String_Manipulation_Methods {
public static void main(String[] args) {
// 1. Method = concatenation birden fazla String'i birleştirerek tek bir String haline getirir. ("A"+"B" = AB gibi)
String isim="Emre",soyisim="Kozanoğlu",isim2="emre";
System.out.println(isim+" "+ soyisim); // Emre Kozanoğlu
System.out.println(isim.concat(" ").concat(soyisim));  // Emre Kozanoğlu
// 2. Method = charAt istenen indexdeki karakteri döndürür.
System.out.println(isim.charAt(2));
//System.out.println(isim.charAt(5)); Error
// 3. ve 4. Method = toUpperCase ve toLowerCase girilen String 'deki tüm harfleri istenen biçime çevirir.
System.out.println(isim.toLowerCase());
System.out.println(isim.toUpperCase());
//Ekstra olarak bu methodları (Locale locale) kullanarak istenilen dile çevirebiliriz.
String str="Emre Kozanoğlu";
System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
// 5. Method = Equals verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder. (== gibi ama aralarındaki fark == adrese de bakar)
String name = isim+" "+soyisim;
System.out.println(str.equals(name));
System.out.println(str==name);
// 6. Method = equalsIgnoreCase verilen iki String değişkeni büyük harf / küçük harf gözetmeksizin karşılaştırır.
System.out.println(isim.equals(isim2));
System.out.println(isim.equalsIgnoreCase(isim2));
// 7. Method = length verilen String'deki karakter sayısını döndürür.
System.out.println(name.length()); // name ="Emre Kozanoğlu" Emre --> 4 / Kozanoğlu --> 9 / birde arada boşluk var o da 1 = 14
//String bos  = null; // bu bir değer değildir atanmamış manasına geliyor.
//System.out.println(bos.length());
// 8. Method = indexOf verilen string'de istenen karakterin kullanıldığı ilk index'i döndürür.
String str2 = "Calisirsaniz, Java ogrenmek cok kolay";
System.out.println(str2.indexOf('a')); // str2 de ki ilk a charının indexini döndürür
System.out.println(str2.indexOf("a")); // str2 deki ilk a stringinin indexini döndürür
System.out.println(str2.indexOf("t"));  // str2 de t harfi bulunmadığı için sonucu -1 olarak döndürür
System.out.println(str2.indexOf("Java")); // java kelimesindeki harfleri değil bütün olarak kelimeyi index olarak görür
System.out.println(str2.indexOf('a', 11)); // 11. indexden sonraki ilk a
if(str2.toLowerCase().indexOf("java")!=-1) {System.out.println("true");}
// 9. Method = lastIndexOf verilen String'de istenen karakterin kullanıldığı son indexi döndürür
System.out.println(str2.lastIndexOf('a')); //indexOf methodunun str2 deki son indexini döndüren method
// 10. Method = contains verilen String'in istenen karakterleri içerip içermediğini kontrol eder. İçeriyorsa true içermiyorsa false döndürür
System.out.println(str2.toUpperCase().contains("JAVA")); // 36. satırdakinin methodlu versiyonu
}}