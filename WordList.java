class WordList {
	
	Node firstNode, lastNode, newNode, temp, previous;

	//Constructor 
	public WordList() {
		firstNode = null; // Initialize empty list
	}
	
	//Add a new string to the end of the list
	public void addToEnd(String word, int location){
		temp = firstNode;
		// First search if word is already in the list
		while ( temp != null ) { // Crawl through list
			if ( word.equals( temp.word )) { // If new word equals a word in the list
				temp.location.addToEnd(location); // Add the index location to the end of the words location list
				return;
			}
			else {
				temp = temp.next; // Move to next word in the list
			}
		}
		
		// Word was not found in the list so it's a new word
		newNode = new Node(); // Create new node
		newNode.word = word; // Assign new word to newNode
		LocationList ll = new LocationList(); // Create new list of locations for the word
		ll.addToEnd(location); // Add the index location to the location list
		newNode.location = ll; // Assign the location list to the word
		newNode.next = null; // Set new node to point to null
		
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
		
		/*
			// Add to end of list
			lastNode.next = newNode; // Assign the last word in the list to point to new word
			lastNode = newNode; // Update last word pointer to new word
		*/
		}
	}

	// Print the entire list
	public void print(){
		temp = firstNode;
		while(temp != null){ 
			System.out.println("<" + temp.word + "> " + temp.location);
			temp = temp.next;
		}
	}
}
