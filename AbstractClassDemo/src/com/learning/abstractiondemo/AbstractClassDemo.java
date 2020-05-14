package com.learning.abstractiondemo;

//if a class contains atleast one abstract method
//class also has to be declared abstract
abstract class DemoP {
	
	//abstract class can have abstract and non-abstract methods
	abstract void show();
	void disp()
	{
		System.out.println("From abstract class");
	}
	
}

public class AbstractClassDemo extends DemoP{

	@Override
	void show()
	{
		System.out.println("Overridden method from parent");
	}
	
	@Override
	void disp() {
		System.out.println("Overridden method disp from parent");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractClassDemo demo=new AbstractClassDemo();
		
		//if you create object of abstract class
		//you have to initialize it with child class
		DemoP demo=new AbstractClassDemo();
		demo.show();
		demo.disp();
	}

}
