package com.globallogic.day3;

//final keyword can be used
//class
  ////it will used with class : this class become the final and you can cannot extends the class

//variable --it will become final we will not able to change the value
//method  --when used with method that means you will be not able to override this
  class Base
{
	 
	
	  int salary=1000;
	//final
	 public void printA()
	{
		//final variable cannot be changed the value
		this.salary=2000;
		System.out.println("print A");
	}
}
//Base call become final now
//we will not able to extends this
class child extends Base
{
	//overriding is not possible
	public void printA() {
		System.out.println("print B");
	}
}

public class MyFinal {
public static void main(String[] args) {
	
}
}
