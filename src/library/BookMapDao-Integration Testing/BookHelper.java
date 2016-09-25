/** Specify the package in which this code resides */
//package library.daos;

/** Import some libraries to be used in the code */
//import library.interfaces.entities.IBook;

/**
*@reviewer Ramanpreet Kaur
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy 
*@due date 29.09.2016
*@version 1.1
*
*The BookHelper class implements the interface IBookHelper. It displays the details about a 
*book that it creates.
*/

/** Start of the class BookHelper */
public class BookHelper implements IBookHelper {

	/** Override the borrow method */
	@Override
	/** The method makeBook creates a book and returns the details of the created book object */
	public IBook makeBook(String author, String title, String callNumber, int id) {
		return new Book(author, title, callNumber, id);		
	}
} // End of the class BookHelper
