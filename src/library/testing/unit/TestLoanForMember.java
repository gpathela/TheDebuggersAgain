/** Import some Java libraries and specify the package in which the classes are organized */
package library.testing.unit;

import java.util.Calendar;
import java.util.Date;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;

/**
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
*		
*/

/** Start of the class TestLoanForMember */

public class TestLoanForMember {

	public static void main(String[] args) {

		// Creating calendar objects to get current date & due date
		Calendar cal = Calendar.getInstance();
		Date issueDate = cal.getTime();
		cal.add(Calendar.DATE, 14);
		Date dueDate = cal.getTime();

		// Creating a Test Book
		Book testBook = new Book("testAuthor", "testTitle", "testCallNumber", 27);

		System.out.println("Made a test book");

		// Creating a Test Member
		Member testMember = new Member("testFirstName", "testLastName", "0424XXX", "test@test.com", 27);

		System.out.println("Made a test Member");

		Loan testLoan = new Loan(testBook, testMember, issueDate, dueDate);

		System.out.println("Made a test Loan using testMember & testBook"); // Book
																			// issued

		// Testing Loans for test Member

		System.out.println("Test to check Loans. As there is no loan yet. Output shoule be '[]'");
		System.out.println("Output is: " + testMember.getLoans());
	}
}