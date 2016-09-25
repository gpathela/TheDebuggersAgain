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

public class TestGetBookById {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		
		
		//Testing addBook Method
		testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		
		
		//Testing find Books by Id Method
		System.out.println("Testing GetBook By Id Method.");
		System.out.println("Given '1' as search string");
		System.out.println("Output should be the array with details like 'testAuthor', 'testTitle'");
		System.out.println("Output: "+testBookMapDAO.getBookByID(1));

	}

}
