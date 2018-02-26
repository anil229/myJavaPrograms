package firstJavaprogram;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = s.nextLine();
		String[] words= string.split(" ");
		for(String word:words){
			System.out.println(word);
		}
	
	System.out.println("substring with intial index: "+string.substring(4));
	
	System.out.println("substring with intial and end index: "+string.substring(2, 9));
	
	System.out.println("string in lowercase: "+string.toLowerCase());
	System.out.println("string in uppercase: "+string.toUpperCase());
	System.out.println("char at index4: "+string.charAt(4));
	System.out.println("string subsequence: "+string.subSequence(2, 9));


	}
}
