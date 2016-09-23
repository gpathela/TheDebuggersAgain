public class TestGetAuthor {
	public static void main(String[] args) {
		Book b0 = new Book("Recep", "Harry Potter", "R123", 111);
		Book b1 = new Book(1234, "Boom", "B000", 222);
		System.out.println("\nTesting the getAuthor() method from the book class....");
		
		/** Display the results */
		System.out.println("The author of the created book is:");
		System.out.println(b0.getAuthor());
		System.out.println("The author of the created book is going to fail cos of int value instead of a string");
		System.out.println(b1.getAuthor());
	}
}