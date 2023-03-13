package day3;

import util.XUtilHelper;

public class NumsPermutation 
{
	public static void main(String[] args) 
	{
		int nums[]= {0,2,1,5,3,4};
		int ans[] = new int[nums.length];
		
		System.out.print("Ans: ");
		for(int i=0;i<nums.length;i++)
		{
			ans[i] = nums[nums[i]];
		}
		XUtilHelper.print1DArray(ans);
		
	}
}