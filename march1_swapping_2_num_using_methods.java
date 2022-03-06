package methods;

import java.util.Scanner;

public class march1_swapping_2_num_using_methods {
	static void swapping(int a, int b)
	{
		System.out.println("before swapping "+"a = "+ a +" & b = "+ b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping a = "+ a +" & b =  "+ b);
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		swapping(a,b);
		sc.close();
	}
}
