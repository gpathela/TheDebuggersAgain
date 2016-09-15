/** Specifying the package in which the class resides */
package library.panels.borrow;

/** Import necessary libraries for the code */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import library.interfaces.IBorrowUIListener;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 1.1
*
*	The ScanningPanel class is a program that ....
*/

/** Start of the class ScanningPanel */
public class ScanningPanel extends ABorrowPanel {

	/** Declare and initialise the variables that will be used in the class with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JLabel lblBorrowerId;
	private JLabel lblBorrowerName;
	private JLabel lblBorrowerContact;
	private JLabel lblOverdue;
	private JLabel lblLoanLimit;
	private JLabel lblFineLimit;
	private JButton btnCompleted;
	private JButton btnCancel;
	private JTextArea existingLoanListTA;
	private JLabel lblErrMesg;
	private JTextArea currentBookTA;
	private JTextArea pendingLoanListTA;
	
	/** Constructor for a ScanningPanel object */
	public ScanningPanel(IBorrowUIListener listener) {
		setLayout(null);
		setBorder(new TitledBorder(null, "Scanning", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(12, 23, 460, 640);
		// imported from elsewhere
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Current Loan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 289, 434, 242);
		this.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pending Loan List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 107, 414, 126);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane pendingLoanListSCL = new JScrollPane();
		pendingLoanListSCL.setBounds(10, 18, 394, 96);
		panel_4.add(pendingLoanListSCL);
		
		pendingLoanListTA = new JTextArea();
		pendingLoanListTA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pendingLoanListSCL.setViewportView(pendingLoanListTA);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Current Book", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 18, 414, 89);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane currentBookSCL = new JScrollPane();
		currentBookSCL.setBounds(10, 18, 394, 60);
		panel_5.add(currentBookSCL);
		
		currentBookTA = new JTextArea();
		currentBookTA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		currentBookTA.setEditable(false);
		currentBookSCL.setViewportView(currentBookTA);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Borrower Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 25, 434, 252);
		this.add(panel_3);
		
		JLabel lbl_11 = new JLabel("Id: ");
		lbl_11.setBounds(12, 20, 20, 14);
		panel_3.add(lbl_11);
		
		lblBorrowerId = new JLabel("123");
		lblBorrowerId.setForeground(Color.BLUE);
		lblBorrowerId.setBackground(Color.LIGHT_GRAY);
		lblBorrowerId.setBounds(32, 20, 46, 14);
		panel_3.add(lblBorrowerId);
		
		JLabel label = new JLabel("Name: ");
		label.setBounds(81, 20, 46, 14);
		panel_3.add(label);
		
		lblBorrowerName = new JLabel("Fred Nurke");
		lblBorrowerName.setForeground(Color.BLUE);
		lblBorrowerName.setBackground(Color.LIGHT_GRAY);
		lblBorrowerName.setBounds(126, 21, 156, 14);
		panel_3.add(lblBorrowerName);
		
		JLabel label_2 = new JLabel("Contact:");
		label_2.setBounds(282, 21, 56, 14);
		panel_3.add(label_2);
		
		lblBorrowerContact = new JLabel("02 63384931");
		lblBorrowerContact.setForeground(Color.BLUE);
		lblBorrowerContact.setBounds(338, 21, 86, 14);
		panel_3.add(lblBorrowerContact);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(null, "Existing Loans", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 112, 414, 129);
		panel_3.add(panel_6);
		
		JScrollPane existingLoanListSCL = new JScrollPane();
		existingLoanListSCL.setBounds(10, 22, 394, 96);
		panel_6.add(existingLoanListSCL);
		
		existingLoanListTA = new JTextArea();
		existingLoanListTA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		existingLoanListTA.setEditable(false);
		existingLoanListTA.setBackground(new Color(248, 248, 248));
		existingLoanListSCL.setViewportView(existingLoanListTA);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(null, "Borrowing Restrictions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 46, 414, 66);
		panel_3.add(panel_7);
		
		lblOverdue = new JLabel("");
		lblOverdue.setForeground(Color.RED);
		lblOverdue.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOverdue.setBounds(10, 18, 354, 14);
		panel_7.add(lblOverdue);
		
		lblFineLimit = new JLabel("");
		lblFineLimit.setForeground(Color.RED);
		lblFineLimit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFineLimit.setBounds(10, 32, 354, 14);
		panel_7.add(lblFineLimit);
		
		lblLoanLimit = new JLabel("");
		lblLoanLimit.setForeground(Color.RED);
		lblLoanLimit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblLoanLimit.setBounds(10, 46, 354, 14);
		panel_7.add(lblLoanLimit);
		
		btnCompleted = new JButton("Completed");
		btnCompleted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.scansCompleted();
			}
		});
		btnCompleted.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCompleted.setBounds(69, 544, 127, 35);
		add(btnCompleted);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.cancelled();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(271, 544, 127, 35);
		add(btnCancel);
		
		lblErrMesg = new JLabel();
		lblErrMesg.setForeground(Color.RED);
		lblErrMesg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblErrMesg.setBounds(12, 592, 434, 29);
		this.add(lblErrMesg);	
	}

	/** Override the displayMemberDetails() method */
	@Override
	/** The method displayMemberDetails()  */
	public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
		lblBorrowerId.setText(Integer.valueOf(memberID).toString());
		lblBorrowerName.setText(memberName);
		lblBorrowerContact.setText(memberPhone);
	}

	/** Override the displayExistingLoan() method */
	@Override
	/** The method displayExistingLoan() displays the details of a loan if it exists */	
	public void displayExistingLoan(String loanDetails) {
		insertStringInTA(loanDetails, existingLoanListTA, true);
	}
	
	/** Override the displayOutstandingFineMessage() method */
	@Override
	/** The method displayOutstandingFineMessage() displays a message about outstanding fine */
	public void displayOutstandingFineMessage(float amountOwing) {
		lblFineLimit.setText(String.format("Borrower has outstanding fines. Amount owing: $%.2f", amountOwing ));
	}
	
	/** Override the displayScannedBookDetails() method */
	@Override
	/** The method displayScannedBookDetails() displays the details of a scanned book */
	public void displayScannedBookDetails(String bookDetails) {
		currentBookTA.setText(bookDetails);
	}

	/** Override the displayPendingLoan() method */
	@Override
	/** The method displayPendingLoan() displays the details of a pending loan */
	public void displayPendingLoan(String loanDetails) {
		pendingLoanListTA.setText(loanDetails);
	}

	/** The method insertStringInTA() appends a string to a text area */
	private void insertStringInTA(String string, JTextArea ta, boolean append) {
		StringBuilder bld = new StringBuilder();
		if (append) {
			bld.append(ta.getText());
		}
		if (bld.length() > 0) {
			bld.append("\n\n");
		}
		bld.append(string);
		ta.setText(bld.toString());
		ta.setCaretPosition(0);		
	}
	
	/** Override the displayErrorMessage() method */
	@Override
	/** The method displayErrorMessage() displays error messages  */
	public void displayErrorMessage(String errorMesg) {
		lblErrMesg.setText(errorMesg);		
	}
} // End of the class ScanningPanel