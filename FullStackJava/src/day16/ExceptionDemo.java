package day16;

import java.util.Scanner;

public class ExceptionDemo {
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
	catch(ArithmeticException e) {
		System.out.println("Divide by zero is not allowed");
	}
	catch(NegativeArraySizeException e) {
		System.out.println("Enter a positive size of array");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Enter a valid index");
	}
	System.out.println("Connection Terminated");
	}
}
