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
		System.out.println("");
		System.out.println("***************************************************");
		System.out.println("");
		IBook b1 = bookMapDAO.getBookByID("R333");
		//System.out.println(bookMapDAO.listBooks());
		//System.out.println("Result: " +bookMapDAO.findBooksByAuthor("Potter"));
		//System.out.println(bookMapDAO.findBooksByTitle(b1.getTitle()));
		//System.out.println(b1.getBookByID());
		//System.out.println(bookMapDAO.getBookByID(3));
		//System.out.println(bookMapDAO.getBookByID(3));
		//System.out.println("");
		//System.out.println("***************************************************");
		//System.out.println("");

	}

}