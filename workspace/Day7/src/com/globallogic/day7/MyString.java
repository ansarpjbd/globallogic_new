package com.globallogic.day7;

//String --string is a class in java 
        //it is use to store the string value 
       // it is final class 

public class MyString {
	public static void main(String[] args) {

		//string pool area
		String str="Hello Java";   //10001
		
		String str2="Hello Java";
		
		//if(str==str2)
		//both are pointing to same location and value are same 
		System.out.println(str==str2);
		
		//it will behave as object 
		String str1=new String("Hello Java");
		//both are pointing to different memory area 
		System.out.println(str==str1);
		
		//it will compare the value 
		System.out.println("equal "+str.equals(str1));
		
		//charAt: it will give the char at given index 
		//string also start with zero index 
		System.out.println("char at "+str.charAt(1));
		
		//String concat
		//it is use to combine two string
		System.out.println("str.concat(\" java\") "+str.concat(" java"));
		String str6=str.concat(" java");
		System.out.println(str6);
		str.concat(" java");
		System.out.println("str "+str);
		
		//check the string is empty or not
		//true and false
		str.isEmpty();   
		if(str.isEmpty())
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("there is value in string");
		}
		
		//it will convert the string to upper class
		str.toUpperCase();
		System.out.println(str.toUpperCase());
		//which will convert to two lower class
		str.toLowerCase();
		System.out.println(str.toLowerCase());
		//it will return the array of char
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		//System.out.println(str.);
		
		//it is not thread safe
		//thread A
		//thread B
		StringBuffer buffer=new StringBuffer("Hello Java");
		//buffer.append(" java");
		//length of string
		//buffer.length();
		
		buffer.reverse();
		
		System.out.println(buffer);
		
		//it is  thread safe
		//only one thread can enter to this area
		StringBuilder builder=new StringBuilder("hello Java");
		builder.append("java ");
		
	}
}
