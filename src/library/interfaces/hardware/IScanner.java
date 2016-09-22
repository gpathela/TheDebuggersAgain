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

public interface IScanner { //Start of IScanner interface
	
	/** Static methods for the IScanner interface */
	public void addListener(IScannerListener listener);
	
	public void setEnabled(boolean enabled);

} //End of IScanner interface