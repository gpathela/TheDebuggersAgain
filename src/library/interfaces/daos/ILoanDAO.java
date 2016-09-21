/** Specify the package in which the class resides */
package library.interfaces.daos;

/** Import some libraries to be used in the code */
import java.util.Date;
import java.util.List;
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
*
*The interface ILoanDAO contains several static methods to enable the display of a panel
*/

public interface ILoanDAO {
	
	/** Static methods for the ILoanDAO interface */	
	public ILoan createLoan(IMember borrower, IBook book);
	public void commitLoan(ILoan loan);
	public ILoan getLoanByID(int id);
	public ILoan getLoanByBook(IBook book);
	public List<ILoan> listLoans();
	public List<ILoan> findLoansByBorrower(IMember borrower);
	public List<ILoan> findLoansByBookTitle(String title);
	public void updateOverDueStatus(Date currentDate);
	public List<ILoan> findOverDueLoans();
}