/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

/** Start of class TestGetTitle */
public class TestGetTitle {
	public static void main(String[] args) {	//Start of main method
		Book b0 = new Book("Nelson", "Murder In Paris", "R123", 111);
		Book b1 = new Book("Nelson", 1234, "R123", 111);
		System.out.println("\nTesting the getTitle() method from the book class");
		System.out.println("******************************************************");
		System.out.println("");
		
		/** Display the results */
		System.out.println("The title of the created book is: " + b0.getTitle());
		
		System.out.println("The title of the created book is going to fail cos of int value: "+ b1.getTitle());
		
	}	//End of main method
}	//End of TestGetTitle