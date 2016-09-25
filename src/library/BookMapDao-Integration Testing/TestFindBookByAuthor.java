//package library.testing.integration;

//import library.daos.BookHelper;
//import library.daos.BookMapDAO;
//import library.interfaces.daos.IBookDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
*@reviewer Ramanpreet Kaur
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*/

public class TestFindBookByAuthor {

	public static void main(String[] args) {
		
		IBookDAO bookMapDAO = new BookMapDAO(new BookHelper());	

		bookMapDAO.addBook("Nelson", "Murder In Paris", "R111");
		bookMapDAO.addBook("David", "Duck on a Bike", "R222");
		bookMapDAO.addBook("Potter", "The Tale of Peter Rabbit", "R333");
		bookMapDAO.addBook("Kipling", "The Jungle Book", "R444");
		System.out.println("Books are Added!");
		System.out.println("");
		
		
		//Testing findBooksByAuthor() Method
		System.out.println("Testing findBooksByAuthor() Method.");
		System.out.println("***************************************************");
		System.out.println("");
		
		System.out.println("Output: "+bookMapDAO.findBooksByAuthor("Nelson"));
	}

}