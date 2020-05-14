package com.learning.staticpolymorphismdemo;

public class StaticPolymorphismDemo {

	void show()
	{
		System.out.println("From no-arg method");
	}
	
	void show(int num)
	{
		System.out.println("From int-arg method "+num);
	}
	
	void show(float val)
	{
		System.out.println("From float-arg method "+val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPolymorphismDemo demo=new StaticPolymorphismDemo();
		demo.show();
		//in case of floating values
		//default type is double
		//hence need to cast to float
		demo.show(5.6F);
		demo.show(15);
	}

}
