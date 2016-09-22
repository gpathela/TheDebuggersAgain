/** Specify the package in which this code resides */
package library.daos;

/** Import some libraries to be used in the code */
import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.0
*
* The BookHelper class implements the IBookHelper interface. 
* This class shows the details of the book.
*
*/

/** Start of the class BookHelper */
public class BookHelper implements IBookHelper {

	@Override
	/** The makeBook method creates the book and return its details*/
	public IBook makeBook(String author, String title, String callNumber, int id) {
		return new Book(author, title, callNumber, id);		
	}

}// End of the class BookHelper
