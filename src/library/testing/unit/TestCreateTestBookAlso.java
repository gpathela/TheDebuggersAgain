/** Import some Java libraries and specify the package in which the classes are organized */
package library.testing.unit;

import library.entities.Book;
import library.entities.Member;

/**
*@author Gourav Pathela
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
*		The TestLoan class is a program that create testBook and Test Member.
*/

/** Start of the class TestCreateTestBookAlso */

public class TestCreateTestBookAlso { // A class to Create TesBook and Test Member

	public static void main(String[] args) {

		//Creating a Test Book
		Book testBook = new Book("testAuthor", "testTitle", "testCallNumber", 27); // Creating a test Book
		
		System.out.println("Made a test book");

		//Creating a Test Member
		Member testMember = new Member("testFirstName", "testLastName", "0424XXX", "test@test.com", 27); // Creating
																											// a
																											// test
																											// member

		System.out.println("Made a test Member");

	}
}