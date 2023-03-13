package Day2;
public class SpeciaSum {
	public static void main(String[] args) 
	{
		int arr[] = {10, 20, 10, 5, 15};
		System.out.println("Special Sum: ");
		specialSum(arr);
	}

	private static void specialSum(int[] arr) 
	{
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			
			sum += arr[i];
			System.out.print(sum +" ");
		}
	}
}
