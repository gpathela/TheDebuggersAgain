/** Specifying the package in which the class resides */
package library.interfaces.daos;

/** Import necessary libraries for the code */
import java.util.Date;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface ILoanHelper */
public interface ILoanHelper {	
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate);
}
