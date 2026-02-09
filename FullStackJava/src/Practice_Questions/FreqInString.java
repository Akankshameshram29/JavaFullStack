package Practice_Questions;
import java.util.Scanner;

public class FreqInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				count +=1;
			}
		}
		System.out.println("Frequency of charactet " + ch + " is " + count);
	}

}
