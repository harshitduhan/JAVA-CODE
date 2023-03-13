package day4;
import java.util.Scanner;

import util.XUtilHelper;
public class MaxMinMatrix 
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
		
		max(arr,r,c);
		min(arr,r,c);
	}

	private static void max(int[][] arr, int r, int c) 
	{
		int m=-9999;
		for (int i=0;i<r;i++) 
		{
            for (int j=0;j<c;j++) 
            {
                if (arr[i][j] > m) 
                {
                    m = arr[i][j];
                }
            }
        }
		System.out.println("Maximum Element is: "+ m);
	}
	
	
	private static void min(int[][] arr, int r, int c) 
	{
		int n=9999;
		for (int i=0;i<r;i++) 
		{
            for (int j=0;j<c;j++) 
            {
                if (arr[i][j] < n) 
                {
                    n = arr[i][j];
                }
            }
        }
		System.out.println("Minimum Element is: "+ n);
	}
}