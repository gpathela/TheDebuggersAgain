/** Specifying the package in which the class resides */
package library.hardware;

/** Import necessary libraries for the code */
import library.interfaces.hardware.IDisplay;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

/**
*@author Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*
*	The Display class is a program that contains the code to display a GUI and collects
*	a member's ID when he or she swipes their card.
*/

/** Start of the class Display */
public class Display extends JFrame implements IDisplay {

	/** Declare and initialise the variables that will be used in the class with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JPanel current; 

	/** Constructor for a Display object */
	public Display() {
		setTitle("Display");
		setBounds(500, 50, 470, 680);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		getContentPane().setLayout(new CardLayout(0, 0));
	}

	/** Override the getDisplay() method */
	@Override
	/** The method getDisplay returns the current window display */
	public JPanel getDisplay() {
		return current;		
	}
	
	/** Override the setDisplay() method */
	@Override
	/** The method setDisplay sets the display of the current panel */
	public void setDisplay(JPanel panel, String id) {
		getContentPane().add(panel, id);
		CardLayout cardLayout = (CardLayout) (getContentPane().getLayout());
		cardLayout.show(getContentPane(), id);
		if (current != null) {
			System.out.println("Display.setDisplay: removing current");
			cardLayout.removeLayoutComponent(current);
		}
		current = panel;
	}	
} // End of the class Display