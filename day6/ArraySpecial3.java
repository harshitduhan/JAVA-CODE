package day6;

public class ArraySpecial3 {

	public static void main(String[] args) {
		
		//int arr1[]= {1,1,1,1,2,2,2,2,3,4};
		//int arr1[]={10,2,2,2,2,4,5,6,7,8};
		int arr1[]= {1,2,3,4,5,6};
		
		arraySpecial(arr1);		
	}

	public static void arraySpecial(int[] arr1) {
		
		int count=0;
		int count1=0;
		int n = arr1.length;
		int minValue = -9999;
		int maxValue = 9999;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(minValue == arr1[i])
			{
				count++;
			}
			else if(maxValue == arr1[i])
			{
				count1++;
			}
			else if(count == 0)
			{
				count++;
				minValue = arr1[i];
			}
			else if(count1 == 0)
			{
				count1++;
				maxValue = arr1[i];
			}
			
			else
			{
				count--;
				count1--;
			}
		}
		count=0;
		count1=0;
		for(int i=0;i<arr1.length;i++)
		{
			if (arr1[i] == minValue)
			{
				
                count++;
			}
			else if (arr1[i] == maxValue)
			{
                count1++;
			}
        }
		if (count > n/3)
		{
			System.out.print(minValue);
			
		}
		if (count1 > n/3)
		{
			System.out.println(maxValue);
		}
		else
		{
			System.out.println("-1");
		}
    }		
}