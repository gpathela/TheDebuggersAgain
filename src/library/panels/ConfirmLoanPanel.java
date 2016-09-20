/** Specify the package in which the class resides */
package library.panels;

/** Import some libraries to be used in the code */
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import library.interfaces.IBorrowUIListener;
import java.awt.Font;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The ConfirmLoanPanel class creates an object that displays a panel in which a message is 
*sent to the user when a loan is confirmed.
*/

/** Start of the class ConfirmLoanPanel */
public class ConfirmLoanPanel extends ABorrowPanel {
	/** Declare and initialise a variable with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JTextArea loanListTA;

	/** The constructor to create a ConfirmLoanPanel object  */
	public ConfirmLoanPanel(IBorrowUIListener listener) {
		setLayout(null);
		setBorder(new TitledBorder(null, "Confirm Loans", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(12, 23, 460, 640);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Current Loan List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 24, 415, 496);
		this.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 395, 463);
		panel.add(scrollPane);
		
		loanListTA = new JTextArea();
		loanListTA.setEditable(false);
		scrollPane.setViewportView(loanListTA);

		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.loansRejected();
			}
		});
		btnReject.setBounds(173, 533, 115, 35);
		this.add(btnReject);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.loansConfirmed();
			}
		});
		btnConfirm.setBounds(30, 533, 115, 35);
		this.add(btnConfirm);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.cancelled();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(312, 533, 115, 35);
		add(button);
	}

	/** Override the displayConfirmingLoan method */
	@Override
	/** This method displays the confirmation of a loan to the screen */
	public void displayConfirmingLoan(String loanDetails) {
		StringBuilder bld = new StringBuilder(loanListTA.getText());
		bld.append(loanDetails + "\n\n");
		loanListTA.setText(bld.toString());
		loanListTA.setCaretPosition(0);
	}
} // End of the class ConfirmLoanPanel