/** Specify the package in which the class resides */
package library.panels;

/** Import some libraries to be used in the code */
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import library.interfaces.IMainListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The class MainPanel sets the border, layout, creates two labels and one button for the main panel.  
*/

/** Start of the class MainPanel */
public class MainPanel extends JPanel {

	/** Declare and initialise the variable with private access modifiers */
	private static final long serialVersionUID = 1L;

	/** The public constructor for a MainPanel object which takes a parameter of variables */
	public MainPanel(IMainListener listener) {
		setBorder(new TitledBorder(null, "Main Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(500, 50, 470, 680);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Backwoods Regional Library");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(12, 27, 446, 32);
		add(lblNewLabel);
		
		JLabel lblSelfServiceSystem = new JLabel("Self Service System");
		lblSelfServiceSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelfServiceSystem.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSelfServiceSystem.setBounds(12, 61, 446, 32);
		add(lblSelfServiceSystem);
		
		JButton btnBorrowBooks = new JButton("Borrow Books");
		btnBorrowBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.borrowBooks();
			}
		});
		btnBorrowBooks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBorrowBooks.setBounds(141, 138, 155, 37);
		add(btnBorrowBooks);
        //setBounds(500, 100, 750, 615);
	}
} // End of the class MainPanel