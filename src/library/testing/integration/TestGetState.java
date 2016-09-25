package library.testing.integration;

import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.interfaces.daos.IBookDAO;
import library.interfaces.entities.IBook;

/**
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
		
*/
public class TestGetState {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		
		
		//Testing addBook Method
		IBook testBook = testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		//Test to find state of the Book (Available or not)
		System.out.println("Test to find state of the book");
		System.out.println("Result should be 'AVAILABLE' as it is not loaned to anyone yet");
		System.out.println(testBook.getState());
		
		
		

	}

}
