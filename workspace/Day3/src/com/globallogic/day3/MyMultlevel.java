package com.globallogic.day3;

class A1 {
	public void pritnA() {
		System.out.println("Class A1");
	}
}

class B1 extends A1 {
	public void pritnB() {
		System.out.println("Class B1");
	}
}
//B1 already have the properites of A1
//C1 has the A1 and B1
class C1 extends B1 {
	public void pritnC() {
		System.out.println("Class C1");
	}

}
//D1 will have B1, C1,A1
class D1 extends C1 {
	public void pritnD() {
		System.out.println("Class D1");
	}
}
//there is no limit in the level 
public class MyMultlevel {

	public static void main(String[] args) {

		 D1 d=new D1();
		 d.pritnA();
		 d.pritnB();
		 d.pritnC();
		 d.pritnD();
	}
}
