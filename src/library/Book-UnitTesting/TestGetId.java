/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

/** Start of TestGetId class */
public class TestGetId {
	public static void main(String[] args) {	//Start of main method
		Book b0 = new Book("Nelson", "Murder In Paris", "R123", 111);
		Book b1 = new Book("Nelson", "Murder In Paris", "R123", -111);
		System.out.println("\nTesting the getID() method from the book class");
		System.out.println("******************************************************");
		System.out.println("");
		
		/** Display the results */
		System.out.println("The ID of the created book is:");
		System.out.println(b0.getID());
		System.out.println("The ID of the created book is going to fail cos of negative value:");
		System.out.println(b1.getID());
	}	//End of main method
}	//End of TestGetId class