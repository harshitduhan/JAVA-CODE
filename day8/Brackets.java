package day8;

public class Brackets {

	public static void main(String[] args) {

		String str= "())(";
		int []ans= new int[2];
		
		for(int i=0;i<ans.length;i++)
		{
			if(i==0)
			{
				System.out.print("("+countOpenBrackets(str) + ",");			
			}
			else
			{
				System.out.print(countCloseBrackets(str) + ")");

			}
		}

	}
	public static int countOpenBrackets(String str) {
		int open = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '(')
			{
				open++;
			}
		}		
		return open;
	}

	public static int countCloseBrackets(String str) {
		int close = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '(')
			{
				close++;
			}
		}		
		return close;
	}
}