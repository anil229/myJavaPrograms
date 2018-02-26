package firstJavaprogram;

import java.util.Scanner;

public class StringInput {
	  private static Scanner s;

	public static void main(String[] args) {
	    s = new Scanner(System.in);
	    System.out.print("What is your Name? ");
//	    s.nextLine();
	    String name = s.next();
	    System.out.print("Address? ");
	    s.nextLine();
	    String address=s.nextLine();
	    System.out.print("Your age:");
	    int age=s.nextInt();
	    System.out.println("Your Name is: " + name);
	    System.out.println("address is:"+address);
	    System.out.println("Age is:"+age);
	  
	}
}
