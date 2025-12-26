package day5;
import java.util.Scanner;

public class BS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {10,20,30,40,50,60};
		int start = 0;
		int end = nums.length-1;
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		boolean found = false;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(nums[mid] == key) {
			 System.out.println("Element found at index" + mid);
			 found = true;
			 break;
			}else if (nums[mid] > key) {
				end = mid -1;
			}else {
				start = mid +1;
			}
		}
		
		if(found == false) {
			System.out.println("key not found");
		}

	}

}
