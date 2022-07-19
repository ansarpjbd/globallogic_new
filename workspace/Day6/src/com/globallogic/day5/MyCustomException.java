package com.globallogic.day5;


import java.util.Scanner;

//extends the exception class 

//RuntimeException --unchecked exception

//IOException--checked exception
class PositiveNumber extends Exception {
	
	public PositiveNumber(String msg) {
		
		super(msg);
		// TODO Auto-generated constructor stub
	}
}

//throw --it is use to throw new exception
//throws --it is used to throw the exception back to calling method
public class MyCustomException {

	public static void main(String[] args) {

		
		

	
       //try with resouces : you can pass the resouce to the try block
		 //it will automacally call the close method and close the resouce 
		try(Scanner scanner = new Scanner(System.in))
		{
			System.out.println("Enter a number");
			int num = scanner.nextInt();
			if (num < 0) {
				throw new PositiveNumber("Enter Only Positive Number");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
		
		}
		
}
}
