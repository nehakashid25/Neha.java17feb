package march3_arrays;

public class march3_swapping_of_2_numbers_in_array {
	public static void swappingArrayElement(int a )
	{
		int[] arr =  {10, 20};
		int temp = arr[0];
		arr[0]= arr[1];
		System.out.println(arr[0]);
		arr[1]= temp;
		System.out.println(arr[1]);
		 
	}

	public static void main(String []args)
	{
		int a=0 ;
		swappingArrayElement(a );
	}

}
