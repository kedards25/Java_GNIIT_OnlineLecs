import java.util.Scanner;
//class name should follow UpperCamelCase and should ideally be noun
public class OOPS_Demo
{
	//variable names should be logical and 
	//should clearly depict its purpose
	//use lowerCamelCase if name consists of more than one word
	int num1,num2,ans;
	
	//divide the problem statement in I-P-O
	//and create separate function for each
	//use lowerCamelCase if name consists of more than one word
	//should ideally be verb
	void acceptData()
	{
		System.out.println("Enter two numbers");
		//Use Scanner from java.util package to accept input
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();

	}

	void addData()
	{
		ans=num1+num2;
	}
	
	void subtractData()
	{
		ans=num1-num2;
	}
	void showData()
	{
		System.out.println("Addition is: "+ans);
	}
	public static void main(String[] args)
	{
		//create object as same name as that of class but in lowerCamelCase
		OOPS_Demo oopsDemo=new OOPS_Demo();
		oopsDemo.acceptData();
		oopsDemo.addData();
		oopsDemo.showData();

		//to perform subtraction, we can reuse acceptData() and showData()
		oopsDemo.acceptData();
		oopsDemo.subtractData();
		oopsDemo.showData();
	}
}