package Practice_Questions;

import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
	    String str = sc.nextLine();
	    
		System.out.println("Enter word to remove");
		String wordToRemove = sc.nextLine();
		
		String [] words = str.split(" ");
		
		StringBuilder sd = new StringBuilder();
		
		for(String word: words) {
			if(!word.equalsIgnoreCase(wordToRemove)) {
				sd.append(word + " ");
			}
		}
		
		System.out.println(sd.toString());

	}

}
