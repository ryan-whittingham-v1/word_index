class WordList {
	
	private Node firstNode, newNode, temp, previous;


	//Constructor 
	public WordList() {
		firstNode = null; // Initialize empty list
	}
	
	// Method to add a word and it's location to the word list
	public void add(String word, int location){
		temp = firstNode;
		// Search if word is already in the list
		while ( temp != null ) { // Crawl through list
			if ( word.equals( temp.word )) { // If new word equals a word already in the list...
				temp.location.addToEnd(location); // ... add the index location to the end of the words location list
				return;
			}
			else { // Otherwise move to next word in the list
				temp = temp.next;
			}
		}
		// Word was not found in the list so it's a new word
		newNode = new Node(); // Create new node
		newNode.word = word; // Assign new word to newNode
		LocationList ll = new LocationList(); // Create new list of locations for the word
		ll.addToEnd(location); // Add the index location to the location list
		newNode.location = ll; // Assign the location list to the word
		newNode.next = null; // Set new word next pointer to null
		
		// Insert new word into the word list
		if(firstNode == null){ // If word list is empty
			firstNode = newNode; // Assign first word to new word
		}
		else{ // Otherwise add word to list in alphabetical order 
			temp = firstNode;
			previous = null;
			// Compare current words in list to new word
			while(temp != null){
				if (word.compareTo(temp.word) > 0){ // If new word should go after current word in the list  
					previous = temp; // Save temp to previous
					temp = temp.next; // Move to next word in list
				}
				else { // Position found, new word to go before temp
					break;
				}
			}
			if (previous == null){ // New first word in the list
				newNode.next = firstNode; // New word now points to old first word
				firstNode = newNode; // Assign new first word
			}
			else { // Results of while loop to find position
				newNode.next = temp;
				previous.next = newNode;
			}
		}
	}

	// Print the entire list
	public void print(){
		temp = firstNode;
		while(temp != null){ 
			System.out.println("" + temp.word + " " + temp.location);
			temp = temp.next;
		}
	}
}
