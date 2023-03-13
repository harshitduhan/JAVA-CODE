package day4;

import java.util.Scanner;

import util.XUtilHelper;

public class DiagonalSum 
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
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("Sum of Dioganal is: "+sum);
	}
}