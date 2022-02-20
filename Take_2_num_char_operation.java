package Java.Fundamentals;

import java.util.Scanner;

public class Take_2_num_char_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number :: ");
		int i = scan.nextInt();
		System.out.println("Enter 2st number :: ");
		int p = scan.nextInt();
		System.out.println("Enter the letter:: ");
		char c= scan.next().charAt(0);
		int result= i+p+c;
		int result1= i-p-c;
		int result2= i*p*c;
		int result3= i/p/c;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}
