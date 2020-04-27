public class MethodParamsDemo
{
	int num;
	void show(int val)
	{
		System.out.println("Value received: "+val);
	}

	void disp(int val)
	{
		num=val;
		System.out.println("Value received: "+val);
	}
	
	public static void main(String[] args)	
	{
		MethodParamsDemo methodParamDemo=new MethodParamsDemo();

		methodParamDemo.show(25);
		methodParamDemo.disp(57);
	}
}