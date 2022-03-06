package march2_arrays;

import java.util.*;

public class march2_sum_of_elements_of_array {

	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("enter the size of array");
				//int n = scan.nextInt();
		int[] arr =  new int[10];
		int sum=0;
		
		System.out.println("enter the element of array");
		for(int i=0; i<10; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println("sum of elements of array is ::"+ sum);
	}
}
