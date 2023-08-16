package p22_exceptions;

public class Exceptions08 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		// null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya calistiginizda
		// Java NullPointerException verir
		// Unchecked exception'dir
		
		String str1=" ";
		String str2="";
		String str3=null;   // null bir deger degildir sadece str3'un hicbirseye esit olmadigini soyleyen bir isaretcidir(pointer)
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
		
		try {
		System.out.println(str3.concat("bos")); // NullPointerException
		} catch (NullPointerException e) {
		e.printStackTrace();
		}
		
		System.out.println(str3 + "bos"); // nullbos
	
		try {
			System.out.println(str3.concat("bos")); // NullPointerException
			} catch (NullPointerException a) {
			a.printStackTrace();
			}
		System.out.println("kod devamke");
		
	}

}