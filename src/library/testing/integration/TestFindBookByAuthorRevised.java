package library.testing.integration;

import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.interfaces.daos.IBookDAO;
/**
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
		
*/

public class TestFindBookByAuthorRevised {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		
		
		//Testing addBook Method
		testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		
		
		//Testing find Books by Author Method Revised
		System.out.println("Testing findBook By Author Method Revised. We will give non existent information");
		System.out.println("Given 'Author' as search string");
		System.out.println("Output should be blank Array");
		System.out.println("Output: "+testBookMapDAO.findBooksByAuthor("Author"));

	}

}
