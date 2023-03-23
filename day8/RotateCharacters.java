package day8;

public class RotateCharacters {

	public static void main(String[] args) {
		
		String str = "ZOMATO";
		int a=2;
		
		String ans= str.substring(str.length()-a, str.length()) + str.substring(0,str.length()-a);
		System.out.println(ans);
	}

}
