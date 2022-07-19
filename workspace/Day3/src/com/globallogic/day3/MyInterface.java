package com.globallogic.day3;
//Abstraction --it is concept or idea which needs to implements 

//interface--it is used to perform the Abstraction in java
    //it will have the abstract method only --that means we will have the concept only

   //by default interface is abstract
   //by default interface method are also abstract
  //100% abstraction is provided by interface

abstract interface Mobile
{
	abstract public void calling();
	abstract public void sendSMS();
	//non abstract method is not allowed
	/*
	 * public void demo() {
	 * 
	 * }
	 */
}
//calling and sendsms
class Apple implements Mobile
{

	//implement the unimplemented method
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling Aple");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms Apple");
	}
	
}
class Sumsung implements Mobile
{

	//implement the unimplemented method
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling Sumsung");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms Sumsung");
	}
	
}

public class MyInterface {
 
	public static void main(String[] args) {
		
		Apple apple=new Apple();
		apple.calling();
		apple.sendSMS();
		
		//we can create object of interface and give the reference of any implemented class
		Mobile note=new Sumsung();
		note.calling();
		note.sendSMS();
		//you must give the implementation of class or method
		
		Mobile b=new  Mobile() {
			
			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calling() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Mobile newModel=new Mobile() 
		   {
			
			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
			System.out.println("caling is there");
			}
			
			@Override
			public void calling() {
				// TODO Auto-generated method stub
				System.out.println("send sms is there");
			}
		};
		
		newModel.calling();
		newModel.sendSMS();
	}
}
