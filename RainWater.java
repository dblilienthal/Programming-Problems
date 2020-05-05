package rainwater;

import java.util.Arrays;
import java.util.Scanner;

public class RainWater {
/*
 * For my solution to the Rainwater Trap, i used two clones of the input array
 * and modified both arrays to only be ascending. One ascending from left to 
 * right and the other from left to right. 
 * 
 * EX: 	inputArray =  {1,2,0,4,3,0,0,5,2,0,1,0}
 * 
 * 		leftToRight = {1,2,2,4,4,4,4,5,5,5,5,5}
 * 		rightToLeft = {5,5,5,5,5,5,5,5,2,1,1,0}
 * 		
 * 		subtract the smaller number of either the leftToRight or rightToLeft 
 * 		at each index with value of the inputArray at that index.
 * 
 * 		answer = 	{1,2,0,4,3,0,0,5,2,0,1,0} <-- inputArray
 * 				    {1,2,2,4,4,4,4,5,2,1,1,0} <-- This is the min values at each index of 
 * 				  - _________________________	  the leftToRight and rightToLeft arrays
 * 					{0,0,2,0,1,4,4,0,0,1,0,0}
 * 
 * 		Add these numbers up and the you get the amount of water trapped
 * 		
 * 		0+0+2+1+4+4+0+0+1+0+0 = 12
 */					
	public static int trapped(int[] height) {
		
		int result = 0;
		int[] leftToRight = height.clone();
		int[] rightToLeft = height.clone();
		
		// Iterate through the array from left to right finding the max height
		for (int i = 0; i< height.length-1; i++) {
			if (leftToRight[i] >= leftToRight[i+1]) {
				leftToRight[i+1] = leftToRight[i];
			} 
		}
		
		// Iterate through the array backwards now finding the max height
		for (int i = height.length-1; i > 0; i--) {
			if (rightToLeft[i] >= rightToLeft[i-1]) {
				rightToLeft[i-1] = rightToLeft[i];
			} 
		}
		
		// Iterate through the array now adding the smaller of the two array
		// subtracted by the height of the original array to find the amount
		// of water trapped
		for (int i = 0; i < height.length; i++) {
			result += Math.min(leftToRight[i], rightToLeft[i]) - height[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] test1 = {1,2,0,4,3,0,0,5,2,0,1,0};	
		System.out.printf("Test 1: \n%s\nHolds: %s\n\n",Arrays.toString(test1),trapped(test1)); //12
		
		int[] test2 = {2,0,0,1,0,3,0,4};
		System.out.printf("Test 2: \n%s\nHolds: %s\n\n",Arrays.toString(test2),trapped(test2)); //10
		
		int[] test3 = {3,1,4};
		System.out.printf("Test 3: \n%s\nHolds: %s\n\n",Arrays.toString(test3),trapped(test3)); //2
		
		int[] test4 = {3,4,1};
		System.out.printf("Test 4: \n%s\nHolds: %s\n\n",Arrays.toString(test4),trapped(test4)); //0
		
		System.out.println("===========================User Input===========================\n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type in a string of integers ex: 1 0 2 4 5 1 3 2 4");
		String userInput = input.nextLine();
		String[] arrInput = userInput.split(" ");
		int[] intArray = new int[arrInput.length];
		for (int i = 0; i<arrInput.length; i++) {
			intArray[i] = Integer.parseInt(arrInput[i]);
		}
		
		System.out.printf("User Input: \n%s\nHolds: %s\n\n",Arrays.toString(intArray),trapped(intArray));
	}
}
