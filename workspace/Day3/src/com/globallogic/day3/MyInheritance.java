package com.globallogic.day3;

//one java file can have multiple classes 
//when you compile it you will have multiple .class files 

//Inheritance :  where one class extends the properites of another class
//Format the Code : Ctrl+Shift+F

//type : Single inheritance

//Super keyword : will be used only when we perform the inheritance
//it is use to call the variable and method of parent class
//call the constructor of parent class
class A {

	int id;

	
	
	public A()
	{
		
	}
	public A(int id,String name)
	{

	}

	public void printA() {
		System.out.println("class A" + id);
	}

}
//perform the inheritance : it will extends the base class properites to child class

//use extends keyword and then class Name
class B extends A {
	
	//decare the variable or inislaized 
	int a=10;
	//super(10,"string");
	
	//super.printA();
	
	public B(int id) {
		//it wll call the class a constructor
		super(10,"string");
		
		//super.id;
		// TODO Auto-generated constructor stub
	}

	public void printB() {
		
		//calling the class a method using the super keyword
		super.printA();
		//calling the variable of clas a using super keyword
		System.out.println("class B"+super.id);
	}
}

class C {

}
//

//keep for main method
public class MyInheritance {

	public static void main(String[] args) {

		/*
		 * A a=new A(); a.printA();
		 */
        
		//if you do have 
		//B obj=new B();
		
		B b = new B(10);
		// coming from class b
		b.printB();
		// coming from class A method
		b.printA();
           //super. not allowed here
		// class A variable
		System.out.println(b.id);

	}
}
