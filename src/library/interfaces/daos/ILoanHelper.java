/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.daos;

import java.util.Date;

import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
* @reviewer Chiranjivi Bashyal
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface ILoanHelper {	//Start of ILoanHelper interface
	
	/** Static methods for the ILoanHelper interface */
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate);

}//End of ILoanHelper interface
