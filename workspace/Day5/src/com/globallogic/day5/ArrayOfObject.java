package com.globallogic.day5;

import java.util.Scanner;

//Array of Object
//create a array of object at-least with 10 object

class Student
{
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
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
	int id;
	String name;
	
}


public class ArrayOfObject {

	
	public static void main(String[] args) {
		
		
		//create the array with integer type
		Student[] list=new Student[10];
		
		//
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Student data :");
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter Name");
			String name=sc.next();
			
			
			Student student=new Student(id, name);
			list[i]=student;
		}
		
		for(Student st:list)
		{
			System.out.println(st);
		}
		
		
	}
}
