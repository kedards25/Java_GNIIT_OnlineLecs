public class SwitchDemo
	{
		public static void main(String[] args)
		{
			//prior java 7 string values were not allowed in case
			//java 7 onwards string values are supported in cases
			int choice=3;
			switch(choice)
			{
				case 1:
					System.out.println("East");
					break;
				case 2:
					System.out.println("West");
					break;
				case 3:
					System.out.println("North");
					break;
				case 4:
					System.out.println("South");
					break;
				default:
					System.out.println("Please enter number between 1-4");

			}


		}
	}