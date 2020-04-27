public class ReturnDemo
{

	//Type of value the function is returning
	//will be the return type of the function
	//if it is not returning any value then the return type will be void

	//called function
	double show(double num)
	{
		double val=num+10;
		return val;
	}
	public static void main(String[] args)
	{
		ReturnDemo returnDemo=new ReturnDemo();
		//calling function
		double ans=returnDemo.show(5.7);	
		System.out.println("Value :"+ans);
	}
}