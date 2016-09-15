/** Specifying the package in which the class resides */
package library.interfaces.daos;

/** Import necessary libraries for the code */
import java.util.List;
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface IMemberDAO */
public interface IMemberDAO {
	/** Static methods for the interface */
	public IMember addMember(String firstName, String lastName, String ContactPhone, String emailAddress);		
	public IMember getMemberByID(int id);	
	public List<IMember> listMembers();
	public List<IMember> findMembersByLastName(String lastName);
	public List<IMember> findMembersByEmailAddress(String emailAddress);		
	public List<IMember> findMembersByNames(String firstName, String lastName);
}
