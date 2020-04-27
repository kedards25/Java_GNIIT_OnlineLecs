/*
Anything that is declared as static 
	considered as class level resource
	it exists even before the execution of class
	and value can be maintained for next execution
	and hence we need not to invoke it through object of the class
	if needed, we can invoke it using className.methodName
*/
public class StaticDemo
{
	int num=8;
	static int val=7;
	
	static void show()
	{
		//Static methods can access only static variables
		System.out.println("Values from static method: "+val);
	}
	
	void disp()
	{
		//Non-Static methods can access both static and non-static variables
		System.out.println("Values from static method: "+val+" and "+num);
	}
	
	public static void main(String[] args)
	{
		//show();
		StaticDemo.show();
		StaticDemo demo=new StaticDemo();
		demo.disp();
	}
}