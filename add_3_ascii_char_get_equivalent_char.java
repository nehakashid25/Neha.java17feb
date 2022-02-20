package homework;

import java.util.Scanner;

public class add_3_ascii_char_get_equivalent_char {
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("print char:");
		char a = scan.next().charAt(0);
		
		int N = a+3;
		char new_N = (char) N;
		
		System.out.println(N+ "=" +new_N);
		
	}

}
