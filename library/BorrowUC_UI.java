/** Specifying the package in which the class resides */
package library;

/** Import necessary libraries for the code */
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.util.Map;
import java.util.HashMap;
import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;
import library.interfaces.IBorrowUIListener;
import library.panels.borrow.ABorrowPanel;
import library.panels.borrow.ConfirmLoanPanel;
import library.panels.borrow.RestrictedPanel;
import library.panels.borrow.ScanningPanel;
import library.panels.borrow.SwipeCardPanel;

/**
*@author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*
*	The BorrowUC_UI ......
*	class allows the instantiation of an object of type BorrowUC_CTL
* 	which is a collection of windows which represents the user interface that is displayed
*	when the project is run in an IDE. The collection consists of a Card Reader, Scanner, 
*	Printer, and the Main Menu display windows. The BorrowUC_CTL class also accommodates all
*	the methods to initialise and close windows, swipe/read cards, scan books, borrow books, 
*	set states, confirm or reject loans, and build a list of loans that can be displayed.
*/

/** Start of the class BorrowUC_UI */
public class BorrowUC_UI extends JPanel implements IBorrowUI {

	/** Declare the variables that will be used in the class with private access modifiers */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private IBorrowUIListener listener;
	private EBorrowState state;
	private Map<EBorrowState,IBorrowUI> panels;

	
	public BorrowUC_UI(IBorrowUIListener listener) {
		this.listener = listener;
		this.panels = new HashMap<EBorrowState,IBorrowUI>();		
		this.setLayout(new CardLayout());

		addPanel(new SwipeCardPanel(listener),   EBorrowState.INITIALIZED);
		addPanel(new ScanningPanel(listener),    EBorrowState.SCANNING_BOOKS);
		addPanel(new RestrictedPanel(listener),  EBorrowState.BORROWING_RESTRICTED);
		addPanel(new ConfirmLoanPanel(listener), EBorrowState.CONFIRMING_LOANS);
		//addPanel(new CancelledPanel(),           EBorrowState.CANCELLED);
		//addPanel(new CompletedPanel(),           EBorrowState.COMPLETED);
	}
	
	private void addPanel(ABorrowPanel panel, EBorrowState state) {
        this.panels.put(state, panel);
        this.add(panel, state.toString());
 	}


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
			
		case BORROWING_RESTRICTED:
			cl.show(this, state.toString());
			break;
			
		case CONFIRMING_LOANS:
			cl.show(this, state.toString());
			break;

 		case COMPLETED:
			break;
			
		case CANCELLED:
			break;
			
		default:
			throw new RuntimeException("Unknown state");
		}
		this.state = state;
	}


	@Override
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		IBorrowUI ui = panels.get(state);
		ui.displayMemberDetails( memberID,  memberName, memberPhone);		
	}


	@Override
	public void displayOverDueMessage() {
		IBorrowUI ui = panels.get(state);
		ui.displayOverDueMessage();		
	}


	@Override
	public void displayAtLoanLimitMessage() {
		IBorrowUI ui = panels.get(state);
		ui.displayAtLoanLimitMessage();		
	}


	@Override
	public void displayOutstandingFineMessage(float amountOwing) {
		IBorrowUI ui = panels.get(state);
		ui.displayOutstandingFineMessage(amountOwing);		
	}

	
	@Override
	public void displayOverFineLimitMessage(float amountOwing) {
		IBorrowUI ui = panels.get(state);
		ui.displayOverFineLimitMessage(amountOwing);				
	}

	
	@Override
	public void displayExistingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayExistingLoan(loanDetails);		
	}

	
	@Override
	public void displayScannedBookDetails(String bookDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayScannedBookDetails(bookDetails);		
	}

	
	@Override
	public void displayPendingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayPendingLoan(loanDetails);		
	}

	
	@Override
	public void displayConfirmingLoan(String loanDetails) {
		IBorrowUI ui = panels.get(state);
		ui.displayConfirmingLoan(loanDetails);		
	}

	
	@Override
	public void displayErrorMessage(String errorMesg) {
		IBorrowUI ui = panels.get(state);
		ui.displayErrorMessage(errorMesg);		
	}
} // End of the class BorrowUC_UI
