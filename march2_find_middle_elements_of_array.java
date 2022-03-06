package march2_arrays;

import java.util.Scanner;

public class march2_find_middle_elements_of_array {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("enter the size of array");
		//int n = scan.nextInt();
		 
		int[] arr =  new int[11];
		int sum=0, m=0;
		
		System.out.println("enter the element of array");
		for(int i=0; i<11; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<=(arr.length)/2; i++)
		{
			m =arr[i];
		}
		System.out.println("middle element of an array is::"+m);
	}

}
