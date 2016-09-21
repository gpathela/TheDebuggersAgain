/** Import some Java libraries and specify the package in which the classes are organized*/
package library.daos;

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
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.0
*
*		The LoanMapDAO class is the class that handle all loans. It check if loan is overdue, it find all loans by member, it finds all loans for the book etc. 
*/

/** Start of the class LoanMapDAO */
public class LoanMapDAO implements ILoanDAO {

	/**
	 * Declare the variable for the class with private visibility modifiers
	 */
	private int nextID;
	private Map<Integer, ILoan> loanMap;
	private ILoanHelper helper;
	private Calendar cal;

	public LoanMapDAO(ILoanHelper helper) { // Public constructor that take object of ILoanHelper class
		if (helper == null) {
			throw new IllegalArgumentException(String.format("LoanMapDAO : constructor : helper cannot be null."));
		}
		nextID = 0;
		this.helper = helper;
		loanMap = new HashMap<Integer, ILoan>();
		cal = Calendar.getInstance();
	}

	public LoanMapDAO(ILoanHelper helper, Map<Integer, ILoan> loanMap) { // Public constructor that take object of ILoanHelper class and
																			// Map
																			// objects
																			// of
																			// ILoan
		this(helper);
		if (loanMap == null) {
			throw new IllegalArgumentException(String.format("LoanMapDAO : constructor : loanMap cannot be null."));
		}
		this.loanMap = loanMap;
	}

	@Override
	public ILoan getLoanByID(int id) {	//Method to get loan by Id
		if (loanMap.containsKey(Integer.valueOf(id))) {
			return loanMap.get(Integer.valueOf(id));
		}
		return null;
	}

	@Override
	public ILoan getLoanByBook(IBook book) {	//Method to get loan by book
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

	@Override
	public List<ILoan> listLoans() {	//Method to generate list of all loans
		List<ILoan> list = new ArrayList<ILoan>(loanMap.values());
		return Collections.unmodifiableList(list);
	}

	@Override
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

	@Override
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

	@Override
	public void updateOverDueStatus(Date currentDate) {	//Method to update status of a loan
		for (ILoan loan : loanMap.values()) {
			loan.checkOverDue(currentDate);
		}
	}

	@Override
	public List<ILoan> findOverDueLoans() {	//Method to find all overdue loans
		List<ILoan> list = new ArrayList<ILoan>();
		for (ILoan loan : loanMap.values()) {
			if (loan.isOverDue()) {
				list.add(loan);
			}
		}
		return Collections.unmodifiableList(list);
	}

	private int getNextId() {
		return ++nextID;
	}

	@Override
	public ILoan createLoan(IMember borrower, IBook book) {	//Method to create loan
		Date borrowDate = new Date();
		cal.setTime(borrowDate);
		cal.add(Calendar.DATE, ILoan.LOAN_PERIOD);
		Date dueDate = cal.getTime();
		ILoan loan = helper.makeLoan(book, borrower, borrowDate, dueDate);
		return loan;
	}

	@Override
	public void commitLoan(ILoan loan) {	//Method to commit loan to loan Map
		int id = getNextId();
		loan.commit(id);
		loanMap.put(id, loan);
	}

}
