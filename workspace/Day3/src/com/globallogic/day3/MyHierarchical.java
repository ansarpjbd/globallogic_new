package com.globallogic.day3;

class A2 {
	public void printA() {
		System.out.println("Class A");
	}
}

class B2 extends A2 {
	public void printB() {
		System.out.println("Class B");
	}
}

class C2 extends A2 {
	public void printC() {
		System.out.println("Class C");
	}
}

//Hierarchical --one class will be extedns by two or more class
public class MyHierarchical {

	public static void main(String[] args) {
		B2 b2=new B2();
		//class A
		b2.printA();
		b2.printB();
		
		C2 c2=new C2();
		c2.printA();
		c2.printC();
		
	}
}
