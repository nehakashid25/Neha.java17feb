package homework;

import java.util.Scanner;

public class print_float__double {
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter integer number");
		  int i=sc.nextInt();
		  
		  System.out.println("Enter double number");
		  double d =sc.nextDouble();
		  
		  System.out.println("Enter float number");
		  float f = sc.nextFloat();
		  
		  System.out.println(i+ "  " + d+ "  "+ f  );
		  
	}


}
