/** Import some Java libraries and specify the package in which the classes resides. */
package library.hardware;

import javax.swing.JFrame;
import javax.swing.JPanel;

import library.interfaces.hardware.IDisplay;

/**
* @reviewer Chiranjivi Bashyal
* @Student ID: 11582726
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.1
*/

/** Start of the class Display */
public class Display extends JFrame implements IDisplay {
	
	/** Declare and initialize the variable for the class
		with private visibility */
	private static final long serialVersionUID = 1L;
	
	/** The no args-constructor(default constructor) to create a Display object */ 
	public Display() {
		setTitle("Display");
		setBounds(500, 50, 470, 680);
        //setBounds(500, 100, 750, 615);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	/** Override the setDisplay method */
	@Override
	public void setDisplay(JPanel panel) {
        getContentPane().add(panel, null);		
	}
	
}// End of the class Display