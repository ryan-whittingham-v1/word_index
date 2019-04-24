import java.util.Scanner;

public class IndexUtility {
	
	public IndexUtility() { // Constructor of IndexUtility

		Scanner sc = new Scanner(System.in); // Create scanner to capture user input
		String temp; // Create variable to temporarly store  user input
		int index = 0; // Counter for indexing of user input
		
		while(sc.hasNext()) { // While input available to read in
			temp = sc.next(); // Pull next word from input and assign to temp string
			temp = stringClean(temp); // Convert all characters to lowercase
			index++; // Increment index 
			System.out.println("<" + temp + "> " + index);
		}
		System.out.println("End of file detected.");
		sc.close(); // Close scanner 
	}
	
	// Method to convert string to lowercase and remove punctuation
	public String stringClean(String temp){ 		

		String newString = ""; // New string to return
		char x; // Temporary char variable
		int i = 0; // Index variable
		
		// Check if each character is a letter
		while(i < temp.length()){ 
			x = temp.charAt(i); // Set x variable to character at current index
			if( Character.isLetter(x)) { // If it is a letter...
				newString = newString + x; // ...add it to newString
			}
			i++; // Increment index
		}
	       	
		newString=newString.toLowerCase(); // Convert all letters to lowercase
		
		return newString;
	}
}
