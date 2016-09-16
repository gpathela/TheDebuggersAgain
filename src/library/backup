/** Import some Java libraries and specify the package in which the classes are organized */
package library.entities;

import java.util.Calendar;
import java.util.Date;

import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

/**
*@author Gourav Pathela
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.0
*
*		The TestLoan class is a program that tests all methods of the Loan class.
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

		Book testBook = new Book("testAuthor", "testTitle", "testCallNumber", 27); // Creating
																					// a
																					// test
																					// Book
		Member testMember = new Member("testFirstName", "testLastName", "0424XXX", "test@test.com", 27); // Creating
																											// a
																											// test
																											// Member

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

		IMember borrower = testLoanConstructor.getBorrower(); // Calling
																// getBorrower
																// method to
																// check the
																// output and
																// input.
																// Expected
																// output should
																// be
																// 'testFirstName'
																// and
																// 'testLastName'
		System.out.println("Borrower Name: " + borrower.getFirstName() + " " + borrower.getLastName());

		IBook book = testLoanConstructor.getBook(); // Calling getBook method to
													// check the output and
													// input. Expected output
													// should be 'testTitle' and
													// 'testAuthor'
		System.out.println("Book Name: " + book.getTitle() + " Author: " + book.getAuthor());

		ELoanState state = testLoanConstructor.getState();	//Calling getState method. Output should be 'PENDING'
		System.out.println("Loan State: " + state.toString());

		System.out.println("Is book overdue: " + testLoanConstructor.isOverDue());// Testing isOverdue method . Output should be 'false'
																					
	}

}
