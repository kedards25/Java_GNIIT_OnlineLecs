//header files in c++,Packages in Java
//java.lang.object is imported by default in our app
//no need to import 'java.lang.object' explicitly
//we can have only public class in one program
//in case,you have many classes in your program then the class in which
//you have mentioned the main function has to be declared as public
public class HelloDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello "+args[0]+" and "+args[1]);
	}
}