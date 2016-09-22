/** Import some Java libraries and specify the package in which the classes are organized */
package library.entities;

import java.util.Calendar;
import java.util.Date;

import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

/**
* @reviewer Chiranjivi Bashyal
* @Student ID: 11582726
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

		Book testBook = new Book("testAuthor", "testTitle", "testCallNumber", 27); // Creating
																					// a
																					// test
																					// Book

		System.out.println("Made a test book");

		Member testMember = new Member("testFirstName", "testLastName", "0424XXX", "chiran@test.com", 27); // Creating
																											// a
																											// test
																											// member

		System.out.println("Made a test Member");

	}
}