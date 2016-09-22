/** Specify the package in which the class resides */
package library.interfaces.entities;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

public interface IBook {//Start of IBook interface
	/** Static methods for the IBook interface */
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

}//End of IBook interface
