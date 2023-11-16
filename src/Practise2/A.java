package Practise2;

public class A {

	void show() {

		System.out.println("In practise2 package");
	}

	public static void main(String[] args) {

		Practise.A obj = new Practise.A();
		Practise2.A obj2 = new Practise2.A();
		obj.display();
		obj2.show();
	}
}
