public class ArrayDemo
{
	public static void main(String[] args)
	{
		int [] numArr=new int[3];
		int numArr2[]={5,3,8};
		int [] numArr3=new int[]{3,6,7};
		int [] numArr4=new int[3];
			numArr4[0]=9;
			numArr4[1]=1;
			numArr4[2]=4;

		//System.out.println("Enter 3 values");
		for(int i=0;i<3;i++)
		{
			numArr[i]=Integer.parseInt(args[i]);
		}
		System.out.println("The entered values are: ");
		for(int i=0;i<3;i++)
		{
			System.out.print(numArr2[i]+"\t");
		}
	}
}