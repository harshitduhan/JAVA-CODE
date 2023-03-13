package day3;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		Factorial.fact(n);
	}
	public static void fact(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			
			fact= fact*i;
		}
		System.out.println("Factorial is "+ fact);
	}

}
