package p20_inheritance;

class Okul {
	public void getDetails() {
		System.out.println("Derived class ");
	}
}

public class Test02 extends Okul {
	public Test02() {
		System.out.println("Test class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		Test02 obj = new Test02();
		obj.getDetails();
	}
}