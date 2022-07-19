package com.globallogic.day5;

//Polymorphism --it is combined with two words
//poly means many
//morphism --forms

//our application or class is capable to take any form at any time

//Entity //Trainers 
//Employee 
//Person

//there is change in the behaviour 

//method overloading --//it will be completed within the same class
                        //we will same the method in same class with same name and different parameters
                        //static binding
                        //compiler know at the compile time which method to calls
                         //because when will call the method it looks for method name and parameters 
                         //matching method name and parameters then it is able to link these
//method overriding -- //you should have implemented the inheritance for method overriding 
                      //base class method will be overriding by child class method
                       //both should have the same method name and return type
                      //you should have the input parameters also same
                      //runtime -it is not able to get which method to call at compile time
                
class Person {
	public void work() {
		System.out.println("I am doing Person Work");
	}
	public void work(int hours) {
		System.out.println("I am doing Person Work "+hours);
	}
	public String work(int hours,String work) {
		System.out.println("I am doing Person Work "+hours +" "+work);
		return work;
	}
}

class School extends Person {
	public void work() {
		super.work();
		System.out.println("I am doing the School Work");
	}
}

class Office extends Person {
	public void work() {
		System.out.println("I am doing the office Work");
	}
}

public class MyPolymorphism {

	public static void main(String[] args) {
 
		//9-10
		Person ravinder=new Person();
		//call the person class work method
		ravinder.work(8,"work");
		
		//10 to 1 pm
		ravinder=new School();
		//call the school class work method
		ravinder.work();
		
		//5 to 9
		ravinder=new Office();
		ravinder.work();
		
		//You cannot assign the reference of parent class to child class
		//School school=new Person();
		
		
		School sc=new School();
		sc.work();
	}
}
