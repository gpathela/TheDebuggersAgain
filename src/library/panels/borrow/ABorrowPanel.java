/** Import some Java libraries and specify the package in which the classes resides. */
package library.panels.borrow;

import javax.swing.JPanel;

import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;

/**
* @reviewer Chiranjivi Bashyal
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

/** Start of the class ABorrowPanel */
public abstract class ABorrowPanel extends JPanel implements IBorrowUI {
	
	/** Declare and initialize the variable for the class
		with private visibility */

	private static final long serialVersionUID = 1L;

	/** Override the setState method  to sets the state of a borrowed book*/
	@Override
	public void setState(EBorrowState state) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayMemberDetails method to displays the details of a member*/
	@Override
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayExistingLoan method to displays the loan details of a member */
	@Override
	public void displayExistingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOverDueMessage method to displays an overdue of a member */
	@Override
	public void displayOverDueMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayAtLoanLimitMessage method to  displays a message about the limit of a loan */
	@Override
	public void displayAtLoanLimitMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayOutstandingFineMessage method to displays any outstanding fine about a book */
	@Override
	public void displayOutstandingFineMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}
	
	/** Override the displayOverFineLimitMessage method to displays a message if there is an overfine limit */
	@Override
	public void displayOverFineLimitMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayScannedBookDetails method to displays the details of a scanned book */
	@Override
	public void displayScannedBookDetails(String bookDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayPendingLoan method to displays a message about any pending loan */
	@Override
	public void displayPendingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayConfirmingLoan method to displays a message confirming a loan */
	@Override
	public void displayConfirmingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	/** Override the displayErrorMessage method to displays an error message*/
	@Override
	public void displayErrorMessage(String errorMesg) {
		throw new RuntimeException("Illegal operation in current state");		
	}
	
} // End of the class ABorrowPanel