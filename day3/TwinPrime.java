package day3;
public class TwinPrime 
{
	public static void main(String[] args) 
	{
		for(int i=2;i<100;i++)
		{
			if(prime(i) && prime(i+2))
			{
				int a=i+2;
				//System.out.println(i+","+ i+2);
				System.out.println("(" + i + "," + a +")");
			}
		}
	}
	private static boolean prime(int i) 
	{
		for(int k=2;k<=i/2;k++)
		{
			if(i%k==0)
			{
				return false;
			}
		}
		return true;
	}
}