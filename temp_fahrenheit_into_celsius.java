package homework;

import java.util.Scanner;

public class temp_fahrenheit_into_celsius {
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		double  C = scan.nextDouble();
		System.out.println("temp in Celsius ::"+ C);
		
		double F = (9/5)* C + 32;
		System.out.println("temp in fahrenheit ::"+F);
		
	}

}
