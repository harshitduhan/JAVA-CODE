package day4;
public class RepeatedArrayFunctions 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,1,1,6,6,6,1,6,6,6};
		System.out.println(repeated(arr));
	}

	private static int repeated(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>=arr.length/2)
			{
				return arr[i];
			}
		}
		return -1;
	}
}