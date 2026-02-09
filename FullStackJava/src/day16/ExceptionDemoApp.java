package day16;
import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a =sc.nextInt();
		System.out.println("Enter second value");
		int b =sc.nextInt();
		try {
		int c = a/b;
		System.out.println(c);
		
		System.out.println("please enter the size of array");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("please enter index no .arr");
		int n = sc.nextInt();
		arr[n] = 999;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
		System.out.println("Connection Terminated"); // as seen in the above program , regardless of the type of exception we receive the same message
		// this is because we are using a single catch block. This disadvantage can be overcomed by making the use of multiple catch blocks.
	}
}


