/** Specifying the package in which the class resides */
package library.interfaces.entities;

/** Import necessary libraries for the code */
import java.util.Date;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface ILoan */
public interface ILoan {

	/** Declare the variables that will be used in the class with private access modifiers */
	public static final int LOAN_PERIOD = 14;
	
	/** The static methods of the interface */
	public void commit(int id);
	public void complete();
	public boolean isOverDue();
	public boolean checkOverDue(Date currentDate);
	public IMember getBorrower();
	public IBook getBook();
	public int getID();
}