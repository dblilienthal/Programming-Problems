package Arrays;

/*
 * How do you find all pairs of an integer array whose sum is equal to a given number?
 */

public class ProblemFour {

	public static void main(String[] args) {
		
		int[] array = {0,5,2,3,6,2,3,6,2,4,7,5,2,3,4,7,3,2,7,7,1,3,4};
		
		int sum = 10;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					System.out.println(array[i] + " + " + array[j]+ " = sum: " + sum);
				}
			}
		}
	}
}
