/** Specify the package in which the class resides */
package library.panels;

/** Import some libraries to be used in the code */
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The CompletedPanel class creates a panel to help the user of the application.
*/

/** Start of the class CompletedPanel */
public class CompletedPanel extends ABorrowPanel {

	/** Declare and initialise a variable with private access modifiers */
	private static final long serialVersionUID = 1L;

	/** The no args-constructor to create a CompletedPanel object  */
	public CompletedPanel() {
		setLayout(null);
		setBorder(new TitledBorder(null, "Completed", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(12, 23, 460, 640);
		//setBounds(12, 23, 614, 451);
		
		JLabel lblCancelled = new JLabel("Borrowing Completed");
		lblCancelled.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelled.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblCancelled.setBounds(12, 181, 436, 78);
		add(lblCancelled);		
	}
} // End of the class CompletedPanel