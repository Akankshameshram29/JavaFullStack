package day6;

import java.util.Scanner;

public class FibboSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println("Fibonacci Series till " + n);
		for(int i =0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
