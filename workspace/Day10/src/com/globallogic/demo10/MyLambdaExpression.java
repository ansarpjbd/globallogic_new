package com.globallogic.demo10;
//Lambda Expression --it is new feature in java 1.8
// we will able to perform funcational programming 

//this should be functional interface
//there should be one abstract method in the interface
@FunctionalInterface
interface Code
{
	//create a interface and create a abstract with same return type and input parameters
	public int sum(int a,int b);

}
@FunctionalInterface
interface Print
{
	public void msg();
}
public class MyLambdaExpression {
	
	public static void main(String[] args) {
		
		//you will be able to store the value in variable
		
		
		//you will be able to store the full method in variable--lambda expression
		//Rule..You should not have any return type
		     //from return type it will able to understand the return the
		//Rule 2: you do not need the access modifier 
		//my method is going to store in the variable so method scope is not required
		//remove the static keyword if any is there--becuase this method will store in variable does not belong to any class
		//add the lambda expression   -> after the method name
		//you cn remove the method name also --
		//you can store method only to interface type variable
		//no need of input parameters data-type also
		Code code= (a, b)->{return a+b;};
		//u can call the method also
		System.out.println(code.sum(10, 20));
		
		Print p=()->{System.out.println("Print ");};
		p.msg();
	}

	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	

}
