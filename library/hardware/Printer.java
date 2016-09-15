/** Specifying the package in which the class resides */
package library.hardware;

/** Import necessary libraries for the code */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import library.interfaces.hardware.IPrinter;
import javax.swing.JTextArea;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*
*	The Printer class is a program that creates an interface and prints the data that a user requests.
*/

/** Start of the class Printer */
public class Printer extends JFrame implements IPrinter {
	
	/** Declare and initialise the variables that will be used in the class with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	/** Constructor for a Printer object */
	public Printer() {
        setBounds(50, 450, 400, 350);
		setResizable(false);
		setTitle("Printer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Printer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 20, 400, 280);
		getContentPane().add(panel);
		panel.setLayout(null);
		

		textArea = new JTextArea();
		textArea.setEditable(false);
		//textArea.setBounds(10, 20, 375, 280);
		//textArea.setColumns(40);
		//textArea.setRows(80);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 20, 375, 280);
		panel.add(scrollPane);
	}
	
	/** Override the print() method */
	@Override
	/** The method print() displays the data requested by the user in a GUI */
	public void print(String printData) {
		textArea.setText(printData);
		textArea.setCaretPosition(textArea.getLineCount());		
	}
} // End of the class Printer