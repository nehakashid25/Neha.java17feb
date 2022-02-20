package homework;

import java.util.Scanner;

public class prod_of_decimal_int {
	
	public static void main(String []arg) {
	
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter integer number");
		  int i=sc.nextInt();
		  
		  System.out.println("Enter float number");
		  float d =sc.nextFloat();
		  
		  double prod = i * d;
	  System.out.println("product is:" +prod);
	
}
}