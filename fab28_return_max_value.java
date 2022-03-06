package fab_28_methods;

import java.util.Scanner;

public class fab28_return_max_value {
	
	public static int MaxValOf2num(int a, int b)
	{
		int result = a>b? a:b;
		return result;
	}
	public static int MaxValOf3num(int a, int b, int c)
	{
		int result = (a>b && a>c)? a: ((b>c)? b:c);
		return result;
	}
	public static int MaxValOf4num(int a, int b, int c, int d)
	{
		int result = (a>b && a>c && a>d) ? a : ((b>c && b>d)? b: ((c>d)? c:d));
		return result;
	}
	public static void main(String agrs[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		int result = MaxValOf2num(a,b);
		System.out.println("maximum of 2 numbers is::"+result);
		
		System.out.println("Enter 1st number");
		int a1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b1=sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int c1=sc.nextInt();
		
		int result1 = MaxValOf3num(a1,b1,c1);
		System.out.println("maximum of 3 numbers is::"+result1);
		
		System.out.println("Enter 1st number");
		int a2=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b2=sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int c2=sc.nextInt();
		
		System.out.println("Enter 4th number");
		int d2=sc.nextInt();
		int result2 = MaxValOf4num(a2,b2, c2,d2);
		System.out.println("maximum of 4 numbers is::"+result2);
		
		sc.close();
	}

}
