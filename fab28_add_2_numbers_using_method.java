package fab_28_methods;

import java.util.Scanner;

public class fab28_add_2_numbers_using_method {
	
	public static int addition(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		int sum = addition(a,b);
		System.out.println(a+"+"+b+"="+sum);
		
		sc.close();
	}

}
