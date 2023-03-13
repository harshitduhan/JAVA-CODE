package day3;
import java.util.*;
public class FirstDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		firstDigit(num);
		lastDigit(num);
		
	}
	private static void lastDigit(int num) 
	{
		int res=num%10;
		System.out.println("Last Digit is: "+res);
	}
	private static void firstDigit(int num) 
	{
		while(num>=10)
		{
			num=num/10;
		}
		System.out.println("First Digit is: "+num);

	}
}