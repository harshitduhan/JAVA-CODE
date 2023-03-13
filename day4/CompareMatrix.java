package day4;

public class CompareMatrix 
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,1},{2,2}};
		int b[][] = {{1,2},{2,2}};
		
		if (similar(a,b) == 1)
		{
			System.out.print("Matrices are Same");
		}
        else
        {
        	System.out.print("Matrices are not Same");
        }
	}

	private static int similar(int[][] a, int[][] b) 
	{
        for (int i =0;i<a.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                if (a[i][j] != b[i][j])
                {
                	return 0;
                }
            }
        }
		return 1;
	}
}