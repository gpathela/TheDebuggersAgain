/**
*@Author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The TestGetAuthor class is a program that tests the method that returns the author of a book.
*/

/** Start of the class TestGetAuthor */
public class TestGetAuthor {
	public static void main(String[] args) {
		/** Create a book with a functional parameter */
		Book b0 = new Book("Recep", "Harry Potter", "R123", 111);
		
		/** Create a book with a non-functional parameter */
		Book b1 = new Book(1234, "Boom", "B000", 222);
		
		/** Display the results */
		System.out.println("\nTesting the getAuthor() method from the book class....");
		System.out.println("The author of book b0 is:");
		System.out.println(b0.getAuthor());
		System.out.println("The program will not be able to display the author for book b1.");
		System.out.println("The reason is that an integer has been inserted instead of a string for the author name.");
		System.out.println(b1.getAuthor());
	} // End of the main method 
} // End of the TestGetAuthor class 