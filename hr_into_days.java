package homework;

import java.util.Scanner;

public class hr_into_days{
	
	public static void main(String arg[])
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("print the hours ::");
		double Hours = scan.nextInt() ;
		
		double days = (Hours / 24);
		System.out.println("the days are::" +days);
		
		double years = (Hours / 8760);
		System.out.print( "the number of years are::" +years);
		
		}	
		
}
