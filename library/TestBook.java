/** Import some Java libraries and specify the package in which the classes are organized */
package library.entities;

import java.util.Calendar;
import java.util.Date;

import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.0
*
* The TestBook class is a program that tests all methods of the Book class.
*/

/** Start of the class TestLoan */

public class TestBook { 

	public static void main(String[] args) {

		/*
		 * Getting issue date i.e. current date and due date i.e. 14 days after
		 * issue date
		 */
		Calendar cal = Calendar.getInstance();
		Date issueDate = cal.getTime();
		cal.add(Calendar.DATE, 14);
		Date dueDate = cal.getTime();
		
		// run the constructor to create a test book object
			Book testBook = new Book("testAuthor","testTitle","testCallNumber",27); //creating test book
			
			if(testBook.sane())
			{
			System.out.println("The Created book is: \n " + testBook); //to check the book created
			}
			else
			{
				System.out.println("Book not created properly");
			}
			
			System.out.println("Author is: " + testBook.getAuthor()); //to print author
			System.out.println("Title is: " + testBook.getTitle()); //to print title
			System.out.println("Call Number is: " + testBook.getCallNumber()); //to print call number
			System.out.println("Unique Id is: " + testBook.getId()); //to print book id
			
			Member testMember = new Member("testFirstName","testLastName","04524000","test@test.com",27); //creating test member
			
			
			Loan testLoanConstructor = new Loan(testBook, testMember, issueDate, dueDate); // Calling
																						// Loan
																						// constructor
																						// with
																						// test
																						// book
																						// and
																						// members
																						// created
		System.out.println("Succeesfully loaned. Loan id: " + testLoanConstructor.getID());
		
		System.out.println("Currently the book is :" + testBook.getState()); //to check the state of book
		
		System.out.println("Currently the book is: " + testBook.lose()); //to set the book as lost
		
		System.out.println("Currently the book is: " + testBook.returnBook(1)); //to set the book as damaged
		
		System.out.println("Currently the book is: " + testBook.repair()); //to set the book as repaired
		
		System.out.println("Currently the book is: " + testBook.dispose()); //to set the book as disposed
			
	}

}
