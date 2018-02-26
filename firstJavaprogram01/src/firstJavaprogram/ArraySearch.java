package firstJavaprogram;

public class ArraySearch {
	public static void main(String args[]){
		String[] GivenList={"abc","df","erf","ffc"};
		System.out.println(arraySearch(GivenList, "f"));
	}
	public static Boolean arraySearch(String[] array, String SearchElement){
		if(array!=null){
			for (int j = 0; j < array.length; j++) {
				
			String temp=array[j];
			if(temp==SearchElement){
			return true;	
			}
			}
		
	}
		
			return false;
		
	}

}
