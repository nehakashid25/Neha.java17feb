package methods;

import java.util.Scanner;

public class match1_reverse_a_number_using_method {
	
	static int reverse_num(int num)
	{
		int r, sum=0;
		while(num>0)
		{
			r = num%10;
			sum = sum*10+r;
			num = num/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int result = reverse_num(num);
		
		System.out.println("reverse number of "+num+" is ::"+result);
		sc.close();
	}
	

}
