package day8;
import util.XUtilHelper;
public class AsciiOfVowelsAndSpace {

	public static void main(String[] args) {
		
		String str="harshit duhan";
		
		for(int i=0;i<str.length();i++)
		{	
			if(str.charAt(i) == 'a')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}
			else if(str.charAt(i) == 'e')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}
			else if(str.charAt(i) == 'i')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}
			else if(str.charAt(i) == 'o')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}
			else if(str.charAt(i) == 'u')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}
			else if(str.charAt(i) == ' ')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}

			else if(str.charAt(i) == 'A')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}

			else if(str.charAt(i) == 'E')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}

			else if(str.charAt(i) == 'I')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}

			else if(str.charAt(i) == 'O')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}

			else if(str.charAt(i) == 'U')
			{
				System.out.print(XUtilHelper.printAscii(str.charAt(i))+" ");
			}
			else
			{
				System.out.print(str.charAt(i)+" ");
			}
		}		
	}
}