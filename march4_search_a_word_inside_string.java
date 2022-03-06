package march4_String;

import java.util.Scanner;

public class march4_search_a_word_inside_string {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter main string");
		String str = scan.nextLine();
		
		System.out.println("enter a word which you want to find in string");
		String word = scan.nextLine();
		
		int Index = str.indexOf(word);
		
		if(Index == - 1) 
		{
			System.out.println(word+" not found");
		} else 
		{
			System.out.println("Found "+ word +" at index "+ Index);
		}
		scan.close();
	}

}
