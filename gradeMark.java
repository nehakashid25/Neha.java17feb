package homework;

import java.util.Scanner;

public class gradeMark {
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("marks ::"+ i );
		
		if((i>400) && (i<=500))
		{
			System.out.print("A");
		}
		else if((i>300) && (i<=400))
		{
			System.out.print("B");
		}
		else if((i>200) && (i<=300))
		{
			System.out.print("C");
		}
		else if((i>100) && (i<=200))
		{
			System.out.print("D");
		}
	}

}
