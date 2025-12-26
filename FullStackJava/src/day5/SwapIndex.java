package day5;
import java.util.Scanner;


public class SwapIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		System.out.println("Enter two indexes in array to swap");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("ARRAY ELEMENTS BEFORE SWAPPING");
		System.out.println("element at index i =" + nums[i]);
		System.out.println("element at index j =" + nums[j]);
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
		System.out.println("ARRAY ELEMENTS AFTER SWAPPING");
		System.out.println("element at index i =" + nums[i]);
		System.out.println("element at index j =" + nums[j]);
		
	}

}
