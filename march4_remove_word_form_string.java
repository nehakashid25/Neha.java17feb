package march4_String;

import java.util.*;

public class march4_remove_word_form_string {
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter main string");
		String str = scan.nextLine();
		
		System.out.println("enter a word which you want to remove from string");
		String word = scan.nextLine();
  
        str = str.replaceAll(word, "");
 
        System.out.print(str);
        
        scan.close();
    }
}
