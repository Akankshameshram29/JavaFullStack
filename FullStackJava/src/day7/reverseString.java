package day7;

public class reverseString {
	//que. Write a java  program to reverse a string 
	public static void main(String[] args) {
		String s = "Rose";
		StringBuilder sb = new StringBuilder();
		for(int i =s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		
		
		
		
	}

}
