package p14_passByValue;
public class PassByValue {

	public static void main(String[] args) {
		
		double fiyat=100;
		
		System.out.println("method call ile yazdırılan indirimli fiyat "+indirimYap(fiyat)); // 90.0
		
		System.out.println("method çalıştıktan sonra fiyat: "+ fiyat); // 100.0
		
		int zamYuzdesi=15;
		zamYap(zamYuzdesi);
	}

	private static void zamYap(int zamYuzdesi) { 
		// Bu parametredeki zamYuzdesi ile main method daki zamYuzdesi variablelerinin değerleri aynıdır ama kendileri farklı birer variabledir.
		// Javaya bir method oluşturttuğumuzda Java bizim main method'da kullandığımız variable isminde clone bir variable oluşturur.
		// bunun amacı kod takibini kolaylaştırmaktır. Bu değişkenin ismini değiştirsek de kodumuz problemsiz çalışır.
		
	}

	private static double indirimYap(double fiyat) {  // fiyatta 10% indirim yapıcam ve yeni fiyatı döndüreceğim.
		fiyat-=fiyat/10;
		System.out.println("Method'daki fiyat: "+fiyat); // 90.0
		return fiyat;
	}

}