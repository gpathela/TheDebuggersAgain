/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.daos;

import library.interfaces.entities.IBook;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IBookHelper {//Start of IBookHelper interface
	/** Static method for IBookHelper interface */
	public IBook makeBook(String author, String title, String callNumber, int id);

}	//End of IBookHelper interface
