package p00_examples;
import java.util.Scanner;
public class If_Else_Artik_Yil {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Lütfen bir yıl giriniz:");
int yil=scan.nextShort();
if (yil%4==0) {
if (yil%100!=0) { System.out.println("Girdiğiniz yıl bir artık yıldır.");}
else {if(yil%400==0) 
{System.out.println("Girdiğiniz yıl bir artık yıldır.");}
else {System.out.println("Girdiğiniz yıl artık yıl deıildir.");}
}}
else {System.out.println("Girdiğiniz yıl artık yıl değildir.");}
scan.close();
}}