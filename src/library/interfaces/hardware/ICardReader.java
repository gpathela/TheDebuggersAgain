/** Specify the package in which the class resides */
package library.interfaces.hardware;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The interface ICardReader contains several static method to enable a card reading.
*/

public interface ICardReader {
	/** Static methods for the ICardReader interface */
	public void addListener(ICardReaderListener listener);
	public void setEnabled(boolean enabled);
}
