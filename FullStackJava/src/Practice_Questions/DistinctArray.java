package Practice_Questions;

import java.util.HashSet;

public class DistinctArray {
	// Distinct Array -an array where every element is unique, meaning no two elements have the same value. 

	public static void main(String[] args) {
		int [] arr = {1,2,3,3,4,5};
		System.out.println(Distinct(arr));

	}
    static boolean Distinct(int [] arr) {
    	HashSet<Integer> uniqueElements = new HashSet<>();

    	for (int num : arr) {
            if (!uniqueElements.add(num)) {
                return false;
            }
        }

    	return true;
    }
}
