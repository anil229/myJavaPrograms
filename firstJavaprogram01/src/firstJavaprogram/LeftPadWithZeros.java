package firstJavaprogram;



import java.util.Scanner;

public class LeftPadWithZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
		
		try{
		System.out.print("Enter a string: ");
		String originalString =s.next();
		String paddedString = originalString;
		while(paddedString.length()<8){
			paddedString= "0"+paddedString;
		}
	System.out.println("String after padding is:"+paddedString);
	
		}
		finally{
			s.close();
		}
		}
	
}
