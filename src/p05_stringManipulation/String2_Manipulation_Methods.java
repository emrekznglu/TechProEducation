package p05_stringManipulation;
public class String2_Manipulation_Methods {
public static void main(String[] args) {
// 11. Method = endsWith verilen String'in istenen karakterler ile bitip bitmediğini kontrol eder. True veya False döndürür.
String str = "Calisirsaniz, Java ogrenmek cok kolay";
System.out.println(str.endsWith("y"));
System.out.println(str.endsWith("olay"));
// System.out.println(str.endsWith('t')); Error verir çünkü parametre string olmalıdır.
// 12. Method = startsWith verilen String'in istenen karakterler ile başlayıp başlamadığını kontrol eder. True/False döndürür 11. nin tersi
System.out.println(str.startsWith("C"));
System.out.println(str.startsWith("Calis"));
System.out.println(str.startsWith("s",4)); // 4. indexden sonra s harfiyle mi başlıyor diye kontrol eder
System.out.println(str.startsWith("Java",14)); // 14. indexden sonra "Java" kelimesi ile mi başlıyor diye kontrol eder
// 13. Method = isEmpty verilen String'in uzunluğu 0 ise (hiçbir karakter içermiyorsa) true, yoksa false döndürür
String str2="";
//String str3=null;
System.out.println(str.isEmpty()); // Length 'i 0 dan fazla olduğu için boş değildir yani false çevirir
System.out.println(str2.isEmpty()); // Length 'i 0 olduğu için boştur yani true çevirir
//System.out.println(str3.isEmpty()); Error verir 
// 14. Method = replace verilen String 'deki istenen karakterleri istenen yeni karakterler ile değiştirir
System.out.println(str.replace('a', 'c')); // str String'indeki a charlarını c charı ile değiştirir
System.out.println(str.replace("Java", "x")); // Java kelimesini x charı ile değiştirir
System.out.println(str.replace("a", "")); // a charlarını yok eder
// 15. Method = replaceAll replace methodu ile aynıdır sadece replaceAll da char kullanılamaz ve Reguler Expressions kullanılabilir
String kkNo="1234 5412 3652 4785";
System.out.println(kkNo.replaceAll("\\s", "")); // boşluk olan her şeyi yok eder
System.out.println(kkNo.replaceAll("\\S", "*")); // boşluk olmayan her şeyi * ile değiştirir
System.out.println(kkNo.replaceAll("\\w", "-")); // harf ve rakam olan her şeyi - ile değiştirir
System.out.println(kkNo.replaceAll("\\W", "#")); // harf ve rakam olmayan her şeyi # ile değiştirir
System.out.println(kkNo.replaceAll("\\d", "0")); // rakam olan her şeyi 0 ile değiştirdi
// 16. Method = replaceFirst verilen String'deki istenen karakterlerin ilkini, istenen yeni karakterler ile değiştirir
System.out.println(str.replaceFirst("a", "*")); // ilkini değiştirir gerisine dokunmaz
System.out.println(str.replaceFirst("\\w", "")); // ilk harfi veya rakamı yok eder veya değiştirir
// 17. Method = substring index kullanarak verilen String'in istenen parçasını almamızı sağlar
String str4 = "Mehmet Emre";
System.out.println(str4.substring(2)); // 2. index de dahil olmak üzere sonrasındaki harfleri alır döndürür
System.out.println(str4.substring(2,8)); // 2. index dahil 8. index hariç bu aralıktaki harfleri ve stringleri alır ve döndürür
System.out.println(str4.substring(4,4)); // 8. index i dahil edip daha sonrasında hariç dediği için boşluk verir hiç bir şey yazmaz
//System.out.println(str4.substring(8,2)); hata verir
// 18. Method = trim istediğimiz String'in başında veya sonunda var olan boşluk (spaceleri) temizler
String str5 = "  Mehmet  Emre  ";
System.out.println(str5);
System.out.println(str5.trim()); // baştakı ve sondaki boşlukları kesti
}}