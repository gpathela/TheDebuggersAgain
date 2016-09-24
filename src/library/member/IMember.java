/** Import some Java libraries and specify the package in which the classes resides */
package library.interfaces.entities;

import java.util.List;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IMember { //Start of IMember interface
	/** Static methods for the IMember interface */
	public static final int   LOAN_LIMIT = 5;
	
	public static final float FINE_LIMIT = 10.0f;	
	
	
	public boolean hasOverDueLoans();
	
	public boolean hasReachedLoanLimit();
	
	public boolean hasFinesPayable();
	
	public boolean hasReachedFineLimit();
	
	public float   getFineAmount();
	
	public void    addFine(float fine);

	public void    payFine(float payment);
	
	public void    addLoan(ILoan loan);
	
	public List<ILoan> getLoans();
	
	public void    removeLoan(ILoan loan);
	
	public EMemberState   getState();
	
	public String  getFirstName();
	
	public String  getLastName();
	
	public String  getContactPhone();
	
	public String  getEmailAddress();
	
	public int     getID();
	

}//End of IMember interface
