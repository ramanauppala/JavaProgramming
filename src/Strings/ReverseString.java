package Strings;

public class ReverseString {
	
	static String s ="Hello World";
	
	public static void main(String args[]){
		
		/*
		 * Using String Buffer API
		 */
		StringBuffer revStringUsingAPI = new StringBuffer(s);
		revStringUsingAPI.reverse();
		System.out.println(revStringUsingAPI.toString());
		
		/*
		 * Using Loop
		 */
		StringBuffer revString = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			revString.append(s.charAt(i));
		}
		System.out.println(revString);
		
		
	}

}
