/** Specify the package in which the class resides */
package library.interfaces.entities;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The interface IBook contains several static method.
*/

public interface IBook {
	public void borrow(ILoan loan);
	public ILoan getLoan();
	public void returnBook(boolean damaged);
	public void lose();
	public void repair();
	public void dispose();	
	public EBookState getState();
	public String getAuthor();
	public String getTitle();
	public String getCallNumber();
	public int getID();
}
