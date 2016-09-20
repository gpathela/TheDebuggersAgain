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
*The interface IScannerListener contains one static method that enables the scan od a book.
*/

public interface IScannerListener {
	/** Static method for the IScannerListener interface */	
	public void bookScanned(int barcode);
}