package day4;

public class PairSumInArray 
{
	public static void main(String[] args) 
	{
		int arrSum[] = { 1,2,3,4,5,6,7,8,9};
        int n = arrSum.length;
        int sum = 8;
        pairs(arrSum, sum);
	}

	private static void pairs(int[] arrSum, int sum) 
	{
		int n=arrSum.length;
		System.out.println("Pairs who's Sum is 8 are: ");
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (arrSum[i] + arrSum[j] == sum)
				{
					System.out.println(arrSum[i] + "," + arrSum[j]);
				}
			}
		}
	}
}