package day5;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		//take two numbers from users and swap them
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("BEFORE SWAPPING");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		
		//using third variable
		int temp = a;
		 a = b;
		 b = temp;
		System.out.println("Number after swaping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		
		//without third variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Number after swaping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		
		
	}

}
