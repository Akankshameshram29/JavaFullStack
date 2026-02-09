package Practice_Questions;

import java.util.Scanner;

public class PalindromeSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine().strip().toLowerCase();
		
		int j = str.length()-1;
		boolean flag = true;
		for(int i =0;i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("Not palindorme");
				flag = false;
				break;	
			}
		}
		if(flag == true) {
			System.out.println("Palindrome");
		}
	}

}
