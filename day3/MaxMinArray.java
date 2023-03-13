package day3;
import java.util.*;
public class MaxMinArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=5;
		int arr[] = new int[5];
		System.out.println("Enter the elements in the array: ");
		for (int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		max(arr);
		min(arr);
	}

	private static void min(int[] arr) 
	{
		int min = 9999;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum element in array is: "+min);
	}
	private static void max(int[] arr) 
	{
		int max = -9999;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum element in array is: "+max);
	}
}