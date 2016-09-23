/** Import some Java libraries and specify the package in which the classes are organized */
package library.testing.unit;


import library.entities.Member;

/**
*@author Gourav Pathela
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
*		The TestCreateTestMember class is a program that create a Test Member
*/

/** Start of the class TestCreateTestMember */

public class TestCreateTestMember { 

	public static void main(String[] args) {

		
		Member testMember = new Member("testFirstName", "testLastName", "0424XXX", "test@test.com", 27); // Creating
																											// a
																											// test
																											// member

		System.out.println("Made a test Member");

	}
}