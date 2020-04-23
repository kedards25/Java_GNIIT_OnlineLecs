public class MultiDimArray
{
	public static void main(String[] args)
	{
		int[][] numArr2=new int[2][2];
		int[][] numArr3=new int[][]{
						{2,5},
						{8,4}
					   };
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				//System.out.print(i+","+j+"\t");
				System.out.print(numArr3[i][j]+"\t");
			}
			System.out.println();
		}

		
	}
}