package library.daos;

import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

/* start of class BookHelper */

public class BookHelper implements IBookHelper {

	@Override
	public IBook makeBook(String author, String title, String callNumber, int id) {
		return new Book(author, title, callNumber, id);		
	}

} //End of class BookHelper
