/**
*@author Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*/
public class TestGetAuthor {
	public static void main(String[] args) {
		Book b0 = new Book("Bikash", "Nepali", "A123", 222);
		Book b1 = new Book(1234, "Nepali", "A123", 222);
		System.out.println("\nTesting the getAuthor() method from the book class....");
		
		/** Display the results */
		System.out.println("The author of the created book is:");
		System.out.println(b0.getAuthor());
		System.out.println("The author of the created book is going to fail cos of int value:");
		System.out.println(b1.getAuthor());
	}
}