/** Specify the package in which the class resides */
package library.hardware;

/** Import some libraries to be used in the code */
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
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The class Printer creates a Printer object and has one method that outputs data to the screen.
*/

/** Start of the class Printer */
public class Printer extends JFrame implements IPrinter {
	/** Declare variables with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	/** The no-args constructor for a Printer object */
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 375, 280);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 20, 375, 280);
		panel.add(textArea);		
	}

	/** Override the print method */
	@Override
	/** The method print displays texts to the screen */
	public void print(String printData) {
		StringBuilder bld = new StringBuilder();
		bld.append(textArea.getText());
		if (bld.length() > 0) {
			bld.append("\n\n");
		}
		bld.append(printData);
		textArea.setText(bld.toString());
		textArea.setCaretPosition(0);		
	}
} // End of the class Printer