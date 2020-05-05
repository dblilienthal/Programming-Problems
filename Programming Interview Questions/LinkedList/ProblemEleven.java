package LinkedList;

import java.util.LinkedList;

/*
 * How do you find the middle element of a singly linked list in one pass?
 */

public class ProblemEleven {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);list.add(25);list.add(33);list.add(400);list.add(534);list.add(664);list.add(7);
		
		// Create an increment, result, and middle pointer instance variable
		int i = 0, result = 0, mPointer = 0;
		try {
			// Iterate though the LinkedList until the end
			while(list.get(i) != null) {
				if (i%2 == 1) {
					// If the incrementer is odd, increment the middle pointer and 
					// store the set the new result. 
					mPointer++;
					result = list.get(mPointer);
				}
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			// When the list reaches the end, return the middle number.
			System.out.println("This is the middle number: " + result);
		}
	}
}
