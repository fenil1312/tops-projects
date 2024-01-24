package oops;

import java.util.*;

class A {
	int a;

	void putA() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a = sc.nextInt();
	}

	void getA() {
		System.out.println("A : " + a);
	}
}

class B extends A {
	int b;

	void putB() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter B : ");
		b = sc.nextInt();
	}

	void getB() {
		System.out.println("B : " + b);
	}

}

public class InheritanceDemo {

	public static void main(String[] args) {

		B b = new B();
		b.putA();
		b.putB();
		b.getA();
		b.getB();
	}

}
