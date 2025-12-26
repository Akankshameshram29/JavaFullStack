package day6;
import java.util.*;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int original = num;
		int result = 0;
		int power = String.valueOf(num).length();
		
		while(num != 0) {
			int digit = num % 10;
			result += Math.pow(digit,power);
			num /= 10;
		}
		if(result == original) {
			System.out.println("Its a ArmStrong number");
		}else {
			System.out.println("Its not a ArmStrong number");
		}
		

	}

}
