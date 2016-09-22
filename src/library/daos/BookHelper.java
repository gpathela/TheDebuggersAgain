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
* The BookHelper class implements the interface IBookHelper. It displays the details about a 
* book that it creates.
*
*/

public class BookHelper implements IBookHelper {

	@Override
	public IBook makeBook(String author, String title, String callNumber, int id) {
		return new Book(author, title, callNumber, id);		
	}

}
