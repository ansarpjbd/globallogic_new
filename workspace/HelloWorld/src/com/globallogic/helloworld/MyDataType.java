package com.globallogic.helloworld;

public class MyDataType {

	public static void main(String[] args) {
		
		//writing operation
		//Type mismatch: cannot convert from int to boolean
		boolean b=true;
		
		
		//reading the boolean data
		System.out.println(b);
		
		//Type mismatch: cannot convert from int to byte
		byte bb=-128;
		System.out.println(bb);
		
		//we can store ASCII and Char also, Unicode
		char c=95;
		System.out.println((char)c);
		
		int a=10;
		long lg=0;
		short abc=125;
		
		System.out.println(a);
		System.out.println(lg);
		System.out.println(abc);
		
		float f=1.10f;
		double ff=4.0;
		
		System.out.println(f);
		System.out.println(ff);
	}
}
