/** Specify the package in which the class resides */
package library.daos;

/** Import some libraries to be used in the code */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.interfaces.daos.IMemberDAO;
import library.interfaces.entities.IMember;
import library.interfaces.daos.IMemberHelper;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy 
*@due date 29.09.2016
*@version 1.2
*
*The class MemberMapDAO creates member map objects and contains methods to manipulate the map.
*/

/** Start of the class MemberMapDAO */
public class MemberMapDAO implements IMemberDAO {
	/** Declare variables with private access modifiers */
	private IMemberHelper helper;
	private Map<Integer, IMember> memberMap;
	private int nextID;
	
	/** The constructor for a MemberMapDAO object which takes a parameter of one variable */
	public MemberMapDAO(IMemberHelper helper) {
		if (helper == null ) {
			throw new IllegalArgumentException(
				String.format("MemberMapDAO : constructor : helper cannot be null."));
		}
		this.helper = helper;
		this.memberMap = new HashMap<Integer, IMember>();
		this.nextID = 1;
	}

	/** The constructor for a MemberMapDAO object which takes a parameter of multiple variables */
	public MemberMapDAO(IMemberHelper helper, Map<Integer,IMember> memberMap) {
		this(helper);
		if (memberMap == null ) {
			throw new IllegalArgumentException(
				String.format("MemberMapDAO : constructor : memberMap cannot be null."));
		}
		this.memberMap = memberMap;
	}
	
	/** Override the  method */
	@Override
	/** The method addMember adds and returns the added member to a map */
	public IMember addMember(String firstName, String lastName,
			String contactPhone, String emailAddress) {
		int id = getNextId();
		IMember mem = helper.makeMember(firstName, lastName, contactPhone, emailAddress, id);
		memberMap.put(Integer.valueOf(id), mem);
		return mem;
	}

	/** Override the getMemberByID method */
	@Override
	/** The method getMemberByID returns a member's ID if it is not null */
	public IMember getMemberByID(int id) {
		if (memberMap.keySet().contains(Integer.valueOf(id))) {
			return memberMap.get(Integer.valueOf(id));
		}
		return null;
	}

	/** Override the listMembers method */
	@Override
	/** The method returns an unmodifiable list of members */
	public List<IMember> listMembers() {
		List<IMember> list = new ArrayList<IMember>(memberMap.values());
		return Collections.unmodifiableList(list);
	}

	/** Override the findMembersByLastName method */
	@Override
	/** The method returns an unmodifiable list by member's last name */
	public List<IMember> findMembersByLastName(String lastName) {
		if ( lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("MemberMapDAO : findMembersByLastName : lastName cannot be null or blank"));
		}
		List<IMember> list = new ArrayList<IMember>();
		for (IMember m : memberMap.values()) {
			if (lastName.equals(m.getLastName())) {
				list.add(m);
			}
		}
		return Collections.unmodifiableList(list);
	}

	/** Override the findMembersByEmailAddress method */
	@Override
	/** The method findMembersByEmailAddress returns an unmodifiable list by member's email address */
	public List<IMember> findMembersByEmailAddress(String emailAddress) {
		if ( emailAddress == null || emailAddress.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("MemberMapDAO : findMembersByEmailAddress : emailAddress cannot be null or blank"));
		}
		List<IMember> list = new ArrayList<IMember>();
		for (IMember m : memberMap.values()) {
			if (emailAddress.equals(m.getEmailAddress())) {
				list.add(m);
			}
		}
		return Collections.unmodifiableList(list);
	}

	/** Override the  method */
	@Override
	/** The method findMembersByNames returns an unmodifiable list by member's name */
	public List<IMember> findMembersByNames(String firstName, String lastName) {
		if ( firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("MemberMapDAO : findMembersByNames : firstName and lastName cannot be null or blank"));
		}
		List<IMember> list = new ArrayList<IMember>();
		for (IMember m : memberMap.values()) {
			if (firstName.equals(m.getFirstName()) && lastName.equals(m.getLastName())) {
				list.add(m);
			}
		}
		return Collections.unmodifiableList(list);
	}

	/** The method getNextId returns the next ID of a Member object */
	private int getNextId() {
		return nextID++;
	}
} // End of the class MemberMapDAO