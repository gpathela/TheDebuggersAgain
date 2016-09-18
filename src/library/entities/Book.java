/** Specify the package in which this code resides */
package library.entities;

/** Import some libraries to be used in the code */
import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;

/**
*@author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The GradeProcessing class will display a GUI with a title appearing on top of 
*the main frame, six text fields with appropriate labels to take user inputs, 
*two buttons that will be used to trigger actions for calculations.
*/

/** Start of the class ABorrowPanel */
public class Book implements IBook {
	/** Declare and initialise variables with private access modifiers */
	private String author;
	private String title;
	private String callNumber;
	private int id;
	private ILoan loan;
	private EBookState state;
	
	/** The constructor for a Book object which takes a parameter of variables */
	public Book(String author, String title, String callNumber, int bookID) {
		if ( !sane(author, title, callNumber, bookID)) {
			throw new IllegalArgumentException("Member: constructor : bad parameters");
		}
		this.author = author;
		this.title = title;
		this.callNumber = callNumber;
		this.id = bookID;
		this.state = EBookState.AVAILABLE;
		this.loan = null;
	}

	/** The method sane returns true or false if the parameter does not contain the right variables */
	private boolean sane(String author, String title, String callNumber, int bookID) {
		return  ( author != null     && !author.isEmpty()     &&
				  title != null      && !title.isEmpty()      &&
				  callNumber != null && !callNumber.isEmpty() &&
				  bookID > 0 
				);
	}

	/** Override the borrow method */
	@Override
	/** The method  */
	public void borrow(ILoan loan) {
		if (loan == null) {
			throw new IllegalArgumentException(String.format("Book: borrow : Bad parameter: loan cannot be null"));
		}
		if (!(state == EBookState.AVAILABLE)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		this.loan = loan;
		state = EBookState.ON_LOAN;

	}

	/** Override the getLoan method */
	@Override
	/** The method  */
	public ILoan getLoan() {
		return loan;
	}

	/** Override the returnBook method */
	@Override
	/** The method  */
	public void returnBook(boolean damaged) {
		if (!(state == EBookState.ON_LOAN || state == EBookState.LOST)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		loan = null;
		if (damaged) {
			state = EBookState.DAMAGED;
		}
		else {
			state = EBookState.AVAILABLE;
		}
	}

	/** Override the lose method */
	@Override
	/** The method  */
	public void lose() {
		if (!(state == EBookState.ON_LOAN)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.LOST;
	}

	/** Override the repair method */
	@Override
	/** The method  */
	public void repair() {
		if (!(state == EBookState.DAMAGED)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.AVAILABLE;
	}

	/** Override the dispose method */
	@Override
	/** The method  */
	public void dispose() {
		if (!(state == EBookState.AVAILABLE || state == EBookState.DAMAGED || state == EBookState.LOST)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.DISPOSED;
	}

	/** Override the getState method */
	@Override
	/** The method  */
	public EBookState getState() {
		return state;
	}

	/** Override the getAuthor method */
	@Override
	/** The method getAuthor returns the author of a book */
	public String getAuthor() {
		return author;
	}

	/** Override the getTitle method */
	@Override
	/** The method getTitle returns the title of a book */
	public String getTitle() {
		return title;
	}

	/** Override the getCallNumber method */
	@Override
	/** The method getCallNumber returns the call number of a book */
	public String getCallNumber() {
		return callNumber;
	}

	/** Override the getID method */
	@Override
	/** The method getID returns the id of a book */
	public int getID() {
		return id;
	}

	/** Override the toString method */
	@Override
	/** The method toString returns the details of a book object */
	public String toString() {
		return String.format("Id: %d\nAuthor: %s\nTitle: %s\nCall Number %s",
				id, author, title, callNumber);
	}
}
