package p12_constructor;

public class CarRunner {

	public static void main(String[] args) {
		
		Car Car1=new Car();
		
		
		// Variable'lar sadece değer ataması yapar.
		Car1.fiyat=10000;
		Car1.ilanNo=1001;
		Car1.marka="Toyota";
		Car1.model="Corolla";
		Car1.yil=2020;
		System.out.println(Car1.fiyat+", "+Car1.ilanNo+", "+Car1.marka+", "+Car1.model+", "+Car1.yil);
		
		// Method'ların ne yapacağını method belirler.
		Car1.maxHiz(200);
		Car1.yakit("dizel");
		
		// bir araba daha oluşturmak istersem;
		
		Car Car2=new Car();
		Car2.fiyat=7500;
		Car2.ilanNo=3005;
		Car2.marka="Opel";
		Car2.model="Astra";
		Car2.yil=2010;
		System.out.println(Car2.fiyat+", "+Car2.ilanNo+", "+Car2.marka+", "+Car2.model+", "+Car2.yil);
	}

}
