package homework;

import java.util.Scanner;

public class compute_BMI {
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		double  W = scan.nextDouble();
		System.out.println("weight ::"+ W);
		
		double  H = scan.nextDouble();
		System.out.println("height ::"+ H);
		
		double BMI = (W * 703)/ (H * H);
		System.out.println(BMI);
		

	}
}
