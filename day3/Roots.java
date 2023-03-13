package day3;
import java.util.*;
public class Roots 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b&c if equation is ax2+bx+c=0 : ");
		double a= sc.nextDouble();
		double b=sc.nextDouble();
		double c= sc.nextDouble();
		root(a,b,c);
	}
	public static void root(double a, double b, double c)
	{
		double d = (b*b)-(4*a*c);
		double sq = Math.sqrt(d);
		if(d>0)
		{
	         double first = (-b + sq)/(2*a);
	         double second = (-b - sq)/(2*a);
	         System.out.println("Roots are : "+ first +" and "+second);
	    }
	}
}