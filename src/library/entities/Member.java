/** Import some Java libraries and specify the package in which the classes resides */
package library.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.entities.EMemberState;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*
* The class Member contains several variables along with some getters and setters 
* methods that helps to create the member object.
*
*/

/** Start of the class Member */
public class Member implements IMember {
	
	/** Declare and initialize the variable for the class
		with private visibility */
	private final String firstName;
	private final String lastName;
	private final String contactPhone;
	private final String emailAddress;
	private final int id;
	
	private EMemberState state;
	private List<ILoan> loanList;
	private float totalFines;
	
	/** Construct an Book object with the specified attribute. */
	public Member(String firstName, String lastName, String contactPhone,
			String email, int memberID) {
		if ( !sane(firstName, lastName, contactPhone, email, memberID)) {
			throw new IllegalArgumentException("Member: constructor : bad parameters");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactPhone = contactPhone;
		this.emailAddress = email;
		this.id = memberID;
		this.loanList = new ArrayList<ILoan>();
		this.totalFines = 0.0f;
		this.state = EMemberState.BORROWING_ALLOWED;
	}

	/** the method test the variables and throw exception if any of the parameter is null or blank
	* and the ID is less than or equal to zero
`	*/
	private boolean sane(String firstName, String lastName, String contactPhone,
			String emailAddress, int memberID) {
		return  ( firstName != null    && !firstName.isEmpty()    &&
				  lastName != null     && !lastName.isEmpty()     &&
				  contactPhone != null && !contactPhone.isEmpty() &&
				  emailAddress != null && !emailAddress.isEmpty() &&
				  memberID > 0 
				);
	}

	
	/** Override the hasOverDueLoans method */
	@Override
	/** The hasOverDueLoans method returns true or false if a member has overdue loans */
	public boolean hasOverDueLoans() {
		for (ILoan loan : loanList) {
			if (loan.isOverDue()) {
				return true;
			}
		}
		return false;
	}
	
	/** Override the hasReachedLoanLimit method */
	@Override
	/** The hasReachedLoanLimit method returns true or false if a member has reached their loan limit */
	public boolean hasReachedLoanLimit() {
		boolean b = loanList.size() >= IMember.LOAN_LIMIT;
		return b;
	}
	
	/** Override the hasFinesPayable method */
	@Override
	/** The  hasFinesPayable method returns true or false if a member fines to pay */
	public boolean hasFinesPayable() {
		boolean b = totalFines > 0.0f;
		return b;
	}
	
	/** Override the hasReachedFineLimit method */
	@Override
	/** The method hasReachedFineLimit returns true or false if a member has reached their limit */
	public boolean hasReachedFineLimit() {
		boolean b = totalFines >= IMember.FINE_LIMIT;
		return b;
	}
	
	/** Override the getFineAmount method to return the amount of fine paid by a member */ 
	@Override
	public float getFineAmount() {
		return totalFines;
	}
	
	/** Override the addFine method to adds a fine to the total of fines 
	* and updates the state of a member
	*/
	@Override
	public void addFine(float fine) {
		if (fine < 0) {
			throw new RuntimeException(String.format("Member: addFine : fine cannot be negative"));
		}
		totalFines += fine;
		updateState();
	}
	
	/** Override the payFine method add the total of fines depending on the payment made by a member  */
	@Override
	public void payFine(float payment) {
		if (payment < 0 || payment > totalFines) {
			throw new RuntimeException(String.format("Member: addFine : payment cannot be negative or greater than totalFines"));
		}
		totalFines -= payment;
		updateState();
	}
	
	/** Override the addLoan method to adds and updates the list of loans  */
	@Override
	public void addLoan(ILoan loan) {
		if (!borrowingAllowed()) {
			throw new RuntimeException(String.format("Member: addLoan : illegal operation in state: %s", state));
		}
		loanList.add(loan);
		updateState();
	}
	
	/** Override the getLoans method to returns a list of loans of a member */
	@Override
	public List<ILoan> getLoans() {
		return Collections.unmodifiableList(loanList);
	}
	
	/** Override the removeLoan method to removes the loan of a Member */
	@Override
	public void removeLoan(ILoan loan) {
		if (loan == null || !loanList.contains(loan)) {
			throw new RuntimeException(String.format("Member: removeLoan : loan is null or not found in loanList"));
		}
		loanList.remove(loan);
		updateState();
	}

	/** Override the getState method to returns the state of a member*/
	@Override
	public EMemberState getState() {
		return state;
	}

	/** Override the getFirstName method to returns the first name of a member*/
	@Override
	public String getFirstName() {
		return firstName;
	}

	/** Override the getLastName method to returns the last name of a member */
	@Override
	public String getLastName() {
		return lastName;
	}

	/** Override the getContactPhone method to returns the contact phone number of a member*/
	@Override
	public String getContactPhone() {
		return contactPhone;
	}

	
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	
	@Override
	public int getID() {
		return id;
	}

	
	@Override
	public String toString() {
		return String.format(
				"Id: %d\nName: %s %s\nContact Phone: %s\nEmail: %s\nOutstanding Charges: %0.2f", id,
				firstName, lastName, contactPhone, emailAddress, totalFines);
	}

	private Boolean borrowingAllowed() {
		boolean b = !hasOverDueLoans() &&
				!hasReachedFineLimit() &&
				!hasReachedLoanLimit();
		return b;
	}

	private void updateState() {
		if (borrowingAllowed()) {
			state = EMemberState.BORROWING_ALLOWED;
		}
		else {
			state = EMemberState.BORROWING_DISALLOWED;
		}
	}


}
