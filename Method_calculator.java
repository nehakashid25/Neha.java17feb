package fab_28_methods;

import java.util.Scanner;

public class Method_calculator {
	
	public static int addition(int a, int b)
	{
		int sum= a+b;
		return sum;
	}
	public static int substraction(int a, int b)
	{
		int diff= a-b;
		return diff;
	}
	public static int multiplication(int a, int b)
	{
		int prod= a*b;
		return prod;
	}
	public static int division(int a, int b)
	{
		int div= a/b;
		return div;
	}
	public static int avg(int a, int b)
	{
		int sum= a+b;
		int avg = sum/2;
		return avg;
	}
	public static int modulo(int a, int b)
	{
		int mod = a%b;
		return mod;
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		char ch = 'N';
		do
		{
			System.out.println("enter choice");
			int choice = scan.nextInt();
			int result =0;
			
			if(choice>=1 && choice<=6)
			{
				System.out.println("enter 1st number");
				int num1 = scan.nextInt();
				
				System.out.println("enter 2nd number");
				int num2 = scan.nextInt();
				
				switch (choice)
				{
					case 1:
						result = addition(num1, num2);
						System.out.println(result);
						break;
					case 2:
						result = substraction(num1, num2);
						System.out.println(result);
						break;
					case 3:
						result = multiplication(num1, num2);
						System.out.println(result);
						break;
					case 4:
						result = division(num1, num2);
						System.out.println(result);
						break;
					case 5:
						result = avg(num1, num2);
						System.out.println(result);
						break;
					case 6:
						result = modulo(num1, num2);
						System.out.println(result);
						break;
				}
			}
			else
			{
				System.out.println("invalid choice");
			}
			System.out.println("Do you want to continue Y/N");
			ch = scan.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y' );
	}
}
