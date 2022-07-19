package com.globallogic.day2;

//Rule1 : Your Public class name and file name should be same
// there should be only one public class in one java files
//your public will contain the main method

//Class---class is blueprint for object

//create a print of home
//Any number of house from the blueprint
//all the house will have common structre 
//you will always create a object of class first
//use the .(dot) with variable name or method to access

//Access Secfifer with class
//add with variable
//add with method also

//object class--it is parent of each class
class Employee extends Object{
	// member variable of class

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	private int id;
	private String name;
	private double salary;

	// method
	//method will be always public
	// it will be used access and maniplation the data from the variable

	// Constructor --it is special in java
	// it is always public and it has the same name as class name
	// default --which does not receive and do any cal
	// it will automatically will be create the java

	public Employee() {

	}

	// parametrized contructor
	public Employee(int id, String name, double salary) {
		// two variable with same name
		// one is belong to class..
		// this--it is a keyword in java
		// it is used to access the current class method and variables
		// another is belong to method
		this.id = id;
		this.name = name;
		this.salary = salary;
		// this.
	}

	public void speak() {
		System.out.println("id " + this.id);
		System.out.println("name " + this.name);
		System.out.println("salary " + this.salary);
	}

	// when you have method with same name and different paramters this is called
	// method overloading

	public Employee(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	public Employee(String name) {

		this.name = name;

	}

	public Employee(double salary) {

		this.salary = salary;

	}
}

public class MyClass {

	// member variable
	// any
	// primitive data are build in datatype supported in java int ,float, double
	// no primitive-->userdefined String , Array, Class, List , Collections

	// methods

	public static void main(String[] args) {
		// Object --any real time entity which has properites and behaviour

		// if member variables are privates then you cannot access the variables
		// direclty
		// you can access using methods
		Employee ravinder = new Employee(10.00);
		Employee kumar = new Employee(10.00);

		ravinder.speak();
		//Hashcode--it is unique code given to one object 
		System.out.println(ravinder.hashCode());
		//it will have the package name and class name and hashcode
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(ravinder.toString());
		//it is used to compare two object
		 //if both the object are having same reference then it will return true otherwise it will return false
	 
		//you can create overrite this method
		System.out.println(ravinder.equals(kumar));
	}

}
