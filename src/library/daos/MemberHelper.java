/** Specify the package in which the class resides */
package library.daos;


/** Import some libraries to be used in the code */
import library.entities.Member;
import library.interfaces.daos.IMemberHelper;
import library.interfaces.entities.IMember;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.0
*
* The class MemberHelper implements the IMemberHelper,
* creates and returns the Member object created.
*
*/

/** Start of the class MemberHelper */ 	
public class MemberHelper implements IMemberHelper {
	
	/** Override the makeMember method */
	@Override
	/** The makeMember method creates and returns a Member object */
	public IMember makeMember(String firstName, String lastName,
			String contactPhone, String emailAddress, int id) {
		
		return new Member(firstName, lastName, contactPhone, emailAddress, id);
	}

}// End of the class MemberHelper
