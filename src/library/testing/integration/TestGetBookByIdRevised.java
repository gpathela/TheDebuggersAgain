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
public class TestGetBookByIdRevised {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		
		
		//Testing addBook Method
		testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		
		
		//Testing find Books by ID Method Revised
		System.out.println("Testing GetBook By Id Method Revised. In it we will provide non existent data");
		System.out.println("Given '10' as search string");
		System.out.println("Output should be null");
		System.out.println("Output: "+testBookMapDAO.getBookByID(10));

	}

}
