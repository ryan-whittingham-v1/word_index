class PA2Main {

	public static void main(String[] args) {
		
		IndexUtility myIU=new IndexUtility(); // construct the IU
		WordList myList=myIU.buildIndex(); // index stdin, build a WordList, save as myList
		myList.print(); // show the index
	}
}
