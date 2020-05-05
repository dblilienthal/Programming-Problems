package String;
/*
 * How do you check if two strings are anagrams of each other?
 */
public class ProblemTwenty {
	public static boolean isAnagrams(String a, String b) {
		
		char[] ArrayA = a.toCharArray();
		char[] ArrayB = b.toCharArray();
		int n = ArrayA.length; // This is the arrays length
		
		//Check to see if the lengths are different
		if (ArrayA.length != ArrayB.length) {return false;}
		
		for (int m = 0; m < n; m++){
			for (int i = 0; i < ArrayA.length; i++) {
				for (int j = 0; j < ArrayA.length; j++) {
					if (ArrayA[i]==ArrayB[j]) {
						//If the characters are the same, then remove both of those 
						//characters by creating a new array without them
						ArrayA = remove(ArrayA, i);
						ArrayB = remove(ArrayB, j);
					}
				}
			}
		}
		// If the Array still contains characters, then return false;
		if (ArrayA.length > 0 && ArrayB.length > 0) {return false;}
		return true;
	}
	
	//Remove a character from the array by creating a new array without that index
	public static char[] remove(char[] array, int index) {
		//Create a new char array with one less in length
		char[] temp = new char[array.length - 1]; 
		for (int i = 0, k = 0; i < array.length; i++) {
			if (i == index) { continue; } // If the index is i, then don't add it 
			temp[k++] = array[i];
		}
		return temp;
	}
	
	//Testing Anagrams
	public static void main(String[] args) {
		System.out.println(isAnagrams("Hello", "Hello")); //True
		System.out.println(isAnagrams("Fried", "Fired")); //True
		System.out.println(isAnagrams("Yes", "No")); //False
		System.out.println(isAnagrams("Meow", "Cats")); //False
	}
}
