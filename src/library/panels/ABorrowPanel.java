/** Specify the package in which this code resides */
package library.panels.borrow;

/** Import some libraries to be used in the code */
import javax.swing.JPanel;
import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The ABorrowPanel class extens the JPanel class and implements the interface IBorrowUI.
*It sets the state of a borrowed object and displays information to the user of the system. 
*/

/** Start of the class ABorrowPanel */
public abstract class ABorrowPanel extends JPanel implements IBorrowUI {
	/** Declare and initialise variables with private access modifiers */
	private static final long serialVersionUID = 1L;
	
	/** Override the setState method */
	@Override
	/** The method setState sets the state of a borrowed book */
	public void setState(EBorrowState state) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayMemberDetails method */
	@Override
	/** The method displayMemberDetails displays the details of a member */
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayExistingLoan method */
	@Override
	/** The method displayExistingLoan displays the loan details of a member */
	public void displayExistingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOverDueMessage method */
	@Override
	/** The method displayOverDueMessage displays an overdue of a member */
	public void displayOverDueMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayAtLoanLimitMessage method */
	@Override
	/** The method displayAtLoanLimitMessage displays a message about the limit of a loan */
	public void displayAtLoanLimitMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOutstandingFineMessage method */
	@Override
	/** The method displayOutstandingFineMessage displays any outstanding fine about a book */
	public void displayOutstandingFineMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOverFineLimitMessage method */
	@Override
	/** The method displayOverFineLimitMessage displays a message if there is an overfine limit */
	public void displayOverFineLimitMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayScannedBookDetails method */
	@Override
	/** The method displayScannedBookDetails displays the details of a scanned book */
	public void displayScannedBookDetails(String bookDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayPendingLoan method */
	@Override
	/** The method displayPendingLoan displays a message about any pending loan */
	public void displayPendingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayConfirmingLoan method */
	@Override
	/** The method displayConfirmingLoan displays a message confirming a loan */
	public void displayConfirmingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayErrorMessage method */
	@Override
	/** The method displayErrorMessage displays an error message */
	public void displayErrorMessage(String errorMesg) {
		throw new RuntimeException("Illegal operation in current state");		
	}	
} // End of the class ABorrowPanel