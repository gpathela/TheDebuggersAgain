/** Specify the package in which the class resides */
package library.panels.borrow;

/** Import some libraries to be used in the code */
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
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The class SwipeCardPanel creates a SwipeCardPanel object and displays an error message 
*when needed.
*/

/** Start of the class SwipeCardPanel */
public class SwipeCardPanel extends ABorrowPanel {
	/** Declare and initialise variables with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JLabel lblErrMesg;

	/** The constructor for a SwipeCardPanel object which takes a parameter of one variable */
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

	/** Override the displayErrorMessage method */
	@Override
	/** The method displayErrorMessage outputs an error message to the screen */ 
	public void displayErrorMessage(String errorMesg) {
		lblErrMesg.setText(errorMesg);		
	}	
} // End of the class SwipeCardPanel