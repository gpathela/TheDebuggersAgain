/** Specify the package in which the class resides */
package library.interfaces.daos;

/** Import some libraries to be used in the code */
import library.interfaces.entities.IBook;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The interface IBookHelper contains one static method that creates a book of type IBook.
*/

public interface IBookHelper {
	public IBook makeBook(String author, String title, String callNumber, int id);
}
