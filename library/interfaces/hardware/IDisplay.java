/** Specifying the package in which the class resides */
package library.interfaces.hardware;

/** Import necessary libraries for the code */
import javax.swing.JPanel;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*/

/** Start of the interface ICardReaderListener */
public interface IDisplay {
	public JPanel getDisplay();
	public void setDisplay(JPanel panel, String identifier);
}
