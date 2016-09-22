/** Specify the package in which the class resides. */
package library.interfaces;

/**
* @reviewer Chiranjivi Bashyal
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IBorrowUIListener { //Start of IBorrowUIListener interface
	
	/** Static methods for the IBorrowUIListener interface */
	public void cancelled();
	
	public void scansCompleted();
	
	public void loansConfirmed();
	
	public void loansRejected();

} //End of IBorrowUIListener interface