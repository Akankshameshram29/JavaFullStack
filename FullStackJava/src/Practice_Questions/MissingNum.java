package Practice_Questions;
import java.util.*;

public class MissingNum {
	
	/*The "Missing Number" problem in Data Structures and Algorithms (DSA) is a common challenge where you are given 
	 * an array of distinct numbers within a specific range (e.g., 0 to \(N\), or 1 to \(N\)) and tasked with finding 
	 * the single number that is not present in the array. */
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements in the array (N-1):");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of array in range 0 to" + n);
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int res = FindMissing(arr);
		System.out.println("The missing number is: " + res); 
	}
	
	public static int FindMissing(int [] arr){
		int n = arr.length;
		int exp_sum = (n*(n+1))/2;
		int original_sum = 0;
		for(int i=0;i<arr.length;i++) {
			original_sum += arr[i];
		}
		int missing_num = exp_sum - original_sum;
		return missing_num;
	}

}
