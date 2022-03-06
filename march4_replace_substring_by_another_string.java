package march4_String;

import java.util.Scanner;

public class march4_replace_substring_by_another_string {
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter main string");
		String str = scan.nextLine();
		
		 System.out.println("enter the word you want to replace");
		String substring = scan.nextLine();
		
		 System.out.println("enter word by which you want to replace previous word");
		String word = scan.nextLine();
  
        str = str.replace(substring, word);

        System.out.print(str);
    }


}
