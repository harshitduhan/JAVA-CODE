package day4;
import util.XUtilHelper;
public class Array0And1 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,0,1,0,1,1,0,0,1};
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		for(int i=count;i<arr.length;i++)
		{
			arr[i]=1;
		}
		
		System.out.print("Sorted Array: ");
		XUtilHelper.print1DArray(arr);
		
	}
}