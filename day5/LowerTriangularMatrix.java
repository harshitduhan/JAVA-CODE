package day5;
import java.util.Scanner;
import util.XUtilHelper;
public class LowerTriangularMatrix 
{
	public static void main(String[] args) 
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of Rows: ");
		r = sc.nextInt();
		System.out.print("Enter the no. of Columns: ");
		c = sc.nextInt();
		int[][] arr = XUtilHelper.input2DArray(r,c);
		System.out.println("Lower Triangular Matrix is: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(j>i)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}