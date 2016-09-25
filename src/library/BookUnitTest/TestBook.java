/**
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*/
/** Start of the class TestBook */
public class TestBook {
	/** Start of the main method */
	public static void main(String[] args) {
		/** Create four Book objects */
		Book b0 = new Book("Chiran", "CCC", "CN0", 111);
		Book b1 = new Book("Gourav", "GGG", "CN1", 222);
		Book b2 = new Book("Raman"," "RRR", "CN2", 333);
		Book b3 = new Book("Jino", "JJJ", "CN3", 444);
		
		/** Testing the getAuthor() method from the class Book */
		System.out.println("\nTesting the getAuthor() method from the book class....");
		String author0 = b0.getAuthor(); 
		String author1 = b1.getAuthor(); 
		String author2 = b2.getAuthor(); 
		String author3 = b3.getAuthor(); 
		
		/** Display the results */
		System.out.println("The authors of the created books are:");
		System.out.println(author0 + ", " + author1 + ", " + author0 + ", " + author0 + ".");
		
		/** Testing the getTitle() method from the class Book */
		System.out.println("\nTesting the getTitle() method from the book class....");
		String title0 = b0.getTitle(); 
		String title1 = b1.getTitle(); 
		String title2 = b2.getTitle(); 
		String title3 = b3.getTitle(); 
		
		/** Display the results */
		System.out.println("The titles of the created books are:");
		System.out.println(title0 + ", " + title1 + ", " + title2 + ", " + title3 + ".");
		
		/** Testing the getCallNumber() method from the class Book */
		System.out.println("\nTesting the getCallNumber() method from the book class....");
		String callNumber0 = b0.getCallNumber(); 
		String callNumber1 = b1.getCallNumber(); 
		String callNumber2 = b2.getCallNumber(); 
		String callNumber3 = b3.getCallNumber(); 
		
		/** Display the results */
		System.out.println("The call numbers of the created books are:");
		System.out.println(callNumber0 + ", " + callNumber1 + ", " + callNumber2 + ", " + callNumber3 + ".");
		
		/** Testing the getID() method from the class Book */
		System.out.println("\nTesting the getID() method from the book class....");
		int id0 = b0.getID(); 
		int id1 = b1.getID(); 
		int id2 = b2.getID(); 
		int id3 = b3.getID(); 
		
		/** Display the results */
		System.out.println("The id of the created books are:");
		System.out.println(id0 + ", " + id1 + ", " + id2 + ", " + id3 + ".");
		
		/** Testing the toString() method from the class Book */
		System.out.println("\nTesting the toString() method from the book class....");
		/** Display the results */
		System.out.println("The full details of the created books are:");
		System.out.println(b0.toString() + "\n"); 
		System.out.println(b1.toString() + "\n");
		System.out.println(b2.toString() + "\n");
		System.out.println(b3.toString() + "\n");
	} // End of the main method 
} // End of the class TestBook