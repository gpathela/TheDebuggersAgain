/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.daos;

import java.util.List;

import library.interfaces.entities.IBook;

/**
* @reviewer Chiranjivi Bashyal
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/


public interface IBookDAO {	//Start of IBookDAO interface
	/** Static methods for the IBookDAO interface */
	public IBook addBook(String author, String title, String callNo);
	
	public IBook getBookByID(int id);
	
	public List<IBook> listBooks();
	
	public List<IBook> findBooksByAuthor(String author);

	public List<IBook> findBooksByTitle(String title);
	
	public List<IBook> findBooksByAuthorTitle(String author, String title);

}	//End of IBookDAO interface