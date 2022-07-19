package com.globallogic.day2;

import java.util.Scanner;

//Scanner--address of class  java.util
          //java.util
          //it was introduce in 1.5 (1996)
         //it is used to take the input and read it (keyword, internet, file)
         //
public class MyScanner {
public static void main(String[] args) {
	
	//classname   object   assigment    //memory allocation of object     constructor  //inputparamters
	Scanner       sc        =           new                                 Scanner(System.in);

    //access the method of class
	 //using the dot(.)
	  //sc.nextInt()  //read the int value and return it
	//System.out.println("Enter the int value");
	//System.out.println("entered values is "+sc.nextInt());
	
	//int a=sc.nextInt();
	//System.out.println(a);
	
	
	//sc.nextFloat();  //it will read the float value and return it
	//System.out.println("enter the float value ");
	//float f=sc.nextFloat();
	//System.out.println("entered float value is "+f);
	
	//sc.nextByte(); //it will read the byte value and return it
	//System.out.println("enter the byte value ");
	//byte bb=sc.nextByte();
	//System.out.println("byte value is "+bb);
	
	
	//sc.nextDouble();  //it will read the double value and return it
	
	//sc.nextBoolean();  //it will read the boolean value and return it
	
	//sc.next();  //it is used to read the string value
	            //if it found the space and nextline .it will terminate it 
	
	//System.out.println("enter the string value");
	//String str=sc.next();
	//System.out.println("string value is "+str);

	
	  //sc.nextLine();  //it will read the line and retrun us
	                    //it will terminate when you press the next line
	                    //it will read the space alsos
	 // System.out.println("enter the line");
	 // String str=sc.nextLine();
	 // System.out.println("line is "+str);
	  
	//  sc.nextLong();
	//  sc.nextShort();
	 // sc.next
	//  sc.hasNext();  //return the true and flase
	                 //if there is next value then it will return true
	                  //if there is not next value it will reutrn false
	  
	  if(sc.hasNext())
	  {
		  System.out.println(sc.next());
	  }
}
}
