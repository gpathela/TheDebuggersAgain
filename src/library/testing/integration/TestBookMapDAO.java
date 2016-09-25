/** Import some Java libraries and specify the package in which the classes are organized */
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


public class TestBookMapDAO {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		
		
		//Testing addBook Method
		testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		
		
		
		

	}

}
