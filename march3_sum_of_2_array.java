package march3_arrays;

import java.util.Scanner;

public class march3_sum_of_2_array {
	
	public static void sum(int a , int b)
	{
		Scanner scan = new Scanner(System.in);

		int[] arr =  {10, 20, 30, 40, 50};
		int[] arr1 =  {5, 7, 8, 9, 6};
		int[] arr3 = new int[arr.length];
		for(int i=0; i< arr.length; i++)
		{
			arr3[i]= arr[i]+ arr1[i];
			System.out.println("addition of"+arr[i]+" & "+ arr1[i]+" is "+arr3[i]);
		}
	}
	
	public static void main(String []args)
	{
		int a =0, b=0;
		sum(a,b);
	}

}
