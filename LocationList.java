class LocationList {
	
	LocationNode firstNode, newNode, lastNode, temp;
	
	// Contsructor
	public LocationList() {
		firstNode = lastNode = null; // Initialize new empty list
	}

	// Add new location to the end of the location list
	public void addToEnd(int location){
		newNode = new LocationNode(); // Create new location
		newNode.location = location;
		newNode.next = null;

		// If the list is empty
		if ( firstNode == null ) {
			firstNode = lastNode = newNode;
			return;
		}
		// The list is not empty
		lastNode.next = newNode; // Place newNode at end of list
		lastNode = newNode; // Update last node to new node
	}

	// Overide toString to print the entire location list
	public String toString() {
		String result = "";
		temp = firstNode;
		while (temp != null) { // Crawl through the list
			if (temp.next != null) { // If not the last location in the list
				result = result + Integer.toString(temp.location) + ",";
			}
			else { // This is the last location, no comma needed
				result = result + Integer.toString(temp.location);
			} 

			temp = temp.next; // Move to next location in the list
		}
		return result;
	}
}
