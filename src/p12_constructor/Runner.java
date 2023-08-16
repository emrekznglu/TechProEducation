package p12_constructor;

public class Runner {

	public static void main(String[] args) {
		//Runner: run edici yani objeolusturma classinda oluşturduğumuz kalıbı kullanmak üzere çalıştıracağımız classtır.
		
		C01 obj1=new C01();
		
		//Scanner scan = new Scanner(System.in);
		//Scanner class'ından scan isminde bir obje üretiyoruz.
		//Scan objesinin özelliklerini System.in parametresi ile belirliyorum.
		
		obj1.isim="Mehmet Tekstil";
		obj1.tel="3125478798";
		
		System.out.println(obj1.isim+" "+obj1.tel+" "+obj1.isciSayisi);
		//obj1 'in istediğim variable'larına değer atayabilirim. Eğer atamazsam ilk atanan değeri getirir.
		
		
		//Bir isimle bir object oluşturma sadece 1 defa olabilir ama o objenin variableleri (özellikleri) istendiği kadar değiştirilebilir.
		C01 obj2=new C01();
		
		obj2.isciSayisi=50;
		obj2.isciSayisi+=3;
		obj2.isciSayisi-=10;
		
		
		
		
	}

}
