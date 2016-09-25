/**
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Start of the class TestBookMapDAO */
public class TestBookMapDAO{
	/** Start of the main method */
	public static void main(String[] args) {
				
		IBookDAO bookMapDAO = new BookMapDAO(new BookHelper());
		//IBook[] iBook = new IBook[4];
		
		IBook b1 = bookMapDAO.addBook("Raman", "RRR", "CN0");
		System.out.println(b1);
		IBook b2 = bookMapDAO.addBook("Gourav", "GGG", "CN1");
		System.out.println(b2);
		IBook b3 = bookMapDAO.addBook("Chiran", "CCC", "CN2");
		System.out.println(b3);
		IBook b4 = bookMapDAO.addBook("Jino", "JJJ", "CN3");
		System.out.println(b4);
		System.out.println(" ");
		System.out.println(bookMapDAO.listBooks());
                
	} // End of the main method 
} // End of the class TestBookMapDAO