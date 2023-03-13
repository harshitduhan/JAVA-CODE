package day4;
import java.util.Scanner;

import util.XUtilHelper;
public class Represent2D_To_1D_Array 
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
		int oneDArray[]=new int[r*c];
		int k = 0;
        for (int i =0;i<r;i++)
        {     	
            for (int j =0;j<c;j++)
            {
                k = i * c + j;
                oneDArray[k] = arr[i][j];
            }
        }
        
        XUtilHelper.print1DArray(oneDArray);
	}
}