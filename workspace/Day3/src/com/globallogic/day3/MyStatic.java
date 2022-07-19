package com.globallogic.day3;

//Static --when you add the static keyword then variable will store in heap memory
//variable--when you used the static with variable that means it is common to all

//static used with method:
//you can access the method with class name
//there is not need for object creation

//static block
//static class --if you have the nested class
           //clsss having the another class is called nested class
 class Employee {

	int id;
	String name;
	static String cityName;
	
	static class dept
	{
		int dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Employee(int id, String name, String cityName) {
		super();
		this.id = id;
		this.name = name;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cityName=" + cityName + "]";
	}

	public static void print() {
		System.out.println("class EMployees" + cityName);
	}

	public void printN() {
		System.out.println("class EMployees" + this.cityName);
	}

	// it will execute before loading of class
	static {
		System.out.println("i am first line");

	}
}

public class MyStatic {

	public static void main(String[] args) {
		//
		Employee ravinder = new Employee(1001, "ravinder", "delhi");
		ravinder.setName("ravinder");

		System.out.println(ravinder);

		Employee kumar = new Employee(1002, "kumar", "chennai");

		System.out.println(ravinder);
		System.out.println(kumar);
		ravinder = kumar;
		// able to access with the class name
		Employee.print();
		
		Employee.dept dept=new Employee.dept();
		
	}
}
