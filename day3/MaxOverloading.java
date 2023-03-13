package day3;
import java.util.*;
public class MaxOverloading {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Two numbers: ");
		int a = sc.nextInt();
		int b=sc.nextInt();
		max(a,b);
		max(2.3,9.8);
	
	}
	
	
	private static void max(int a, int b) 
	{
		if(a>=b)
		{
			System.out.println("Max is: "+a);
		}
		else
		{
			System.out.println("Max is: "+b);
		}
	}
	private static void max(double a, double b) 
	{
		if(a>=b)
		{
			System.out.println("Max is: "+a);
		}
		else
		{
			System.out.println("Max is: "+b);
		}
	}
}