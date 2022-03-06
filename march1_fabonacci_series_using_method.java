package methods;

import java.util.Scanner;

public class march1_fabonacci_series_using_method {
	
	static void fabonacci(int n)
	{
		int a=0, b=1;
		while(a<=n || b<=n)
		{
			System.out.println(a);
			System.out.println(b);
			a = a+b;
			b = a+b;
			
		}
	}
	 public static void main(String []args)
	  {
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter number");
			int n=sc.nextInt();
			
			fabonacci(n);
			sc.close();
	  }
}
