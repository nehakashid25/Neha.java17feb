package homework;

import java.util.Scanner;

public class inches_into_meter {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inches");
		int inInches = scan.nextInt() ;
		
		double inMeter = inInches / 19.68;
		System.out.print( inMeter);
		
		
	}

}
