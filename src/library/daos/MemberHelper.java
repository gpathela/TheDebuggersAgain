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
*/

public class MemberHelper implements IMemberHelper {

	@Override
	public IMember makeMember(String firstName, String lastName,
			String contactPhone, String emailAddress, int id) {
		
		return new Member(firstName, lastName, contactPhone, emailAddress, id);
	}

}
