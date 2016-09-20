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
*The interface IScanner contains two static methods that enables the scanner to work and 
*adds a listener to it.
*/

public interface IScanner {
	/** Static method for the IMemberHelper interface */	
	public void addListener(IScannerListener listener);
	public void setEnabled(boolean enabled);
}