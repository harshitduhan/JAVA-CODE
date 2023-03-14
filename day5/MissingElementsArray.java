package day5;
public class MissingElementsArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,5};
		
		missingElement(arr);
	}

	private static void missingElement(int[] arr) 
	{
		int arr1[]= new int [arr.length+1];
		int missedNumber = 0;
		
		//System.out.println("LOOP1");
		for(int i=0;i<arr.length+1;i++)
		{
			arr1[i]=0;
			//System.out.print(arr1[i] + " ");
		}
		//System.out.println("\nLOOP2");
		for(int i=0;i<arr.length;i++)
		{
			arr1[arr[i]-1]=1;
			//System.out.print(arr1[i] + " ");
		}
		//System.out.println("\nLOOP3");
        for (int i=0;i<arr1.length;i++) 
        {
            if (arr1[i] == 0)
                missedNumber=i+1;
        }
        System.out.println("Missing Element is: "+ missedNumber);
	}
}