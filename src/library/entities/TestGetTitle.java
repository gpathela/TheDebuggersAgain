public class TestGetTitle{
	public static void main(String[] args) {
		Book b0 = new Book("Bikash", "Nepali", "A123", 222);
		Book b1 = new Book("Bikash", Nepali, "A123", 222);
		System.out.println("\nTesting the getTitle() method from the book class....");
		
		/** Display the results */
		System.out.println("The title of the created book is:");
		System.out.println(b0.getTitle());
		System.out.println("The title of the created book is going to fail cos of int value:");
		System.out.println(b1.getTitle());
	}
}