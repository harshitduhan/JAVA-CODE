package day4;

public class RepeatedArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,1,5,9,9,9,9,9,9,1,3};
		int a=arr.length;

		System.out.println("Duplicate element in given array who's occurence is >n/2: ");

		for(int i=0;i<a;i++)
		{
			int count=0;
			for(int j=i+1;j<a;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>=a/2)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}