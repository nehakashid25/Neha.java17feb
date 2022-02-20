package Java.Fundamentals;

public class Sum_digit_in_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 343, r, sum = 0,num=0;
		while (i> 0) {

			r = i % 10;
			sum = sum + r;
			i=i/10;
		}
		System.out.println(sum);
	}

}
