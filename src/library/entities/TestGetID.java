public class TestGetID{
	public static void main(String[] args) {
		Book b0 = new Book("Recep", "Harry Poter", "R123", 111);
		Book b1 = new Book("Recep", "Harry Porter", "R123", abc);
		System.out.println("\nTesting the getID() method from the book class....");
		
		/** Display the results */
		System.out.println("The ID of the created book is:");
		System.out.println(b0.getID());
		System.out.println("The ID of the created book is going to fail because the ID is a string: ");
		System.out.println(b1.getID());
	}
}