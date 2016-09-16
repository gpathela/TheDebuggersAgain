/** Specifying the package in which the class resides. */
package library;

/** Import necessary libraries for the code */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;
import library.interfaces.IBorrowUIListener;
import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.daos.IMemberDAO;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.hardware.ICardReader;
import library.interfaces.hardware.ICardReaderListener;
import library.interfaces.hardware.IDisplay;
import library.interfaces.hardware.IPrinter;
import library.interfaces.hardware.IScanner;
import library.interfaces.hardware.IScannerListener;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.2
*
*	The BorrowUC_CTL class allows the instantiation of an object of type BorrowUC_CTL
* 	which is a collection of windows which represents the user interface that is displayed
*	when the project is run in an IDE. The collection consists of a Card Reader, Scanner, 
*	Printer, and the Main Menu display windows. The BorrowUC_CTL class also accommodates all
*	the methods to initialise and close windows, swipe/read cards, scan books, borrow books, 
*	set states, confirm or reject loans, and build a list of loans that can be displayed.
*/

/** Start of the class BorrowUC_CTL */
public class BorrowUC_CTL implements ICardReaderListener, IScannerListener, IBorrowUIListener {
	
	/** Declare the variables that will be used in the class with private access modifiers */
	private ICardReader reader;
	private IScanner scanner; 
	private IPrinter printer; 
	private IDisplay display;
	private int scanCount = 0;
	private IBorrowUI ui;
	private EBorrowState state; 
	private IBookDAO bookDAO;
	private IMemberDAO memberDAO;
	private ILoanDAO loanDAO;
	private List<IBook> bookList;
	private List<ILoan> loanList;
	private IMember borrower;
	private JPanel previous;

	/** Constructor for BorrowUC_CTL object */
	public BorrowUC_CTL(ICardReader reader, IScanner scanner, IPrinter printer, IDisplay display,
			IBookDAO bookDAO, ILoanDAO loanDAO, IMemberDAO memberDAO ) {
		this.display = display;
		this.ui = new BorrowUC_UI(this);
		state = EBorrowState.CREATED;
	}
	
	/** The initialise() method gets the display of the previous window and sets a new one */
	public void initialise() {
		previous = display.getDisplay();
		display.setDisplay((JPanel) ui, "Borrow UI");		
	}
	
	/** The method close() closes all the windows and displays the "Main Menu" */
	public void close() {
		display.setDisplay(previous, "Main Menu");
	}

	/** Override the cardSwiped() method */
	@Override
	public void cardSwiped(int memberID) {
		throw new RuntimeException("Not implemented yet");
	}
	
	/** Override the bookScanned() method */
	@Override
	public void bookScanned(int barcode) {
		throw new RuntimeException("Not implemented yet");
	}

	/** The method setState sets the of a borrowed book */
	private void setState(EBorrowState state) {
		throw new RuntimeException("Not implemented yet");
	}

	/** Override the cancelled() method */
	@Override
	public void cancelled() {
		close();
	}
	
	/** Override the scansCompleted() method */
	@Override
	public void scansCompleted() {
		throw new RuntimeException("Not implemented yet");
	}

	/** Override the loansConfirmed() method */
	@Override
	public void loansConfirmed() {
		throw new RuntimeException("Not implemented yet");
	}

	/** Override the loansRejected() method */
	@Override
	public void loansRejected() {
		throw new RuntimeException("Not implemented yet");
	}

	/** The method buildLoanListDisplay returns a list of loan that is built by 
		the method buildLoanListDisplay */
	private String buildLoanListDisplay(List<ILoan> loans) {
		StringBuilder bld = new StringBuilder();
		for (ILoan ln : loans) {
			if (bld.length() > 0) bld.append("\n\n");
			bld.append(ln.toString());
		}
		return bld.toString();		
	}
} // End of the class BorrowUC_CTL