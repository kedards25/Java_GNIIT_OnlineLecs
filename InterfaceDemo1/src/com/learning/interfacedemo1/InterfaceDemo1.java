package com.learning.interfacedemo1;

interface DemoP
{
	//methods in interface are public abstract by default
	void show();
	int NUM=9;//only constants can be defined in interface
}

//in order to inherit an interface the keyword is 'implements'
public class InterfaceDemo1 implements DemoP {

	//default access specifier of class is 'default'
	//in order to override method from parent,method signature has to be same
	//method signature:access_specifier access_modifier return_type methodName(param_list)
	public void show()
	{
		System.out.println("Overridden method from parent class "+NUM);
	}
	
	public static void main(String[] args) {
		InterfaceDemo1 demo1=new InterfaceDemo1();
		demo1.show();
	}

}
