package p11_loops2_forEachLoops;

public class ForEachLoop2 {

	public static void main(String[] args) {
		/* Soru 1: bir integer array oluşturunuz ve bu array'deki tüm sayıların çarpımını for-each loop kullanarak bulunuz.
		 sonucu ekrana yazdırınız.
		 */
		
		int arr[]= {2,4,5,7,8,1,23};
		int carpim=1;
		byte count=0;
		for(int each:arr) {
		carpim*=each;
		count++;
		System.out.println(count+". adımdaki çarpım : "+ carpim);
		}
		
		
		
		
		
		
		
	}

}
