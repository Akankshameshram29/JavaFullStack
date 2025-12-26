package day5;
import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		//write a java program to check if the element given by the user is present in the array or not , also display index of element if not present

		Scanner sc = new Scanner(System.in);
		int [] arr = {10, 30, 50, 60,70};
		System.out.println("Enter the num to search");
		int target = sc.nextInt();
		boolean found = false;
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				System.out.println("Element found at index = " + i);
				found = true;
				break;
			}
		}
		if(found==false) {
			System.out.println("Key not found");
		}
		
	}

}
