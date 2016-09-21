/** Specify the package in which the class resides */
package library.interfaces.hardware;

/** Import some libraries to be used in the code */
import javax.swing.JPanel;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy 
*@due date 29.09.2016
*@version 1.2
*
*The interface IDisplay contains one static method to enable the display of a panel
*/

public interface IDisplay {
	/** Static method for the ICardReaderListener interface */
	public void setDisplay(JPanel panel);	
}
