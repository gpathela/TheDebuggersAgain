/** Import some libraries to be used in the code */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@Author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The TestBookMapDAO is a program that tests some methods that are written in the BookMapDAO class.
*/

/** Start of the class TestBookMapDAO */
public class TestBookMapDAO{
	/** Start of the main method */
	public static void main(String[] args) {
				
		IBookDAO bookMapDAO = new BookMapDAO(new BookHelper());
		
		/** Testing the method addBook */
		System.out.println("Adding books to the map");
		IBook b1 = bookMapDAO.addBook("Raman", "RRR", "CN0");
		System.out.println(b1);
		IBook b2 = bookMapDAO.addBook("Gourav", "GGG", "CN1");
		System.out.println(b2);
		IBook b3 = bookMapDAO.addBook("Chiran", "CCC", "CN2");
		System.out.println(b3);
		IBook b4 = bookMapDAO.addBook("Jino", "JJJ", "CN3");
		System.out.println(b4);
		System.out.println("");
		
		System.out.println(bookMapDAO.listBooks());
		System.out.println("");
		//System.out.println(bookMapDAO.listBooks());
		//System.out.println(bookMapDAO.findBooksByAuthor(""));
		//System.out.println(bookMapDAO.findBooksByTitle(b1.getTitle()));
		//System.out.println(b1.getBookByID());
		//System.out.println(bookMapDAO.getBookByID(3));
		//System.out.println(bookMapDAO.getBookByID(3));
		
	} // End of the main method 
} // End of the class TestBookMapDAO