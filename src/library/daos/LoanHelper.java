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
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.0
*
* The LoanHelper class is a class that implements ILoanHelper. 
* The class creates an object of ILoanHelper and returns new Loan.  
*/

/** Start of the LoanHelper  class*/
public class LoanHelper implements ILoanHelper {

	/** Override the makeLoan method */
	@Override
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate) {

		return new Loan(book, borrower, borrowDate, dueDate);
	}

}
