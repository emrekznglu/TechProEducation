package p12_constructor;

public class C02Runner {

	public static void main(String[] args) {
		
		C02 car2=new C02(1004,"Honda","Civic",2010,200000);
		
		System.out.println(car2.fiyat+", "+car2.ilanNo+", "+car2.marka+", "+car2.model+", "+car2.yil);
		
		C02 car3 = new C02(1005,"Mercedes", null, 5000, 0);
		System.out.println(car3.fiyat+", "+car3.ilanNo+", "+car3.marka+", "+car3.model+", "+car3.yil);

	
	
	
	
	
	
	
	}

}
