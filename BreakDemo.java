public class BreakDemo
{
	public static void main(String[] args)
	{
		//what will be the output??
		int num=0;
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
			{
				break;
				//will break the loop and stop execution
			}
			num++;
		}
		System.out.println(num);
	}
}