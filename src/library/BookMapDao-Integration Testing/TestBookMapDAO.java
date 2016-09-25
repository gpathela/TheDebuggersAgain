import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
*@reviewer Ramanpreet Kaur
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*/

/** Start of the class TestBookMapDAO */
public class TestBookMapDAO{
	/** Start of the main method */
	public static void main(String[] args) {
				
		IBookDAO bookMapDAO = new BookMapDAO(new BookHelper());
		IBook[] iBook = new IBook[4];
		System.out.println("");
		
		IBook b1 = bookMapDAO.addBook("Nelson", "Murder In Paris", "R111");
		System.out.println(b1);
		System.out.println("");
		IBook b2 = bookMapDAO.addBook("David", "Duck on a Bike", "R222");
		System.out.println(b2);
		System.out.println("");
		IBook b3 = bookMapDAO.addBook("Potter", "The Tale of Peter Rabbit", "R333");
		System.out.println(b3);
		System.out.println("");
		IBook b4 = bookMapDAO.addBook("Kipling", "The Jungle Book", "R444");
		System.out.println(b4);
		System.out.println("");
		System.out.println("***************************************************");
		System.out.println("");
		//Testing addBook Method
		bookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("");
		System.out.println("Testing the addBook() method to add the books.");
		System.out.println("");
		System.out.println("Books are Added!");
		System.out.println("");
		System.out.println("****************************************************");
		//Testing the listBooks method
		System.out.println("Testing the listBooks() method.");
		System.out.println("****************************************************");
		System.out.println("");
		System.out.println(bookMapDAO.listBooks());
		System.out.println("****************************************************");
		
	} // End of the main method 
} // End of the class TestBookMapDAO