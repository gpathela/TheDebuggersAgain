/** Specifying the package in which the class resides */
package library.interfaces.entities;

/** Import necessary libraries for the code */
import java.util.List;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface IMember */
public interface IMember {
	
	/** Declare the variables that will be used in the class with private access modifiers */
	public static final int   LOAN_LIMIT = 5;
	public static final float FINE_LIMIT = 10.0f;	
	
	/** Static methods for the interface */
	public boolean hasOverDueLoans();
	public boolean hasReachedLoanLimit();
	public boolean hasFinesPayable();
	public boolean hasReachedFineLimit();
	public float getFineAmount();
	public void addFine(float fine);
	public void payFine(float payment);
	public void addLoan(ILoan loan);
	public List<ILoan> getLoans();
	public void removeLoan(ILoan loan);
	public EMemberState getState();
	public String getFirstName();
	public String getLastName();
	public String getContactPhone();
	public String getEmailAddress();
	public int getID();
}