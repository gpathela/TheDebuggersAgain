/** Specify the package in which the class resides */
package library.interfaces;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The interface IBorrowUI contains several static method.
*/

public interface IBorrowUIListener {
	/** Static methods for the IBorrowUI interface */
	public void cancelled();
	public void scansCompleted();
	public void loansConfirmed();
	public void loansRejected();
}
