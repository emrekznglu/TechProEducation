package p20_inheritance;

public class Memur02 extends Personel02{
	
	public int maas;
	
	public Memur02(){
		super();
		System.out.println("Child class parametresiz constructor calisti");
	}
	
	public Memur02(int maas) {
		super();
		System.out.println("Child class parametreli constructor calisti");
	}
	


	/*
	 Inheritance'da constructor olusturdugumuzda java'nin otomatik olarak constructor'a 
	 	koydugu super() keyword onemlidir.
	 super() keyword default constructor gibidir. Biz gormesek de calisir, ancak yerine 
	 	baska bir keyword yazarsak etkisiz hale gelir.
	 *** extends varsa yerine birsey yazmadikca super() calisir..... ***
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Memur02 obj1=new Memur02(2400);

	}

}
