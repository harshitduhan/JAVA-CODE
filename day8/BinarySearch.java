package day8;
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key = 7;
		int last=arr.length-1;
		int result = binarySearch(arr,0,last,key);
		if (result == -1)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("Element found at: "+result);
		}
	}
	public static int binarySearch(int arr[], int first, int last, int key)
	{
		if (last>=first)
		{
			int mid = first + (last - first)/2;
			if (arr[mid] == key)
			{
				return mid;
			}
			if (arr[mid] > key)
			{
				return binarySearch(arr, first, mid-1, key);
			}else
			{
				return binarySearch(arr, mid+1, last, key);
			}
		}
		return -1;
	}
}