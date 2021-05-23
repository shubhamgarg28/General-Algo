package utils;

 class A {
	public void printA() {
		System.out.println("In print A method");
	}
	
	public void print() {
		System.out.println("In A's print method");
	}
}
 
 class B extends A {
	public void printB() {
		System.out.println("In print A method");
	}
	
	public void print() {
		System.out.println("In A's print method");
	}
}

public class InheritanceTesting {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A c = new B();
		a.printA();
		b.printA();
		c.printA();
//		c.printB();
		c.print();
	}
}