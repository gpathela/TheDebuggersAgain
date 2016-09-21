/** Specify the package in which the class resides */
package library.daos;

/** Import some libraries to be used in the code */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.daos.ILoanHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*/

/** Start of the class LoanMapDAO */
public class LoanMapDAO implements ILoanDAO {

	/** Declare variables with private access modifiers */
	private int nextID;
	private Map<Integer, ILoan> loanMap;
	private ILoanHelper helper;
	private Calendar cal;

	/** The constructor for a LoanMapDAO object which takes a parameter of variables */
	public LoanMapDAO(ILoanHelper helper) { // Public constructor that take
											// object of ILoanHelper class
		if (helper == null) {
			throw new IllegalArgumentException(String.format("LoanMapDAO : constructor : helper cannot be null."));
		}
		nextID = 0;
		this.helper = helper;
		loanMap = new HashMap<Integer, ILoan>();
		cal = Calendar.getInstance();
	}

	/** The public constructor LoanMapDAO takes an object of ILoanHelper class and Map objects of ILoan */
	public LoanMapDAO(ILoanHelper helper, Map<Integer, ILoan> loanMap) { 
		this(helper);
		if (loanMap == null) {
			throw new IllegalArgumentException(String.format("LoanMapDAO : constructor : loanMap cannot be null."));
		}
		this.loanMap = loanMap;
	}

	/** Override the getLoanByID method */
	@Override
	/** The method getLoanByID returns a loan by using it's ID */
	public ILoan getLoanByID(int id) {
		if (loanMap.containsKey(Integer.valueOf(id))) {
			return loanMap.get(Integer.valueOf(id));
		}
		return null;
	}

	/** Override the getLoanByBook method */
	@Override
	/** The method getLoanByBook returns a loan by using a Book object */
	public ILoan getLoanByBook(IBook book) {
		if (book == null) {
			throw new IllegalArgumentException(String.format("LoanMapDAO : getLoanByBook : book cannot be null."));
		}
		for (ILoan loan : loanMap.values()) {
			IBook tempBook = loan.getBook();
			if (book.equals(tempBook)) {
				return loan;
			}
		}
		return null;
	}

	/** Override the listLoans method */
	@Override
	/** The method listLoans gernerates a list of all loans */
	public List<ILoan> listLoans() {
		List<ILoan> list = new ArrayList<ILoan>(loanMap.values());
		return Collections.unmodifiableList(list);
	}

	/** Override the findLoansByBorrower method */
	@Override
	/** The method findLoansByBorrower returns a collection of loans by borrower */
	public List<ILoan> findLoansByBorrower(IMember borrower) {	//Method to find all loans by a member
		if (borrower == null) {
			throw new IllegalArgumentException(
					String.format("LoanMapDAO : findLoansByBorrower : borrower cannot be null."));
		}
		List<ILoan> list = new ArrayList<ILoan>();
		for (ILoan loan : loanMap.values()) {
			if (borrower.equals(loan.getBorrower())) {
				list.add(loan);
			}
		}
		return Collections.unmodifiableList(list);
	}

	/** Override the findLoansByBookTitle method */
	@Override
	/** The method findLoansByBookTitle returns a collection of loans by book title */
	public List<ILoan> findLoansByBookTitle(String title) {	//Method to find loans on book title
		if (title == null || title.isEmpty()) {
			throw new IllegalArgumentException(
					String.format("LoanMapDAO : findLoansByBookTitle : title cannot be null or blank."));
		}
		List<ILoan> list = new ArrayList<ILoan>();
		for (ILoan loan : loanMap.values()) {
			String tempTitle = loan.getBook().getTitle();
			if (title.equals(tempTitle)) {
				list.add(loan);
			}
		}
		return Collections.unmodifiableList(list);
	}

	/** Override the updateOverDueStatus method */
	@Override
	/** The method updateOverDueStatus updates the status of a loan*/
	public void updateOverDueStatus(Date currentDate) {	
		for (ILoan loan : loanMap.values()) {
			loan.checkOverDue(currentDate);
		}
	}

	/** Override the findOverDueLoans method */
	@Override
	/** The method findOverDueLoans returns a collection of overdue loans */
	public List<ILoan> findOverDueLoans() {	
		List<ILoan> list = new ArrayList<ILoan>();
		for (ILoan loan : loanMap.values()) {
			if (loan.isOverDue()) {
				list.add(loan);
			}
		}
		return Collections.unmodifiableList(list);
	}

	/** The method getNextId returns the next index of a loan */
	private int getNextId() {
		return ++nextID;
	}

	/** Override the  method */
	@Override
	/** The method createLoan returns a created loan based on a book and borrower objects*/
	public ILoan createLoan(IMember borrower, IBook book) {	//Method to create loan
		Date borrowDate = new Date();
		cal.setTime(borrowDate);
		cal.add(Calendar.DATE, ILoan.LOAN_PERIOD);
		Date dueDate = cal.getTime();
		ILoan loan = helper.makeLoan(book, borrower, borrowDate, dueDate);
		return loan;
	}

	/** Override the commitLoan method */
	@Override
	/** The method commitLoan commits a loan to a loan map */
	public void commitLoan(ILoan loan) {
		int id = getNextId();
		loan.commit(id);
		loanMap.put(id, loan);
	}
} // End of the class LoanMapDAO