/** Specify the package in which the class resides */
package library;

/** Import some libraries to be used in the code */
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
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The BorrowUC_UI 
*/

/** Start of the class BorrowUC_UI */
public class BorrowUC_UI extends ABorrowPanel {

	/** Declare and initialise variables with private access modifiers */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private IBorrowUIListener listener;
	private EBorrowState state;
	private Map<EBorrowState,IBorrowUI> panels;

	/** The constructor for a BorrowUC_UI object which takes a parameter of variables */
	public BorrowUC_UI(IBorrowUIListener listener) {
		this.listener = listener;
		this.panels = new HashMap<EBorrowState,IBorrowUI>();		
		this.setLayout(new CardLayout());
		addPanel(new SwipeCardPanel(listener), EBorrowState.INITIALIZED);
		addPanel(new ScanningPanel(listener), EBorrowState.SCANNING_BOOKS);
		addPanel(new RestrictedPanel(listener), EBorrowState.BORROWING_RESTRICTED);
		addPanel(new ConfirmLoanPanel(listener), EBorrowState.CONFIRMING_LOANS);
		addPanel(new CancelledPanel(), EBorrowState.CANCELLED);
		addPanel(new CompletedPanel(), EBorrowState.COMPLETED);
	}
	
	/** The method addPanel adds panel to the screen */
	private void addPanel(ABorrowPanel panel, EBorrowState state) {
        this.panels.put(state, panel);
        this.add(panel, state.toString());
 	}

	/** Override the setState method */
	@Override
	/** The method setState sets the state of EBorrow */
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

	/** Override the displayMemberDetails method */
	@Override
	/** The method displayMemberDetails displays the details of a member */
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		IBorrowUI ui = panels.get(state);
		ui.displayMemberDetails( memberID,  memberName, memberPhone);		
	}

	/** Override the displayOverDueMessage method */
	@Override
	/** The method displayOverDueMessage displays any overdue message to the user */
	public void displayOverDueMessage() {
		IBorrowUI ui = panels.get(state);
		ui.displayOverDueMessage();		
	}

	/** Override the displayOutstandingFineMessage method */
	@Override
	/** The method displayOutstandingFineMessage displays any outstanding fine to the user */
	public void displayAtLoanLimitMessage() {
		IBorrowUI ui = panels.get(state);
		ui.displayAtLoanLimitMessage();		
	}

	/** Override the displayOutstandingFineMessage method */
	@Override
	/** The method displayOutstandingFineMessage displays a message of any outstanding to the user */
	public void displayOutstandingFineMessage(float amountOwing) {
		IBorrowUI ui = panels.get(state);
		ui.displayOutstandingFineMessage(amountOwing);		
	}

	/** Override the displayExistingLoan method */
	@Override
	/** The method displayExistingLoan displays the details of an existing loan to the user */
	public void displayExistingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayExistingLoan(loanDetails);		
	}

	/** Override the displayScannedBookDetails method */
	@Override
	/** The method displayScannedBookDetails the details of a scanned book to the screen */
	public void displayScannedBookDetails(String bookDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayScannedBookDetails(bookDetails);		
	}

	/** Override the displayPendingLoan method */
	@Override
	/** The method displayPendingLoan displays a pending loan to the screen */
	public void displayPendingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayPendingLoan(loanDetails);		
	}

	/** Override the displayConfirmingLoan method */
	@Override
	/** The method displayConfirmingLoan displays a confirming loan message to the user */
	public void displayConfirmingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayConfirmingLoan(loanDetails);		
	}

	/** Override the displayErrorMessage method */
	@Override
	/** The method displayErrorMessage displays an error message to the screen */
	public void displayErrorMessage(String errorMesg) {
		IBorrowUI ui = panels.get(state);
		ui.displayErrorMessage(errorMesg);		
	}
} // End of the class BorrowUC_UI