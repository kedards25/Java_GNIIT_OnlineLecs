public class SwitchDemo
{
	public static void main(String[] args)
	{

			//java 7 onwards string was supported in switch..case
			//int choice=3;
			String choice="3";
			switch(choice)
			{
			case "0":
				System.out.println("East");
				break;			

			case "1":
				System.out.println("West");
				break;

			case "2":
				System.out.println("South");
				break;				

			case "3":
				System.out.println("North");
				break;
				
			default:
				System.out.println("Invalid");

			}	
	}
}