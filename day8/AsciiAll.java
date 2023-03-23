package day8;
import util.XUtilHelper;
public class AsciiAll {

	public static void main(String[] args) {
		
String str="harshit duhan";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(XUtilHelper.printAscii(str.charAt(i)) + " ");
		}
		
	}
}