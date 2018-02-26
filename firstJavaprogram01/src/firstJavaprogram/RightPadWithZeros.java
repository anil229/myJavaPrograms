package firstJavaprogram;

import java.util.Scanner;

public class RightPadWithZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String originalString = s.next();
		String paddedString = originalString;
		while(paddedString.length()<8){
			paddedString= paddedString+"0";
		}
	System.out.println("String after padding is:"+paddedString);
	}
}
