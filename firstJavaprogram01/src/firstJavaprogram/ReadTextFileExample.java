package firstJavaprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileExample {
	public static void main(String args[]){
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("C:\\Users\\pakal\\Desktop\\1.txt"));
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		finally{
			try{
				if (br!=null){
					br.close();
				}
			}
				catch(IOException ex){
					ex.printStackTrace();
				}
			}
			
		}
}
