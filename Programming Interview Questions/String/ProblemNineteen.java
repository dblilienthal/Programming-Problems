package String;

/*
 * How do you print duplicate characters from a string?
 */

public class ProblemNineteen {
	public static void main(String[] args) {
		
		String s = "Hello World!"; 
		
		char[] array = s.toCharArray();
		int n = array.length;
		
		//Brute force technique
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					System.out.println("These are the duplicate characters: " + array[i]);
				}
			}
		}
	}
}
