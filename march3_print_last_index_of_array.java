package march3_arrays;

import java.util.Scanner;

public class march3_print_last_index_of_array {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int[] arr =  new int[n];
		System.out.print("element of array");
		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();

		}
		System.out.println("last index element of an array is::"+arr[n-1]);
	}

}
