/** Specify the package in which this code resides */
package library.panels.borrow;

/** Import some libraries to be used in the code */
import javax.swing.JPanel;
import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;

public abstract class ABorrowPanel extends JPanel implements IBorrowUI {
	/** Declare and initialise variables with private access modifiers */
	private static final long serialVersionUID = 1L;

	@Override
	public void setState(EBorrowState state) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayExistingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayOverDueMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayAtLoanLimitMessage() {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayOutstandingFineMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	@Override
	public void displayOverFineLimitMessage(float amountOwing) {
		throw new RuntimeException("Illegal operation in current state");		
	}


	@Override
	public void displayScannedBookDetails(String bookDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayPendingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayConfirmingLoan(String loanDetails) {
		throw new RuntimeException("Illegal operation in current state");		
	}

	
	@Override
	public void displayErrorMessage(String errorMesg) {
		throw new RuntimeException("Illegal operation in current state");		
	}
	
}
