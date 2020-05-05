package String;

import java.util.HashMap;

/*
 * How do you print the first non-repeated character from a string?
 */

public class ProblemTwentyOne {

	public static void printCharacter(String s) {
		HashMap<Integer, Character> map = new HashMap<>();
		char[] temp = s.toCharArray();
		boolean flag = true;
		
		// Store all duplicate characters to a HashMap
		for (int i = 0; i<s.length(); i++) {
			for (int j = i+1; j<s.length();j++) {
				if(temp[i]==temp[j]) {
					map.put(i, temp[i]);
					map.put(j, temp[j]);
				}
			}
		}
		// Compare the HashMap index to the array index. The first location to where the HashMap index
		// is not equal to the array index is the first place where there is not a duplicate character. 
		for(int i = 0; i<s.length();i++) {
			if (map.get(i) == null) {
				System.out.println(temp[i] + " is the first character to not have a duplicate at index: "+i);
				flag = false;
				break;
			}			
		}
		if (flag == true) {
			System.out.println("All characters have duplicates");
		}
	}
	
	public static void main(String[] args) {
		printCharacter("aabbccddeeffgg");// All characters have a duplicate
		printCharacter("abbccddeeffgg");// The first character does not have a duplicate
		printCharacter("aabbccddeeffggh");// The last character does not have a duplicate
		printCharacter("abbccddeeffgghi");// The first and last character does not have a duplicate
		printCharacter("abcabc"); // All characters have a duplicate
		printCharacter("aabbccddeeffgghij");// The last two character do not have a duplicate
		printCharacter("asfgargvfgr"); // S is the first character not to have a duplicate 
	}
}
