package p12_constructor;

public class C02 {
	
	
	public int ilanNo = 0000;
	public String marka= "Belirtilmedi";
	public String model= "Belirtilmedi";
	public int yil= 0000;
	public int fiyat = 0;
	
	C02() {

	}
	
	
	
C02( int ilanNo, String marka, String model, int yil, int fiyat) {		
	
	this.ilanNo=ilanNo;
	this.marka=marka;
	this.model=model;
	this.yil=yil;
	this.fiyat=fiyat;
	}






}
