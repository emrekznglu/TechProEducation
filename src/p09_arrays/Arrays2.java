package p09_arrays;
import java.util.Arrays;
public class Arrays2 {
public static void main(String[] args) {
	int arr[]=new int[5];
	System.out.println(Arrays.toString(arr)); // [0 , 0 , 0 , 0 , 0] bir kez oluşturulan array'in uzunluğu sonradan değiştirilebilir mi?
	// [0 , 0 , 0 , 0 , 0 , 5] şekline getirilebilir mi ?
	// arr[5]=5; bu çalışmaz hata verir.
	// bir array'in length 'i sonradan değiştirilemez. Array'i kullanışsız yapanda bu özelliğidir.
	
	arr[2]=1; // [0 , 0 , 1 , 0 , 0]
	System.out.println(Arrays.toString(arr));
	
	arr=new int[6]; // 5 elemandan 6 elemana çıkarıldı length 'i bir eleman arttırıldı fakat elemanlar 0 'landı. yani bu array'i uzatmadı
	// yeniden oluşturdu sadece 6 elemanlı halini
	System.out.println(Arrays.toString(arr)); // [0 , 0 , 0 , 0 , 0 , 0] olur. Kısacası Array'in length'i değiştirilemez.
	   
	// Soru A: Verilen 3 Elemanlı bir array'in tüm elemanlarını bir soldaki konuma taşıyacak bir program yazın. 
	// Örnek: array [1,2,3] ise output [2,3,1] olacak.
	
	int ar[]=  {1,2,3};
	int temp= ar[0];
	ar[0]=ar[1];
	ar[1]=ar[2];
	ar[2]=temp;
	System.out.println(Arrays.toString(ar));
	
	// Array kaç elementli olursa olsun, tüm elementleri bir sola taşıyacak bir kod yazın.
	
	int arr2[]= {1,3,9,4,6,8};
	
	temp=arr2[0];
	int i=0;
	while(i<arr2.length-1) {
	arr2[i]=arr2[i+1];
	i++;
	}
	System.out.println(Arrays.toString(arr2)); // [3,9,4,6,8,8] bu hatalı olan.
	arr2[arr2.length-1]=temp;
	System.out.println(Arrays.toString(arr2)); // [3,9,4,6,8,1]
	
	// Soru : Verilen bir array'in tüm elemanlarını toplayan bir program yaz.
	
	int arr3[]= {2,4,6,8,10};
	int toplam=0;
	
	for (int j = 0; j < arr3.length; j++) {
	toplam+=arr3[j];
	}
	System.out.println(toplam);
	
	
	
}}