package day6;
import util.XUtilHelper;
public class ArraySpecial1 
{
	public static void main(String[] args) {
		int num=98765;
		extractNumber(num);
		
	}

	public static void extractNumber(int num)
	{
		int rem;
		int arr[]=new int[5];
		
		int i=4;
		while(num>0)
		{
			rem = num%10;
			arr[i]=rem;
		//	System.out.println(rem);
			num=num/10;
			i--;
		}
		//XUtilHelper.print1DArray(arr);
		sqArr(arr);
	}
	public static void sqArr(int arr[])
	{
		int[] res=new int[arr.length];
		for (int i=0;i<arr.length;i++)
		{
			res[i]=arr[i]*((i+1)*(i+1));
		}
		XUtilHelper.print1DArray(res);
	}
}
