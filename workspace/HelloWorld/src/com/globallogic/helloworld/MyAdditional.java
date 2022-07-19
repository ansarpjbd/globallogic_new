package com.globallogic.helloworld;


public class MyAdditional {

	
	public static void main(String[] args) {
		int number1=20;
		int number2=20;
		
		//need the sum of these two number
		                   //operand 1    (operator+)        (operand2)
		          //(assigment) -->it will take the value from right side and copy to left side 
		
		int number3  =   number1        +                   number2;
		
		int num4=number3;
		
		
		System.out.println("Sum of "+number3);
		System.out.println("=== "  +num4);
	}
}
