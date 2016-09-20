/** Specify the package in which the class resides */
package library.interfaces.daos;

/** Import some libraries to be used in the code */
import java.util.Date;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The interface ILoanHelper contains one static method that creates a loan object.
*/

public interface ILoanHelper {
	
	/** Static method for the ILoanDAO interface */	
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate);
}