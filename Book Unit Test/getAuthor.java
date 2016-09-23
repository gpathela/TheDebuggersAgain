public class TestGetAuthor() {
	public static void main(String[] args) {
		Book b0 = new Book("Recep", "Harry Poter", "R123", 111);
		
		System.out.println("\nTesting the getAuthor() method from the book class....");
		String author0 = b0.getAuthor(); 
		
		/** Display the results */
		System.out.println("The authors of the created books are:");
		System.out.println(author0);
	
	}
}