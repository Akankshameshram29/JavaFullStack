package day4;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number OF Employees");
		int n = sc.nextInt();
		
		String [] names = new String[n];
		sc.nextLine();
		for(int i =0;i<names.length;i++) {
			System.out.println("Enter name of Employee "+ i);
			names[i] = sc.nextLine();
			
			
		}
	
		
		for(int i =0;i<names.length;i++) {
			System.out.println("Name of Employee " + i + names[i]);
		}
		

	}

}
