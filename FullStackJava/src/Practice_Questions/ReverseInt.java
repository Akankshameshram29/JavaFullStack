package Practice_Questions;
import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int reversed = 0;
		int sign = num < 0 ? -1 : 1; 
		num = Math.abs(num);
		while(num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num= num/10;
		}
		
		  reversed = reversed * sign;
	      System.out.println("Integer after reversing = " + reversed);
	}

}
