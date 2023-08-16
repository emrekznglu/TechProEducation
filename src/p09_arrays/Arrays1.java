package p09_arrays;

import java.util.Arrays;

public class Arrays1 {
public static void main(String[] args) {


short arr1 []=new short[5];

System.out.println(arr1); // arr1 bir array,data türü non-primitive | short array'in değil içine koyacağımız değerlerin data türünü alır.
// eğer non-primitive bir datayi direkt syso ile yazdırmaya çalışırsak java arr1 'in referans bilgisini yazdırır.


// Soru 1: Elemanları "Ali , "Veli, "Ayşe" ve "Fatma" olan bir array oluşturun ve bu array'i yazdırın.
//1. Yol:
String isimler[] = new String[4];
isimler[0]="Ali";
isimler[1]="Veli";
isimler[2]="Ayşe";
isimler[3]="Fatma";

//2. Yol:
String myArray[]= {"Ali","Veli","Ayşe","Fatma"};

// yukarıda hem declare edildi hemde assignment yapıldı, tek tek yazdırmak için ise:

System.out.println(isimler[0]+" , "+isimler[1]+" , "+isimler[2]+" , "+isimler[3]);

// isimler array'indeki veli yerine  "Hasan" yazalım.

isimler[1]="Hasan";

// isimler 'in uzunluğunu bulmak için:
System.out.println(isimler.length); // string in length methodunun sonunda parantez var bunda yok.

// tüm elemanları tekte yazdırmak için 1. yol (LOOP kullanmak):
for (int i = 0; i < isimler.length; i++) {
System.out.print(isimler[i]+" ");	
}
System.out.println("");
// tüm elemanları tekte yazdırmak için 2. yol (Arrays class'indan yardım almak):
System.out.println(Arrays.toString(myArray));

}}