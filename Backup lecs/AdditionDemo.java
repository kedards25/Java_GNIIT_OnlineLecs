public class AdditionDemo
{
	public static void main(String[] args)
	{
		//Parameter values are of type String 
		//hence in order to perform addition 
		//we have to convert it into integer
		int num1,num2,sum;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		sum=num1+num2;
		System.out.println("Sum: "+sum);
	}
}