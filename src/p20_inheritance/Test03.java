package p20_inheritance;
class Person {
	public Person() {
		System.out.println("Person Constructor");
	}

	public void talk() {
		System.out.println("First Program");
	}
}

class Student extends Person {
	public void talk() {
		System.out.println("Second Program");
	}
}

public class Test03 {

	public static void main(String[] args) {
		Student p = new Student();
		p.talk();
	}
}