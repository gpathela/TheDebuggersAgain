/** Import some Java libraries and specify the package in which the classes resides. */
package library.interfaces.entities;

import java.util.Date;

/**
* @reviewer Chiranjivi Bashyal
* @Student ID: 11582726
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface ILoan {	//Start of ILoan interface
	/** Static methods for the ILoan interface */
	public static final int LOAN_PERIOD = 14;
	
	
	public void commit(int id);
	
	public void complete();
	
	public boolean isOverDue();
	
	public boolean checkOverDue(Date currentDate);
	
	public IMember getBorrower();
	
	public IBook getBook();
	
	public int getID();
	

}	//End of ILoan interface