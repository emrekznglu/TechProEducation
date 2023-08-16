package p15_immutableClasses;

public class ImmutableClasses03 {

	public static void main(String[] args) {
		
		String a = "";
		a+=2;
		a+='c';
		a+= false;
		if(a=="2cfalse") {
		System.out.println("==");
		}
		else if(a.equals("2cfalse")) {
		System.out.println("equals");
		}
		
		
	}

}
