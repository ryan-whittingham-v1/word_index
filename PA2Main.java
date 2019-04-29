class PA2Main {

	public static void main(String[] args) {
		
		IndexUtility myIU=new IndexUtility(); // Create new index utility to handle input
		WordList myList=myIU.buildIndex(); // Create a new word list 
		myList.print(); // Display the word list
	}
}
