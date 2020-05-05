package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * How do you find duplicate numbers in an array if it contains multiple duplicates?
 */
public class ProblemFive {

	public static LinkedHashSet<Integer> findDuplicate(int[] a) {
		// Add the results to a linked hash set so duplicates do not get added
		LinkedHashSet<Integer> result = new LinkedHashSet<>();
		
		for (int i = 0; i< a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					result.add(a[i]);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] test1 = {1,2,3,4,5,6,6,7,8};
		System.out.println(findDuplicate(test1)); // 6
		
		int[] test2 = {10,11,15,14,13,17,36,1,8}; // No duplicates
		System.out.println(findDuplicate(test2));
		
		int[] test3 = {1,1,1,1,1,1,1,2,2,2,2,2};  
		System.out.println(findDuplicate(test3)); // 1,2
	}

}
