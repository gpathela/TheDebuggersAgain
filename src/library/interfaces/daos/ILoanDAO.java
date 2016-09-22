/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.daos;

import java.util.Date;
import java.util.List;

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

public interface ILoanDAO {	//Start of ILoanDAO interface
	
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

}	//End of ILoanDAO interface
