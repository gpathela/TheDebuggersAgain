/** Specify the package in which the class resides */
package library.interfaces.entities;

/** Import some libraries to be used in the code */
import java.util.Date;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy 
*@due date 29.09.2016
*@version 1.2
*
*The interface ILoan contains several static methods to enable the display of a panel
*/

public interface ILoan {
	/** Declare and initialise a variable with private access modifiers */
	public static final int LOAN_PERIOD = 14;
	
	/** Static method for the ICardReaderListener interface */
	public void commit(int id);
	public void complete();
	public boolean isOverDue();
	public boolean checkOverDue(Date currentDate);
	public IMember getBorrower();
	public IBook getBook();
	public int getID();
}