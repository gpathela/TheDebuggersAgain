/** Specify the package in which the class resides */
package library.interfaces.hardware;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The interface ICardReaderListener contains one static method to enable a card reading.
*/

public interface ICardReaderListener {
	/** Static method for the ICardReaderListener interface */
	public void cardSwiped(int cardData);
}
