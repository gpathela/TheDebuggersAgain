/** Specify the package in which the class resides */
package library.entities;

/** Import some libraries to be used in the code */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.entities.EMemberState;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The class Member contains several variables, some getters and setters 
*methods that enable the creation and modification of a Member object.
*/

/** Start of the class Member */
public class Member implements IMember {

	/** Declare the variables with private access modifiers */
	private final String firstName;
	private final String lastName;
	private final String contactPhone;
	private final String emailAddress;
	private final int id;
	private EMemberState state;
	private List<ILoan> loanList;
	private float totalFines;
	
	/** The constructor for a Member object which takes a parameter of variables */
	public Member(String firstName, String lastName, String contactPhone, String email, int memberID) {
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

	/** The method sane returns true or false if the parameter does not contain the right variables */
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
	/** The method hasOverDueLoans returns true or false if a member has overdue loans */
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
	/** The method hasReachedLoanLimit returns true or false if a member has reached their loan limit */
	public boolean hasReachedLoanLimit() {
		boolean b = loanList.size() >= IMember.LOAN_LIMIT;
		return b;
	}

	/** Override the hasFinesPayable method */
	@Override
	/** The method hasFinesPayable returns true or false if a member fines to pay */
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

	/** Override the getFineAmount method */
	@Override
	/** The method getFineAmount returns the amount of fine paid by a member */
	public float getFineAmount() {
		return totalFines;
	}

	/** Override the addFine method */
	@Override
	/** The method addFine adds a fine to the total of fines and updates the state of a member */
	public void addFine(float fine) {
		if (fine < 0) {
			throw new RuntimeException(String.format("Member: addFine : fine cannot be negative"));
		}
		totalFines += fine;
		updateState();
	}

	/** Override the payFine method */
	@Override
	/** The method payFine modifies the total of fines depending on the payment made by a member 
		and updates the state of a member */
	public void payFine(float payment) {
		if (payment < 0 || payment > totalFines) {
			throw new RuntimeException(String.format("Member: addFine : payment cannot be negative or greater than totalFines"));
		}
		totalFines -= payment;
		updateState();
	}

	/** Override the addLoan method */
	@Override
	/** The method addLoan adds and updates the list of loans  */
	public void addLoan(ILoan loan) {
		if (!borrowingAllowed()) {
			throw new RuntimeException(String.format("Member: addLoan : illegal operation in state: %s", state));
		}
		loanList.add(loan);
		updateState();
	}

	/** Override the getLoans method */
	@Override
	/** The method getLoans returns a collection of loans of a member */
	public List<ILoan> getLoans() {
		return Collections.unmodifiableList(loanList);
	}

	/** Override the removeLoan method */
	@Override
	/** The method removeLoan removes the loan of a Member object */
	public void removeLoan(ILoan loan) {
		if (loan == null || !loanList.contains(loan)) {
			throw new RuntimeException(String.format("Member: removeLoan : loan is null or not found in loanList"));
		}
		loanList.remove(loan);
		updateState();
	}

	/** Override the getState method */
	@Override
	/** The method getState returns the state of a member */
	public EMemberState getState() {
		return state;
	}

	/** Override the getFirstName method */
	@Override
	/** The method getFirstName returns the first name of a member */
	public String getFirstName() {
		return firstName;
	}

	/** Override the getLastName method */
	@Override
	/** The method getLastName returns the last name of a member */
	public String getLastName() {
		return lastName;
	}

	/** Override the getContactPhone method */
	@Override
	/** The method getContactPhone returns the contact phone number of a member */
	public String getContactPhone() {
		return contactPhone;
	}

	/** Override the getEmailAddress method */
	@Override
	/** The method getEmailAddress returns the email address of a member */
	public String getEmailAddress() {
		return emailAddress;
	}

	/** Override the getID method */
	@Override
	/** The method getID returns the ID of member */
	public int getID() {
		return id;
	}

	/** Override the toString method */
	@Override
	/** The method toString returns the details of a Member object */
	public String toString() {
		return String.format(
				"Id: %d\nName: %s %s\nContact Phone: %s\nEmail: %s\nOutstanding Charges: %0.2f", id,
				firstName, lastName, contactPhone, emailAddress, totalFines);
	}

	/** The method borrowingAllowed checks if a Member object is allowed to borrow */
	private Boolean borrowingAllowed() {
		boolean b = !hasOverDueLoans() &&
				!hasReachedFineLimit() &&
				!hasReachedLoanLimit();
		return b;
	}

	/** The method updateState sets the state of a Member object to allowed or disallowed */
	private void updateState() {
		if (borrowingAllowed()) {
			state = EMemberState.BORROWING_ALLOWED;
		}
		else {
			state = EMemberState.BORROWING_DISALLOWED;
		}
	}
} // End of the class Member