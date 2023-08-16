package p01_dataCasting;
public class ExplicitNarrowing_DataCasting {
	public static void main(String[] args) {
		//Data tipi küçültme
		double num1=1000.14;
		System.out.println("Double Değişkeni ile: "+num1);
		int num2=(int)num1;
		System.out.println("İnt Değişkeni ile: "+num2);
		byte num3=(byte)num2;
		System.out.println("Byte Değişkeni ile: "+num3);
}}