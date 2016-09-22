/** Import some Java libraries and specify the package in which the classes resides */
package library.entities;

import java.text.DateFormat;
import java.util.Date;

import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.entities.ELoanState;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*
* The Loan class is a program that uses variables having private visibility to create instances
* with a constructor having specific attributes. The Loan class implements ILoan interface. We use 
* different method to check the availability or the status of the book. 
*		 
*/

/** Start of the class Loan */
public class Loan implements ILoan {//the Loan class implements ILoan
	/** 
	* Declare and initialize the variable for the class
	* with private visibility 
	*/
	private int id;
	private final IMember member;
	private final IBook book;
	private Date issueDate;
	private Date dueDate;
	private ELoanState state;

	/** Construct an Loan object with the specified attribute. */
	public Loan(IBook book, IMember member, Date issueDate, Date dueDate) {
		if (!sane(book, member, issueDate, dueDate)) {
			throw new IllegalArgumentException("Loan: constructor : bad parameters");
		}
		this.book = book;
		this.member = member;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.state = ELoanState.PENDING;
	}//End of the constructor

	/** the method test the variables and throw exception if any of the parameter is null or blank
	* and the ID is less than or equal to zero
`	*/
	private boolean sane(IBook book, IMember member, Date issueDate, Date dueDate) {
		return (book != null && member != null && issueDate != null && dueDate != null
				&& issueDate.compareTo(dueDate) <= 0);
	}

	/* 
	* A method to save the loan. 
	*/
	@Override
	public void commit(int loanId) {
		if (!(state == ELoanState.PENDING)) {
			throw new RuntimeException(String.format("Loan : commit : incorrect state transition  : %s -> %s\n", state,
					ELoanState.CURRENT));
		}
		if (loanId <= 0) {
			throw new RuntimeException(String.format("Loan : commit : id must be a positive integer  : %d\n", loanId));
		}
		this.id = loanId;
		state = ELoanState.CURRENT;
		book.borrow(this);
		member.addLoan(this);
	}

	/* A method to release the loan. This method is called when book is returned. */
	@Override
	public void complete() {
		if (!(state == ELoanState.CURRENT || state == ELoanState.OVERDUE)) {
			throw new RuntimeException(String.format("Loan : complete : incorrect state transition  : %s -> %s\n",
					state, ELoanState.COMPLETE));
		}
		state = ELoanState.COMPLETE;
	}

	@Override
	public boolean isOverDue() {
		return (state == ELoanState.OVERDUE);
	}

	/* A method to check if book is overdue. */
	@Override
	public boolean checkOverDue(Date currentDate) {
		if (!(state == ELoanState.CURRENT || state == ELoanState.OVERDUE)) {
			throw new RuntimeException(String.format("Loan : checkOverDue : incorrect state transition  : %s -> %s\n",
					state, ELoanState.OVERDUE));
		}
		if (currentDate.compareTo(dueDate) > 0) {
			state = ELoanState.OVERDUE;
		}
		return isOverDue();
	}

	/* This method to return member who borrowed the book*/
	@Override
	public IMember getBorrower() {
		return member;
	}

	/* This method to return book which has been borrowed */
	@Override
	public IBook getBook() {
		return book;
	}

	/* This method method to return loan ID */
	@Override
	public int getID() {
		return id;
	}

	/* This method to return status of the loan */
	public ELoanState getState() {
		return state;
	}

	/* To String method to display & return results in desired format */
	@Override
	public String toString() {
		return (String.format("Loan ID:  %d\nAuthor:   %s\nTitle:    %s\nMember: %s %s\nIssued On: %s\nDue Date: %s",
				id, book.getAuthor(), book.getTitle(), member.getFirstName(), member.getLastName(),
				DateFormat.getDateInstance().format(issueDate), DateFormat.getDateInstance().format(dueDate)));
	}

}//End of Loan class
