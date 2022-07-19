package com.globallogic.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
//try and catch
//try and catch both are block in java
//there is not try block with catch block
//catch block will receive the object of raised exception class
//single try block and can have multiple catch
//child class will be defined first
//finally block
           //it will always execute whether there is exception or not
            //connection closing or resouce closing code in the finally

//Chain Exception
//throws--it is use to throw the exception at method level
       //which ever method is called from that needs to handle the exception or needs or throw again
public class MyException {
	
	
	public static void myExceptionMethod() throws FileNotFoundException {
		
			FileInputStream ft = new FileInputStream("c:\\java.txt");
		
	}
	
	public static void main(String[] args) {

		// you cannot divide any number with zero
		// divide by zero exception will be throws
		// Arithmetic Exception

		// Exception Class : java.lang.ArithmeticException
		// Exception Message : by zero
		int a = 10;
		int b = 0;

		// int c = a / b;

		// System.out.println("c is " + c);

		// java.lang.NullPointerException
		// No message
		String str = null;
		// System.out.println(str.charAt(10));

		int[] arr = new int[2];
		// java.lang.ArrayIndexOutOfBoundsException:
		//System.out.println(arr[10]);

		// checked exception
		// it look like error here
		// is echecked expcetion
		
		try {
			myExceptionMethod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
