package library.testing.integration;

import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.interfaces.daos.IBookDAO;

/**
*@author Gourav Pathela
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
		
*/
public class TestFindBookByTitleRevised {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		
		
		//Testing addBook Method
		testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		
		
		//Testing find Books Title Method Revised
		System.out.println("Testing findBook By Title Method Revised. We will give non existent information");
		System.out.println("Given 'Title' as search string");
		System.out.println("Output should be blank Array");
		System.out.println("Output: "+testBookMapDAO.findBooksByTitle("Title"));

	}

}
