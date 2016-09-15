/** Specifying the package in which the class resides */
package library.interfaces.hardware;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface IScanner */
public interface IScanner {
	public void addListener(IScannerListener listener);
	public void setEnabled(boolean enabled);
}
