import java.util.*;

public class linearProbing {
	
	static class KeyValueState {
		int keyValue = -1; // Initialize each value to be -1
		String state = "Empty";
	}
	
	static int modValue = 0;
	static int tableSize = 0;
	static int numberOfKeyValues = 0;
	static ArrayList<KeyValueState> hashTable = new ArrayList<>();

	
	/*
	 *  This function uses brute-force to generate a prime number that is larger than 2x the input value
	 */
	static int generateNewPrimeNumber(int input) {
		// Took some of the logic from https://beginnersbook.com/2014/01/java-program-to-display-first-n-or-first-100-prime-numbers/
		boolean status = true;
		int num = 3; // Start at 3 because that is the minimum hash table size we can have
		while(true) {
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
				if ( num%j == 0 ) {
					status = false;
					break;
				}
			}
			if (status) {
				if (num > input * 2) { // If the prime number is greater than double the input, return that number
					return num;
				}
			}
			status = true;
			num++;
		} 
	}
	
	/*
	 * This method re-hashes the old table to a new larger table
	 */
	static void createNewHash(int size) {
		
		// Save the old hash table to a temporate arraylist
		ArrayList<KeyValueState> tempArrList = new ArrayList<>(hashTable); 
		
		// Clear the existing hashTable
		if (!hashTable.isEmpty()) {
			hashTable.clear();
		}
		
		tableSize = size; // Reset the table size
		modValue = size; // Set the new modulus value
		
		for (int i = 0; i < size; i++) {
			hashTable.add(new KeyValueState()); // Initializing the new table
		}
		
		// Re-Hash the new table
		for (int i = 0; i< tempArrList.size(); i++) {
			// Skip the values that are -1
			if (tempArrList.get(i).keyValue != -1) {
				int valToInsert = tempArrList.get(i).keyValue;
				int indexToInsert = valToInsert % modValue;
				hashTable.get(indexToInsert).keyValue = valToInsert;
				hashTable.get(indexToInsert).state = "Active";
			}
		}
	}
	
	/*
	 * This method inserts a key to the table
	 */
	static void insert(int value) {	
		int indexToInsert = value % modValue; // Get the index to insert at
		
		// Loop through all the indexes until there is an open spot to insert 
		int tempCounter = 0; 
		while (tempCounter < tableSize) {		
			// If the cell is not 'Active', then we can insert there
			if (!hashTable.get(indexToInsert).state.contains("Active")) {
				hashTable.get(indexToInsert).keyValue = value;
				hashTable.get(indexToInsert).state = "Active";	
				numberOfKeyValues++; // increment the number of inserts
				break;
			}
			tempCounter++;
			indexToInsert = (value % modValue) + tempCounter;
		}
		// If the load factor is greater than 0.5 after inserting, re-hash
		if (getLoadFactor()) {
			int temp = generateNewPrimeNumber(tableSize);
			createNewHash(temp);
		}
	}
	
	/*
	 * This method deletes a key in the table by changing its state to 'Deleted'
	 */
	static void delete(int value) {
		int indexToInsert = value % modValue; // Get the index to insert at
		
		// Loop through all the indexes until we find the key to delete
		int tempCounter = 0; 
		while (tempCounter < tableSize) {		
			// If the cell is 'Active' and has the same key value, then make 'Deleted'
			if ((hashTable.get(indexToInsert).state.contains("Active")) && (hashTable.get(indexToInsert).keyValue == value)) {
				hashTable.get(indexToInsert).state = "Deleted";
				numberOfKeyValues--; // decrement the number of inserts
				break;
			}
			tempCounter++;
			indexToInsert = (value % modValue) + tempCounter;
		}	
	}
	
	/*
	 * This method displays the status of an entry in the table
	 */
	static void displayStatus(int index) {
		if (hashTable.get(index).keyValue != -1) {
			System.out.println(hashTable.get(index).keyValue+" "+hashTable.get(index).state);
			return;
		}
		System.out.println(hashTable.get(index).state);
	}
	
	/*
	 * This method searches for a key in the table 
	 */
	static void search(int value) {
		for (int i = 0; i< hashTable.size(); i++) {
			if (hashTable.get(i).keyValue == value) {
				System.out.println(value+" Found"); // Print out it was found
				return;
			}
		}
		System.out.println(value + " Not found");
	}
	
	/*
	 * Return true if the load factor is greater than 50%
	 */
	static boolean getLoadFactor() {
		if (tableSize == 0) return true; // Test-case for a table that is 0
		return (((float)numberOfKeyValues / (float)tableSize) > 0.5);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int startTableSize = Integer.parseInt(sc.nextLine()); // Get the starting table size

		createNewHash(startTableSize); // Create the initial hashTable
		
		int numOfCommands = Integer.parseInt(sc.nextLine()); // Get the number of commands
		
		while (numOfCommands > 0) {
			
			String command = sc.nextLine(); // Take in the command
			
			if (command.contains("insert")) {
				String[] temp = command.split(" ");	// Split the input string
	    		int insertValue = Integer.parseInt(temp[1]); // Convert the second string in the array to an integer
	    		insert(insertValue); // Insert the value
			} else if (command.contains("displayStatus")) {
				String[] temp = command.split(" ");
	    		int insertValue = Integer.parseInt(temp[1]);
	    		displayStatus(insertValue);
			} else if (command.contains("search")) {
				String[] temp = command.split(" ");
	    		int insertValue = Integer.parseInt(temp[1]);
	    		search(insertValue);
			} else if (command.contains("delete")) {
				String[] temp = command.split(" ");
	    		int insertValue = Integer.parseInt(temp[1]);
	    		delete(insertValue);
			} else { // Table size
				System.out.println(tableSize);
			}			
			numOfCommands--;
		}
	}
}
