public class ForEachDemo
{
	public static void main(String[] args)
	{
		int numArr2[]={5,3,8};

		System.out.println("The entered values are: ");

		/*for(int i=0;i<numArr2.length;i++)
		{
			System.out.print(numArr2[i]+"\t");
		}*/
		//using foreach we do not access index of an array but the value
		
		//For each value of i in numArr2
		//perform the code in block
		for(int i:numArr2)
		{
			System.out.print(i+"\t");
		}
	}
}