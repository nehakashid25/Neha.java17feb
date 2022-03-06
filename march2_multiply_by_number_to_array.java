package march2_arrays;

import java.util.Scanner;

public class march2_multiply_by_number_to_array {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("enter the size of array");
		//int n = scan.nextInt();
		System.out.println("type multiplying factor::");
		int d = scan.nextInt();
		int[] arr =  new int[10];
		int sum=0, m=0;
		
		System.out.println("enter the element of array::");
		for(int i=0; i<10; i++)
		{
			arr[i] = scan.nextInt();
			m = d * arr[i];
			System.out.println(m);
		}
		scan.close();
	}
}
