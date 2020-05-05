package Arrays;

/*
 * How do you find the duplicate number on a given integer array?
 */

public class ProblemTwo {
	public static void main(String[] args) {
		int[] arrayOne = {1,2,3,4,5,6,7,8,8,9,10};
		
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = i + 1; j < arrayOne.length; j++) {
				if (arrayOne[i] == arrayOne[j]) {
					System.out.println("This is our duplicate number: " + (i+1));
				}
			}
		}
	}
}
