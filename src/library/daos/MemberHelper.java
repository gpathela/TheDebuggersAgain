/** Specify the package in which the class resides */
package library.daos;

/** Import some libraries to be used in the code */
import library.entities.Member;
import library.interfaces.daos.IMemberHelper;
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The class MemberHelper implements the IMemberHelper, creates and returns the Member object created.
*/

/** Start of the class MemberHelper */
public class MemberHelper implements IMemberHelper {

	/** Override the makeMember method */
	@Override
	/** The method makeMember creates and returns a Member object */
	public IMember makeMember(String firstName, String lastName, String contactPhone, String emailAddress, int id) {
		return new Member(firstName, lastName, contactPhone, emailAddress, id);
	}
} // End of the class MemberHelper