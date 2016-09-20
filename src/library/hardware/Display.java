/** Import some Java libraries and specify the package in which the classes are organized */
package library.hardware;

/** Import some libraries to be used in the code */
import javax.swing.JFrame;
import javax.swing.JPanel;
import library.interfaces.hardware.IDisplay;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The Display
*/

/** Start of the class Display */
public class Display extends JFrame implements IDisplay {

	private static final long serialVersionUID = 1L;
	
	public Display() {
		setTitle("Display");
		setBounds(500, 50, 470, 680);
        //setBounds(500, 100, 750, 615);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}


	@Override
	public void setDisplay(JPanel panel) {
        getContentPane().add(panel, null);		
	}	
} // End of the class Display