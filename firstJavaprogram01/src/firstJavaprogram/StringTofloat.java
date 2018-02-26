package firstJavaprogram;

import java.util.Scanner;

public class StringTofloat {
	public static void main(String args[]){
		String numberAsString;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a flaot value as string:");
		numberAsString= s.next();
		float number= Float.parseFloat(numberAsString);
		System.out.println("The float value is: "+number);
	}
}
