class WordList {
	
	Node firstNode, newNode, temp;
	
	//Constructor 
	public WordList() {
		firstNode = null;
	}

	//Add a new string to the beginning of the list
	public void addToStart(String word, int location){
		newNode = new Node(); // Create new node
		newNode.word = word;
		newNode.location = location;
		newNode.next = firstNode;
		firstNode = newNode;
	}	

	//Add a new string to the end of the list
	public void addToEnd(String word, int location){
		newNode = new Node(); // Create new node
		newNode.word = word;
		newNode.location = location;
		newNode.next = null;
		if(firstNode == null){
			firstNode = newNode;
		}
		else{
			temp = firstNode;
			while(temp.next != null) { // Crawl to last node in the list
				temp=temp.next;
			}
			temp.next = newNode;
		}
	}



	// Print the entire list
	public void print(){
		temp = firstNode;
		while(temp != null){
			System.out.println("<" + temp.word + ">" + temp.location);
			temp = temp.next;
		}
	}
}
