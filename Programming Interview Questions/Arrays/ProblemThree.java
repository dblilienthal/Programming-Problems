package Arrays;

/*
 * How do you find the largest and smallest number in an unsorted integer array?
 */
public class ProblemThree {
	public static void main(String[] args) {
		// Our test Array
		int[] array = {9,1,2,3,1,4,743,468,34,45,8,7,9};
		
		// Create two variable to hold the largest and smallest integer
		int j = array[0], k = array[0];

		for (int i = 0; i < array.length; i++) {
			//If the integer j is bigger than the current integer, set j to that integer
			if(j > array[i]) {
				j = array[i];
			}
			//If the integer g is smaller than the current integer, set k to that integer
			else if (k < array[i]) {
				k = array[i];
			}
		}
		System.out.println("This is the lowest integer: "+j);
		System.out.println("This is the highest integet: " + k);
	}
}
