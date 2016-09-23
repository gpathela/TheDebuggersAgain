/**
*@Author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The TestGetCallNumber class is a program that tests the method that returns the call number of a book.
*/

/** Start of the class TestGetCallNumber */
public class TestGetCallNumber{
	public static void main(String[] args) {
		/** Create a book with a functional parameter */
		Book b0 = new Book("Recep", "Harry Potter", "R123", 111);
		
		/** Create a book with a non-functional parameter */
		Book b1 = new Book("Jino", "Boom", R123, 111);
		
		
		/** Display the results */
		System.out.println("\nTesting the getCallNumber() method for the two created books....");
		System.out.println("The callNumber of the first created book is:");
		System.out.println(b0.getCallNumber());
		System.out.println("The program will not be able to display the callNumber for the second created book, b1.");
		System.out.println("The reason is that an integer has been inserted instead of a string for the call number attrbute.");
		System.out.println("The callNumber of the second created book is going to fail cos of int value:");
		System.out.println(b1.getCallNumber() + "\n");
	} // End of the main method 
} // End of the class TestGetCallNumber