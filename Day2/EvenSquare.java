package Day2;
import java.util.*;
public class EvenSquare 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		even(n);
		
	}

	private static void even(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print((i*i)+" ");
			}

		}
	}
}