/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.daos;

import library.interfaces.entities.IMember;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IMemberHelper {	//Start of IMemberHelper interface
	/** Static methods for the IMemberHelper interface */
	public IMember makeMember(String firstName, String lastName, String contactPhone, String emailAddress, int id);

}//End of IMemberHelper interface
