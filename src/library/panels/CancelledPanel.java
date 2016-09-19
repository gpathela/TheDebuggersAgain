/** Import some Java libraries and specify the package in which the classes are organized */
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
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The BorrowUC_UI 
*/

/** Start of the class CancelledPanel */
public class CancelledPanel extends ABorrowPanel {

	/** Declare and initialise a variable with private access modifiers */
	private static final long serialVersionUID = 1L;

	 /** The no args-constructor to create a CancelledPanel object  */
	public CancelledPanel() {
		setLayout(null);
		setBorder(new TitledBorder(null, "Cancelled", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(12, 23, 460, 640);
		
		JLabel lblCancelled = new JLabel("Cancelled");
		lblCancelled.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelled.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblCancelled.setBounds(12, 187, 436, 78);
		add(lblCancelled);		
	}
} // End of the class CancelledPanel