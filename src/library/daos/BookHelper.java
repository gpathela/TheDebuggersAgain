/** Import some Java libraries and specify the package in which the classes are organized */
package library.daos;
import library.entities.Book;

/** Import some libraries */
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

/**
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.0
*/

/** The BookHelper class implements the interface IBookHelper. It displays the details about a 
*book that it creates.
*/
/** start of class BookHelper */

public class BookHelper implements IBookHelper {

	@Override
	
	/** The method makeBook creates a book and returns the details of the created book object */
	public IBook makeBook(String author, String title, String callNumber, int id) {
		return new Book(author, title, callNumber, id);		
	}

} // End of class BookHelper
