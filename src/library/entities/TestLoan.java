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
* @version 1.1
*
* The TestLoan class is a program that tests all methods of the Loan class.
*
*/

/** Start of the class TestLoan */

public class TestLoan { // A class to test loan class

	public static void main(String[] args) {

		/*
		 * Getting issue date i.e. current date and due date i.e. 14 days after
		 * issue date
		 */
		Calendar cal = Calendar.getInstance();
		Date issueDate = cal.getTime();
		cal.add(Calendar.DATE, 14);
		Date dueDate = cal.getTime();

																					// a
																					// test
																					// Book

		Book testBook = new Book("testAuthor", "testTitle", "testCallNumber", 27); // Creating
																					// a
																					// test
																					// Book

		System.out.println("Made a test book");
		
		Member testMember = new Member("testFirstName", "testLastName", "0424XXX", "test@test.com", 27); // Creating
																											// a
																											// test
																											// member

		System.out.println("Made a test Member");
		
		Loan testLoan = new Loan(testBook, testMember, issueDate, dueDate);
		
		System.out.println("Made a test Loan using testMember & testBook"); //Book issued. 
		System.out.println("Verifying Loan Member. Result should be testFirstName");
		System.out.println("Output is : " + testLoan.getBorrower().getFirstName());
		if (testLoan.getBorrower().getFirstName().equals("testFirstName")){
			System.out.println("Result: Succesfull");
		}else  {
			System.out.println("Result: Fail");
		}
		/*Testing Book in Loan Class */
		
		System.out.println("I am checking Book Id of the Book I created. It should be 27");
		System.out.println("Book ID is: " + testBook.getID());
	}
}
