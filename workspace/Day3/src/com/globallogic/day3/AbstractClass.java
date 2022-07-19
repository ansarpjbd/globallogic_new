package com.globallogic.day3;

//abstract class : i can have the abstract and non abstract method in the abstract class
//calling
//sendsms()
//brand ()  abstract
abstract class ChinaMobile {
	public void calling() {
		System.out.println("calling ");
	}

	public void sendsms() {
		System.out.println("send sms");

	}

	abstract void brand();
}
//class will be always extends
class Mircomax extends ChinaMobile {

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("Mircomax");
	}

}

public class AbstractClass {
public static void main(String[] args) {
	Mircomax mircomax=new Mircomax();
	mircomax.brand();
	mircomax.calling();
	mircomax.sendsms();
	
}
}
