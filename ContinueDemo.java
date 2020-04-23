public class ContinueDemo
{
	public static void main(String[] args)
	{
		//what will be the output??
		int num=0;
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
			{
				continue;
				//skips subsequent lines and 
				//control goes back to loop
			}
			num++;
		}
		System.out.println(num);
	}
}