/** Specify the package in which the class resides */
package library.interfaces.daos;

/** Import some libraries to be used in the code */
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The interface IMemberHelper contains a static method that helps create a member.
*/

public interface IMemberHelper {
	/** Static method for the IMemberHelper interface */	
	public IMember makeMember(String firstName, String lastName, String contactPhone, String emailAddress, int id);
}