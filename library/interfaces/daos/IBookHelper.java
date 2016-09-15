/** Specifying the package in which the class resides */
package library.interfaces.daos;

/** Import necessary libraries for the code */
import library.interfaces.entities.IBook;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface IBookHelper */
public interface IBookHelper {
	public IBook makeBook(String author, String title, String callNumber, int id);
}