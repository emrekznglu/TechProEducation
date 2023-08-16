package p20_inheritance;
class Derived {
	public void getDetails() {
		System.out.println("Derived class");
	}
}

public class Test01 extends Derived {
	protected Test01() {
		System.out.println("Test class");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test01 obj = new Test01();

	}
}