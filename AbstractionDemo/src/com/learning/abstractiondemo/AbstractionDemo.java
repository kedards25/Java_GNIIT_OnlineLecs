package com.learning.abstractiondemo;

abstract class DemoP
{
	abstract void show();
	abstract void disp();
	abstract void dispMsg();
	
}

//if child class is not overriding all the abstract methods 
//from parent class then child class also has to be declared abstract
abstract class DemoC extends DemoP
{
	@Override
	void show()
	{
		System.out.println("Overridden method show from DemoC");
	}
	
	@Override
	void dispMsg()
	{
		System.out.println("Overridden method dispMsg from DemoC");
	}
}

public class AbstractionDemo extends DemoC{

	@Override
	void disp()
	{
		System.out.println("Remaining method overridden in main class");
	}
	public static void main(String[] args) {
		DemoP dp=new AbstractionDemo();
		dp.show();
		dp.disp();
		dp.dispMsg();

	}

}
