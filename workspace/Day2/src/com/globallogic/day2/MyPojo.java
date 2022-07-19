package com.globallogic.day2;

//Pojo is plain old java object

class Student
{
	
	//memeber variables
	private int id;
	private String name;
	
	//method
	   //constructor
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 //default constructor
	public Student() {
		
	}
	//which will get the value of vairable
	public int getId() {
		return id;
		
	}
	//which will set the value of vairable
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setValue(int id, String name)
	{
	 this.id=id;
	 this.name=name;
	 
	}
	//it will print all the vairable
	public void print()
	{
	System.out.println("id "+id);
	System.out.println("name "+name);
	}
	
	public String printValue()
	{
	  return "id "+this.id+" name "+this.name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class MyPojo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(100);
		s1.setName("ravinder");
		System.out.println(s1.getId());
		System.out.println("name "+s1.getName());
		
		
		s1.setValue(100, "kumar");
		System.out.println(s1.printValue());
		s1.print();
		//it will internally call the two string method
		System.out.println(s1);
	}

}
