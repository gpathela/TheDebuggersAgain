/**
*@Author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The TestGetID class is a program that tests the method that returns the ID of a book.
*/

/** Start of the class TestGetID */
public class TestGetID{
	public static void main(String[] args) {
		/** Create a book with a functional parameter */
		Book b0 = new Book("Recep", "Harry Potter", "R123", 111);
		
		/** Create a book with a non-functional parameter */
		Book b1 = new Book("Jino", "Boom", "R123", "111");
		
		/** Display the results */
		System.out.println("\nTesting the getID() method for the two created books....");
		System.out.println("The id of the first created book is:");
		System.out.println(b0.getID());
		System.out.println("\nThe program will not be able to display the ID for the second created book, b1.");
		System.out.println("The reason is that a String has been inserted instead of an integer number for the ID attribute.");
		System.out.println("Calling the ID of the second created book is going to fail cos of the String value:");
		System.out.println(b1.getID() + "\n");
	} // End of the main method
} // End of the class TestGetID