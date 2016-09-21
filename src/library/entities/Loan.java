/** Specify the package in which the class resides */
package library.entities;

/** Import some libraries to be used in the code */
import java.text.DateFormat;
import java.util.Date;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.entities.ELoanState;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*/

/** Start of the class Loan */
public class Loan implements ILoan {
	/** Declare and initialise variables with private access modifiers */
	private int id;
	private final IMember member;
	private final IBook book;
	private Date issueDate;
	private Date dueDate;
	private ELoanState state;

	/** The constructor for a Loan object which takes a parameter of variables */
	public Loan(IBook book, IMember member, Date issueDate, Date dueDate) {
		if (!sane(book, member, issueDate, dueDate)) {
			throw new IllegalArgumentException("Loan: constructor : bad parameters");
		}
		this.book = book;
		this.member = member;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.state = ELoanState.PENDING;
	}

	/** The method sane returns true or false if the parameter does not contain the right variables */
	private boolean sane(IBook book, IMember member, Date issueDate, Date dueDate) {
		return (book != null && member != null && issueDate != null && dueDate != null
				&& issueDate.compareTo(dueDate) <= 0);
	}

	/** Override the commit method */
	@Override
	/** The method commit commit a loan based on its ID */
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

	/** Override the complete method */
	@Override
	/** The method complete sets the state of a loan to complete */
	public void complete() {
		if (!(state == ELoanState.CURRENT || state == ELoanState.OVERDUE)) {
			throw new RuntimeException(String.format("Loan : complete : incorrect state transition  : %s -> %s\n",
					state, ELoanState.COMPLETE));
		}
		state = ELoanState.COMPLETE;
	}

	/** Override the isOverDue method */
	@Override
	/** The method returns the state of a loan as overdue */
	public boolean isOverDue() {
		return (state == ELoanState.OVERDUE);
	}

	/** Override the checkOverDue method */
	@Override
	/** The method checkOverDue checks if a loan is overdue and returns true or false if it is */
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

	/** Override the getBorrower method */
	@Override
	/** The method getBorrower returns the borrower of a book */
	public IMember getBorrower() {
		return member;
	}

	/** Override the getBook method */
	@Override
	/** The method getBook returns a Book object */
	public IBook getBook() {
		return book;
	}

	/** Override the getID method */
	@Override
	/** The method getID returns the ID of a loan*/
	public int getID() {
		return id;
	}

	/** The method getState return the state of a Loan object */
	public ELoanState getState() {
		return state;
	}

	/** Override the toString method */
	@Override
	/** The method toString returns the details of a Loan object */
	public String toString() {
		return (String.format("Loan ID:  %d\nAuthor:   %s\nTitle:    %s\nMember: %s %s\nIssued On: %s\nDue Date: %s",
				id, book.getAuthor(), book.getTitle(), member.getFirstName(), member.getLastName(),
				DateFormat.getDateInstance().format(issueDate), DateFormat.getDateInstance().format(dueDate)));
	}
} // End of the Loan class