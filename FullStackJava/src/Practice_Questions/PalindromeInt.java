package Practice_Questions;

import java.util.Scanner;

public class PalindromeInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int original = num;
		int reversed = 0;
		int sign = num < 0 ? -1 : 1; 
		num = Math.abs(num);
		while(num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num= num/10;
		}
		
		reversed = reversed * sign;
	    if(original == reversed) {
	    	System.out.println("Its a palindrome Integer");
	    }else {
	    	System.out.println("Not a palindrome Integer");
	    }
	    
	}

}
