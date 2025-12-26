package day6;

public class BubbleSort {

	public static void main(String[] args) {
		int [] nums = {7,4,8,1,2};
		System.out.println("BEFORE SORTING");
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		for(int i =0;i<nums.length;i++) {
			for(int j =0;j<nums.length-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println("AFTER SORTING");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
