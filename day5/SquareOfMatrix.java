package day5;
import java.util.Scanner;
import util.XUtilHelper;
public class SquareOfMatrix 
{
	public static void main(String[] args) 
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Rows: ");
		r = sc.nextInt();
		System.out.println("Enter the no. of Columns: ");
		c = sc.nextInt();
		int[][] arr = XUtilHelper.input2DArray(r,c);
		//int [][]sqArray= new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]= arr[i][j] * arr[i][j];
			}
		}
		System.out.println("Square of Matrix is: ");
		XUtilHelper.print2DArray(arr);
	}
}