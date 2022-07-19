package com.globallogic.day5;

import java.util.Scanner;

//User Defined --those data type which are define by the user
//class --it is user defined data-type
//have any number variable which can hold the data 

//Array --it is used to hold same type of data
//ENUM  --it is also user defined data-type that is use to delcare the constant value

//Enum--it is user defined type in java 
//it is used to declare the constant 
//you can read the constant value
//it is keyword in java
//it will always have the captial letter 
//uSING Enum name you can access the value
	enum Days {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}

class Employee
{

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	int id;
	String name;
	double salary;
}

//
public class MyUserDefined {
	
	public static final String MON="Monday";
	
	public static void main(String[] args) {

		
		
		System.out.println(Days.MON);
		System.out.println(Days.TUE);
		System.out.println("Value of " + Days.valueOf("MON"));
		

		System.out.println(Days.values());

		Days days[] = Days.values();

		// printing all the values
		for (Days d : days) {
			System.out.println(d);
		}
		
		//Array :
		
		//basic type array
		   //it is used to hold the same datatype value
		   //you have to give the size while declaring the array 
		 //one way 
		 int arr[]=new int[10];
		 
		 //index base 
		 arr[0]=1;
		 
		 System.out.println(arr[0]);
		 
		 System.out.println("Enter the Value of array");
		 Scanner sc=new Scanner(System.in);
		 //reading the value from user 
		 for(int i=0;i<10;i++)
		 {
			//arr[i]=sc.nextInt(); 
		 }
		 
		 for(int i=0;i<10;i++)
		 {
			System.out.println("value is "+i +" "+arr[i]);
		 }
	      
		 //second way
		 //size of array is given
		 int[] arr1=new int[10];
		 
		
		 
		 double[] d=new double[10];
		 
		 //what is size of this array
		 //it is always start with zero
		 int[] arr2 ={1,2,3,4,56,78,0};
		 
		
		 //array of string
		 String[] arrString=new String[10];
		 
		 
		 //array of object 
		 Employee[] arrStu=new Employee[3];
		 
		 System.out.println("Enter the employee data");
		 for(int i=0;i<3;i++)
		 {
			 int id=sc.nextInt();
			 String name=sc.next();
			 double salary=sc.nextDouble();
			 Employee emp=new Employee(id, name, salary);
			 arrStu[i]=emp;
			 
		 }
		 for(int i=0;i<arrStu.length;i++)
		 {
			 
		 }
		 //this is advance for loop
		 //
		 for(Employee e:arrStu)
		 {
			 System.out.println(e);
		 }
	}
}
