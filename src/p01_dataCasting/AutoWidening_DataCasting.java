package p01_dataCasting;
public class AutoWidening_DataCasting {
public static void main(String[] args) {
	//Data tipi büyütme
	byte num1=100;
	System.out.println("Byte değişken ile: "+num1);
	short num2=num1;
	System.out.println("Short değişken ile: "+num2);
	int num3=num2;
	System.out.println("İnt değişken ile: "+num3);
	long num4=num3;
	System.out.println("Long Değişken ile: "+num4);
	float num5=num4;
	System.out.println("Float değişken ile: "+num5);
	double num6=num5;
	System.out.println("Double değişken ile: "+num6);
}}