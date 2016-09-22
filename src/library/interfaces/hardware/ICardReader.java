/** Specify the package in which the class resides. */
package library.interfaces.hardware;

/**
* @reviewer Chiranjivi Bashyal
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/
public interface ICardReader {	//Start of ICardReader interface
	
	/** Static methods for the ICardReader interface */
	public void addListener(ICardReaderListener listener);

	public void setEnabled(boolean enabled);

} //End of ICardReader interface