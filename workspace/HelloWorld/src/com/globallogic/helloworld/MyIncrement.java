package com.globallogic.helloworld;

public class MyIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=20;
        int num5=20;
        //++  --it will increment the number by one
        //it will be only used with number
        int num3=--num1;
        int num4=  ++num5;
        System.out.println("Increment  "+num3);
        System.out.println("Decrement "+num4);
        
        //== 
        //if both the number are equal then it will return the true
        //if both the number are not equal it will return false
		if (num1 == num5) {
			System.out.println("both are equal line no 20");
		}
		
		 //if both the number are equal then it will return the false
        //if both the number are not equal it will return true
		if (num1 != num5) {
			System.out.println("both are equal");
		}
	}

}
