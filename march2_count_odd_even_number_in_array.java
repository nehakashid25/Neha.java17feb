package march2_arrays;

import java.util.Scanner;

public class march2_count_odd_even_number_in_array {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("enter the size of array");
		//int n = scan.nextInt();
		int[] arr =  new int[10];
		int count1=0, count2=0;
		
		System.out.println("enter the element of array");
		for(int i=0; i<10; i++)
		{
			arr[i] = scan.nextInt();
			if(arr[i]%2==0)
			{
				count1++;	
			}
			
			else
			{
				count2++;
			}
			
		}
		System.out.println("even number:"+count1);
		System.out.println("odd number:"+count2);
		scan.close(); 
	}
	

}
