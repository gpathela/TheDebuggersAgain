/** Import some Java libraries and specify the package in which the classes are organized */
package library.daos;

import java.util.Date;

import library.entities.Loan;
import library.interfaces.daos.ILoanHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
*@author Gourav Pathela
  
*/

/** Start of the LoanHelper */
public class LoanHelper implements ILoanHelper {

	@Override
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate) {

		return new Loan(book, borrower, borrowDate, dueDate);
	}

}
