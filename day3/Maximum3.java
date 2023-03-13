package day3;
import java.util.Scanner;
public class Maximum3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Three numbers: ");
		int a = sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=max(a,b);
		int e=max(d,c);
		System.out.println("Maximum no is : "+e);
	}
	private static int max(int a, int b) 
	{
		if(a>=b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}