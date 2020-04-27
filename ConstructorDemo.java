/*Constructor is a 
		special method which is used to initialise member variables at runtime
		has same name as class name
		will never have any logic within its body
		hence it will not have a return type
		gets invoked as soon as object of the class is created
		constructor can have access specifiers
		constructors are never inherited*/
public class ConstructorDemo
{
	public int num;

	//no-arg constructor
	ConstructorDemo()
	{
		num=7;
	}

	//parameterised constructor
	/*ConstructorDemo(int val)
	{
		num=val;
	}*/

	ConstructorDemo(int num)
	{
		//variable prefixed with 'this' keyword 
		//refers to class scoped variable
		this.num=num;
	}

	void show()
	{
		System.out.println("Value :"+num);
	}

	public static void main(String[] args)
	{
		ConstructorDemo demo1=new ConstructorDemo();
		demo1.num++;
		demo1.show();
	
		//each object maintains different copy of variable 
		//hence value of num remains unchanged when invoked using second object
		//ConstructorDemo demo2=new ConstructorDemo();
		//demo2.show();

		ConstructorDemo demo3=new ConstructorDemo(15);
		demo3.show();


	}
}