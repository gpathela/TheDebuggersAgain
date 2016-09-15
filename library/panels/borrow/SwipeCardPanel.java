/** Specifying the package in which the class resides */
package library.panels.borrow;

/** Import necessary libraries for the code */
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import library.interfaces.IBorrowUIListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*
*	The SwipeCardPanel class is a program that ....
*/

/** Start of the class SwipeCardPanel */
public class SwipeCardPanel extends ABorrowPanel {

	/** Declare and initialise the variables that will be used in the class with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JLabel lblErrMesg;

	/** Constructor for a SwipeCardPanel object */
	public SwipeCardPanel(IBorrowUIListener listener) {
		setLayout(null);
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Borrow Book - Initialized", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBounds(12, 23, 460, 640);
		//setBounds(12, 23, 614, 451);
		
		JLabel lblSwipeCard = new JLabel("Swipe Card Please");
		lblSwipeCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwipeCard.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblSwipeCard.setBounds(12, 181, 436, 78);
		add(lblSwipeCard);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.cancelled();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(170, 320, 127, 35);
		add(btnCancel);
		
		lblErrMesg = new JLabel();
		lblErrMesg.setForeground(Color.RED);
		lblErrMesg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblErrMesg.setBounds(12, 592, 434, 29);
		this.add(lblErrMesg);

	}

	/** Override the displayMemberDetails() method */
	@Override
	/** The method displayErrorMessage() displays an error message to the screen */
	public void displayErrorMessage(String errorMesg) {
		lblErrMesg.setText(errorMesg);		
	}
} // End of the class SwipeCardPanel
