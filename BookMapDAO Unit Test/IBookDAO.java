/** Specify the package in which the class resides */
//package library.interfaces.daos;

/** Import some libraries to be used in the code */
import java.util.List;
//import library.interfaces.entities.IBook;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The interface IBook database objects  contains several static method.
*/

public interface IBookDAO {
	/** Static methods for the IBookDAO interface */
	public IBook addBook(String author, String title, String callNo);
	public IBook getBookByID(int id);
	public List<IBook> listBooks();
	public List<IBook> findBooksByAuthor(String author);
	public List<IBook> findBooksByTitle(String title);	
	public List<IBook> findBooksByAuthorTitle(String author, String title);
}