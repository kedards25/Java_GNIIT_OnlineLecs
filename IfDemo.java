//conditional constructs
//Based upon the result of the condition
//block to be executed is decided
//in case if or else block has only one statement to be executed 
//then we can skip to '{''}'brackets

public class IfDemo
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		if(num>5)
		{
			System.out.println("Number is greater than 5");	
		}
		else
		{
			System.out.println("Number is smaller than 5");
		}

	}
}
