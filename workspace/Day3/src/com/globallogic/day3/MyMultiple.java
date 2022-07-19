package com.globallogic.day3;

class A3 {

	public void printA()
	{
		System.out.println("A");
	}
}

class B3 {
	public void printB()
	{
		System.out.println("B");
	}
}
//we cannot have the mutiple inheritance
class C3  extends A3 // B3{
{
	public void printB()
	{
		System.out.println("C");
	}
}

public class MyMultiple {

}
