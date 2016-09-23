/**
*@Author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The TestGetTitle class is a program that tests the method that returns the title of a book.
*/

/** Start of the class TestGetTitle */
public class TestGetTitle {
	public static void main(String[] args) {
		/** Create a book with a functional parameter */
		Book b0 = new Book("Recep", "Harry Potter", "R123", 111);
		
		/** Create a book with a non-functional parameter */
		Book b1 = new Book("Jino", 111, "R123", 111);
		
		/** Display the results */
		System.out.println("\nTesting the getTitle() method for the two created books....");
		System.out.println("The title of the first created book is:");
		System.out.println(b0.getTitle());
		System.out.println("\nThe program will not be able to display the title for the second created book, b1.");
		System.out.println("The reason is that an integer number has been inserted instead of a String value for the title attribute.");
		System.out.println("Calling the title of the second created book is going to fail cos of the integer value:");
		System.out.println(b1.getTitle() + "\n");
	} // End of the main method 
} // End of the class TestGetTitle