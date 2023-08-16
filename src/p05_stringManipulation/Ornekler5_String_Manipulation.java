package p05_stringManipulation;
public class Ornekler5_String_Manipulation {
public static void main(String[] args) {
// Örnek 5 : String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” i “Java ogrenmek cok guzel.” sekline getirin.
String str = "Java ogrenmek123 Cok guzel@";
String strduzenlenmis =str.substring(0,13)+str.toLowerCase().substring(16,26);
System.out.println(strduzenlenmis);
}}