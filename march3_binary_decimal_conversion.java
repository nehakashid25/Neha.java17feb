package march3_arrays;

public class march3_binary_decimal_conversion {
	
	public static void binaryToDec(int a)
	{
		int sum=0,i=0;
		while(a!=0)
		{
			int r = a%10;
			sum = sum+(int)(r*Math.pow(2,i));
			a = a/10;
			i++;
					
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
	
		int a= 10;
		binaryToDec(a);
		
	}

}
