/** Specify the package in which the class resides */
package library.daos;

/** Import some libraries to be used in the code */
import java.util.Date;
import library.entities.Loan;
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

/** Start of the class LoanHelper */
public class LoanHelper implements ILoanHelper {

	/** Override the makeLoan method */
	@Override
	/** The method makeLoan makes a loan and returns the new made loan */
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate) {
		return new Loan(book, borrower, borrowDate, dueDate);
	}
} // End of the class LoanHelper