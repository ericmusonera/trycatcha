package trycatcha;

import java.util.Scanner;

public class send {
	public static void ma()
	{
		
		int ans, div, d;
		Scanner sc = new Scanner( System.in);
		System.out.println( "Enter the d");
		div = sc.nextInt();
		System.out.println( "Enter the d");
		d = sc.nextInt();
		try
		{
		ans = div / d;
		System.out.println( "When " +"d");
		}
		catch (ArithmeticException e)
		{
		System.out.println( "You have system");
		System.out.println( "System failed");
		ans =div / 1 ;
		System.out.println( "When " +"d");
		  }
	}
	
	public void main( String []arg)
	{
	
send funct=new send();
funct.ma();
}
}
