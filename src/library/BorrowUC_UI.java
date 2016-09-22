/** Import some Java libraries and specify the package in which the classes resides */
package library;

import java.awt.CardLayout;
import java.util.Map;
import java.util.HashMap;

import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;
import library.interfaces.IBorrowUIListener;
import library.panels.ABorrowPanel;
import library.panels.RestrictedPanel;
import library.panels.CancelledPanel;
import library.panels.CompletedPanel;
import library.panels.SwipeCardPanel;
import library.panels.ConfirmLoanPanel;
import library.panels.ScanningPanel;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.2
*/

/** Start of the class BorrowUC_UI */
public class BorrowUC_UI extends ABorrowPanel {
	
	/** Declare and initialize the variable for the class
		with private visibility */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private IBorrowUIListener listener;
	private EBorrowState state;
	private Map<EBorrowState,IBorrowUI> panels;

	/** Construct an BorrowUC_UI object with the specified attribute. */
	public BorrowUC_UI(IBorrowUIListener listener) {
		this.listener = listener;
		this.panels = new HashMap<EBorrowState,IBorrowUI>();		
		this.setLayout(new CardLayout());

		addPanel(new SwipeCardPanel(listener),   EBorrowState.INITIALIZED);
		addPanel(new ScanningPanel(listener),    EBorrowState.SCANNING_BOOKS);
		addPanel(new RestrictedPanel(listener),  EBorrowState.BORROWING_RESTRICTED);
		addPanel(new ConfirmLoanPanel(listener), EBorrowState.CONFIRMING_LOANS);
		addPanel(new CancelledPanel(),           EBorrowState.CANCELLED);
		addPanel(new CompletedPanel(),           EBorrowState.COMPLETED);
	}
	
	/** The addPanel method adds panel to the screen */
	private void addPanel(ABorrowPanel panel, EBorrowState state) {
        this.panels.put(state, panel);
        this.add(panel, state.toString());
 	}

	/** Override the setState method to sets the state of EBorrow*/
	@Override
	public void setState(EBorrowState state) {
		CardLayout cl = (CardLayout) (this.getLayout());

		switch (state) {
		case INITIALIZED:
			cl.show(this, state.toString());
			break;
		case SCANNING_BOOKS:
			cl.show(this, state.toString());
			break;
		case CONFIRMING_LOANS:
			cl.show(this, state.toString());
			break;
		case BORROWING_RESTRICTED:
			cl.show(this, state.toString());
			break;
		case COMPLETED:
			cl.show(this, state.toString());
			break;
		case CANCELLED:
			cl.show(this, state.toString());
			break;
		default:
			throw new RuntimeException("Unknown state");
		}
		this.state = state;
	}

	/** Override the displayMemberDetails method to displays the details of a member */
	@Override
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		IBorrowUI ui = panels.get(state);
		ui.displayMemberDetails( memberID,  memberName, memberPhone);		
	}

	/** Override the displayOverDueMessage method to displays any overdue message to the user*/
	@Override
	public void displayOverDueMessage() {
		IBorrowUI ui = panels.get(state);
		ui.displayOverDueMessage();		
	}

	/** Override the displayAtLoanLimitMessage method */
	@Override
	public void displayAtLoanLimitMessage() {
		IBorrowUI ui = panels.get(state);
		ui.displayAtLoanLimitMessage();		
	}

	
	/** Override the displayOutstandingFineMessage method to displays a message of any outstanding to the user */
	@Override
	public void displayOutstandingFineMessage(float amountOwing) {
		IBorrowUI ui = panels.get(state);
		ui.displayOutstandingFineMessage(amountOwing);		
	}

	/** Override the displayExistingLoan method to displays the details of an existing loan to the user */
	@Override
	public void displayExistingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayExistingLoan(loanDetails);		
	}

	/** Override the displayScannedBookDetails method show the details of a scanned book to the screen */
	@Override
	public void displayScannedBookDetails(String bookDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayScannedBookDetails(bookDetails);		
	}

	/** Override the displayPendingLoan method displays a pending loan to the screen*/
	@Override
	public void displayPendingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayPendingLoan(loanDetails);		
	}

	/** Override the displayConfirmingLoan method displays a confirming loan message to the user*/
	@Override
	public void displayConfirmingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayConfirmingLoan(loanDetails);		
	}

	/** Override the displayErrorMessage method displays an error message to the screen*/
	@Override
	public void displayErrorMessage(String errorMesg) {
		IBorrowUI ui = panels.get(state);
		ui.displayErrorMessage(errorMesg);		
	}

} // End of the class BorrowUC_UI
