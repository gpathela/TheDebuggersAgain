/** Import some Java libraries and specify the package in which the classes resides */
package library.entities;

import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.0
*
*
* The Book class is a program that uses variables having private visibility to create instances
* with a constructor having specific attributes. The Book class implements IBook interface. We use 
* different method to check the availability or the status of the book. 
*
*/

/** Start of the Book Class */
public class Book implements IBook {//the Book class implements IBook

	/** Declare and initialize the variable for the class
		with private visibility */
	private String author;
	private String title;
	private String callNumber;
	private int id;
	
	private ILoan loan;
	private EBookState state;
	
	/** Construct an Book object with the specified attribute. */
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
	}//End of the constructor

	/** the method test the variables and throw exception if any of the parameter is null or blank
	* and the ID is less than or equal to zero
	*/
	private boolean sane(String author, String title, String callNumber, int bookID) {
		return  ( author != null     && !author.isEmpty()     &&
				  title != null      && !title.isEmpty()      &&
				  callNumber != null && !callNumber.isEmpty() &&
				  bookID > 0 
				);
	}

	/** the method associates the loan with the book and throws exception if the book is not available */
	@Override
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

	/** the method return the loan associated with the book and return null if the book is not current ON_LOAN */
	@Override
	public ILoan getLoan() {
		return loan;
	}

	
	@Override
	public void returnBook(boolean damaged) {
		if (!(state == EBookState.ON_LOAN || state == EBookState.LOST)) {	//throw exception if the book is not currently ON_LOAN
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		loan = null;
		if (damaged) {
			state = EBookState.DAMAGED;	//set the book state to damaged
		}
		else {
			state = EBookState.AVAILABLE;	//set the book state to available 
		}
	}

	
	@Override
	public void lose() {
		if (!(state == EBookState.ON_LOAN)) {	//throws an exception if the book is not currently ON_LOAN
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.LOST; //set the book state to lost
	}

	
	@Override
	public void repair() {
		if (!(state == EBookState.DAMAGED)) {	//throws exception if book is not currently damaged
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.AVAILABLE;	//set the book state to available
	}

	
	@Override
	public void dispose() {	//throws exception if the book is not currently available, damaged or lost
		if (!(state == EBookState.AVAILABLE || state == EBookState.DAMAGED || state == EBookState.LOST)) {	
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.DISPOSED;	//set the book state to disposed
	}

	/** get method return the current book state */
	@Override
	public EBookState getState() {
		return state;
	}

	/** the method return the author of the book */
	@Override
	public String getAuthor() {
		return author;
	}

	/** the method return the title of the book */
	@Override
	public String getTitle() {
		return title;
	}

	/** the method return the callNumber of the book */
	@Override
	public String getCallNumber() {
		return callNumber;
	}

	/** the method return the book's unique id */
	@Override
	public int getID() {
		return id;
	}

	/* To String method to display & return results in desired format. */
	@Override
	public String toString() {
		return String.format("Id: %d\nAuthor: %s\nTitle: %s\nCall Number %s",
				id, author, title, callNumber);
	}

}//End of Book class
