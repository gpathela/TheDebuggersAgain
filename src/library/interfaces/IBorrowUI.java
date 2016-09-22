/** Specify the package in which the class resides */
package library.interfaces;

/**
* @reviewer Chiranjivi Bashyal
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IBorrowUI { //Start of IBorrowUI interface
	
	/** Static methods for the IBorrowUI interface */
	public void setState(EBorrowState state);
	
	public void displayMemberDetails(int memberID, String memberName, String memberPhone);

	public void displayExistingLoan(String loanDetails);

	public void displayOverDueMessage();
	
	public void displayAtLoanLimitMessage();
	
	public void displayOutstandingFineMessage(float amountOwing);

	public void displayOverFineLimitMessage(float amountOwing);

	public void displayScannedBookDetails(String bookDetails);

	public void displayPendingLoan(String loanDetails);
	
	public void displayConfirmingLoan(String loanDetails);
	
	public void displayErrorMessage(String errorMesg);
	
}  //End of IBorrowUI interface