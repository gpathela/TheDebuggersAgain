/** Specifying the package in which the class resides */
package library.panels.borrow;

/** Import necessary libraries for the code */
import javax.swing.JPanel;
import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;

/**
*@author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*
*	The ABorrowPanel is an abstract class that displays all the messages that the application 
*	needs to. 
*/

/** Start of the class ABorrowPanel */
public abstract class ABorrowPanel extends JPanel implements IBorrowUI {

	/** Declare the variables that will be used in the class with private access modifiers */
	private static final long serialVersionUID = 1L;

	/** Override the setState() method */
	@Override
	public void setState(EBorrowState state) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayMemberDetails() method */
	@Override
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayExistingLoan() method */
	@Override
	public void displayExistingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOverDueMessage() method */
	@Override
	public void displayOverDueMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayAtLoanLimitMessage() method */
	@Override
	public void displayAtLoanLimitMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOutstandingFineMessage() method */
	@Override
	public void displayOutstandingFineMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOverFineLimitMessage() method */
	@Override
	public void displayOverFineLimitMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayScannedBookDetails() method */
	@Override
	public void displayScannedBookDetails(String bookDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayPendingLoan() method */
	@Override
	public void displayPendingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayConfirmingLoan() method */
	@Override
	public void displayConfirmingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayErrorMessage() method */
	@Override
	public void displayErrorMessage(String errorMesg) {
		throw new RuntimeException("Illegal operation in current state");		
	}
} // End of the class ABorrowPanel