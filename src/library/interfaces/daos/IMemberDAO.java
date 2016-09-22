/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.daos;

import java.util.List;

import library.interfaces.entities.IMember;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IMemberDAO {//Start of IMemberDAO interface
		
		/** Static methods for the IMemberDAO interface */
		public IMember addMember(String firstName, String lastName, String ContactPhone, String emailAddress);
		
		public IMember getMemberByID(int id);
		
		public List<IMember> listMembers();
		
		public List<IMember> findMembersByLastName(String lastName);

		public List<IMember> findMembersByEmailAddress(String emailAddress);
		
		public List<IMember> findMembersByNames(String firstName, String lastName);

}//End of IMemberDAO interface
