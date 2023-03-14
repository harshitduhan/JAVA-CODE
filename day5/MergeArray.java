package day5;

import util.XUtilHelper;

public class MergeArray {

	public static void main(String[] args) 
	{
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8,10};
		int size= arr1.length + arr2.length;
		//System.out.println(size);
		int arr[]= new int[size];
		int i=0,j=0,k=0;
		while (i < arr1.length && j < arr2.length)
		{
			if (arr1[i] < arr2[j])
			{
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length)
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length)
		{
			arr[k] = arr2[j];
			j++;
			k++;
		}
		
		XUtilHelper.print1DArray(arr);
	}
}