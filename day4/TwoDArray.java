package day4;
import java.util.*;
import util.XUtilHelper;
public class TwoDArray 
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
		XUtilHelper.print2DArray(arr);

	}
}