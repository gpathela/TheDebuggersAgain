/** Specify the package in which this code resides */
//package library.entities;

/** Import some libraries to be used in the code */
//import library.interfaces.entities.EBookState;
//import library.interfaces.entities.IBook;
//import library.interfaces.entities.ILoan;
/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*
*
* The Book class is a program that uses variables having private visibility to create instances
* with a constructor having specific attributes. The Book class implements IBook interface. We use 
* different method to check the availability or the status of the book. 
*
*/

/** Start of the class Book */
//public class Book implements IBook
public class Book {
	/** Declare and initialise variables with private access modifiers */
	private String author;
	private String title;
	private String callNumber;
	private int id;
	//private ILoan loan;
	//private EBookState state;
	
	/** The constructor for a Book object which takes a parameter of variables */
	public Book(String author, String title, String callNumber, int bookID) {
		if ( !sane(author, title, callNumber, bookID)) {
			throw new IllegalArgumentException("Member: constructor : bad parameters");
		}
		this.author = author;
		this.title = title;
		this.callNumber = callNumber;
		this.id = bookID;
		//this.state = EBookState.AVAILABLE;
		//this.loan = null;
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
	//@Override
	/** The method borrow sets the state of a book to on loan */
	//public void borrow(ILoan loan) {
		//if (loan == null) {
		//	throw new IllegalArgumentException(String.format("Book: borrow : Bad parameter: loan cannot be null"));
		//}
		//if (!(state == EBookState.AVAILABLE)) {
		//	throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		//}
		//this.loan = loan;
		//state = EBookState.ON_LOAN;
	//}

	/** Override the getLoan method */
	//@Override
	/** The method getLoan returns the laon of a book */
	//public ILoan getLoan() {
		//return loan;
	//}

	/** Override the returnBook method */
	//@Override
	/** The method returnBook sets the state of a book to available or damaged */
	//public void returnBook(boolean damaged) {
		//if (!(state == EBookState.ON_LOAN || state == EBookState.LOST)) {
		//	throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		//}
		//loan = null;
		//if (damaged) {
		//	state = EBookState.DAMAGED;
		//}
		//else {
		//	state = EBookState.AVAILABLE;
		//}
	//}

	/** Override the lose method */
	//@Override
	/** The method lose sets the state of a book to lost */
	//public void lose() {
		//if (!(state == EBookState.ON_LOAN)) {
		//	throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		//}
		//state = EBookState.LOST;
	//}

	/** Override the repair method */
	//@Override
	/** The method repair sets the state of a book to available */
	//public void repair() {
		//if (!(state == EBookState.DAMAGED)) {
		//	throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		//}
		//state = EBookState.AVAILABLE;
	//}

	/** Override the dispose method */
	//@Override
	/** The method dispose sets the state of a book to disposed */
	//public void dispose() {
		//if (!(state == EBookState.AVAILABLE || state == EBookState.DAMAGED || state == EBookState.LOST)) {
		//	throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		//}
		//state = EBookState.DISPOSED;
	//}

	/** Override the getState method */
	//@Override
	/** The method getState returns the state of a book */
	//public EBookState getState() {
	//	return state;
	//}

	/** Override the getAuthor method */
	//@Override
	/** The method getAuthor returns the author of a book */
	public String getAuthor() {
		return author;
	}

	/** Override the getTitle method */
	//@Override
	/** The method getTitle returns the title of a book */
	public String getTitle() {
		return title;
	}

	/** Override the getCallNumber method */
	//@Override
	/** The method getCallNumber returns the call number of a book */
	public String getCallNumber() {
		return callNumber;
	}

	/** Override the getID method */
	//@Override
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
} // End of the class Book