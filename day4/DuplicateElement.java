package day4;

public class DuplicateElement 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,10,7,3,7,5,9,1,3};
		int a=arr.length;
		System.out.println("Duplicate elements in given array: ");
		
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}