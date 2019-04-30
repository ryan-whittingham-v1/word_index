import java.util.Scanner;

public class IndexUtility {

	//Constructor 
	public IndexUtility() {
		
	}

	// Create a list of words from standard in
	public WordList buildIndex() {
		Scanner sc = new Scanner(System.in); // Create a scanner to capture input
		String temp; // Variable to temporarly store input
		int index = 0; // Variable to store location of each word
		WordList wl = new WordList(); // Create new WordList		
		// Parse input for words
		while(sc.hasNext()) { // While input available to read in
			temp = sc.next(); // Pull next word from input and assign to temp string
			temp = stringClean(temp); // Format the word for the list
			index++; // Increment the location index 
			wl.add(temp, index); // Add the word and it's location to the wordlist
		}
		System.out.println("End of file detected.");
		sc.close(); // Close scanner
		return wl; // return the new word list
	}
	
	// Method to convert string to lowercase and remove non-letter characters
	public String stringClean(String temp){ 		
		String newString = "";
		char tempChar; // Temporary char variable
		int i = 0; // Index variable
		
		// Remove non-letters from the word
		while(i < temp.length()){ // Crawl through word one character at a time
			tempChar = temp.charAt(i);
			if( Character.isLetter(tempChar)) { // If the character is a letter...
				newString = newString + tempChar; // ...add it to newString
			}
			i++; // Move to next character
		}
		// Convert to lowercase letters
	       	newString=newString.toLowerCase();
		return newString;
	}
}
