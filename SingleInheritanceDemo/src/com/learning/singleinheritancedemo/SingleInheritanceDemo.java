package com.learning.singleinheritancedemo;

import com.learning.singleinheritancedemo.pckg.DemoP3;

//class DemoP2
//{
//	void show()
//	{
//		System.out.println("Show from DemoP2");
//	}
//}

public class SingleInheritanceDemo extends DemoP3 {
	
	void dispMsg()
	{
		System.out.println("Invoking function from parent class");
		disp();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceDemo demo=new SingleInheritanceDemo();
		demo.dispMsg();
	}

}
