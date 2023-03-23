package day6;

public class ArraySpecial2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int num=0;
		for (int i=0;i<arr.length;i++)
		{
			num = arr[i]+num*10;
			//System.out.println(num);
		}
		System.out.println("Number is: " + num);

	}

}
