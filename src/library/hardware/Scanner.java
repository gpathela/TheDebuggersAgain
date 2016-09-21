/** Specify the package in which the class resides */
package library.hardware;

/** Import some libraries to be used in the code */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import library.interfaces.hardware.IScanner;
import library.interfaces.hardware.IScannerListener;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The class Scanner 
*/

/** Start of the class Scanner */
public class Scanner extends JFrame implements IScanner {

	/** Declare and initialise variables with private access modifiers */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnScan;
	private IScannerListener listener;

	/** The no-args constructor for a Scanner object */
	public Scanner() {
		setTitle("Scanner");
        setBounds(50, 250, 400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Scanner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 400, 200);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblErrorMesg = new JLabel("");
		lblErrorMesg.setForeground(Color.RED);
		lblErrorMesg.setBounds(12, 21, 358, 16);
		panel.add(lblErrorMesg);
		
		JLabel lblNewLabel = new JLabel("Enter Book Barcode: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 50, 150, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				lblErrorMesg.setText("");
			}
		});
		textField.setBounds(190, 50, 150, 25);
		panel.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		btnScan = new JButton("Scan Book Barcode");
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (listener == null) {
					throw new RuntimeException("Scanner: listener is null");
				}
				String text = textField.getText();
				try {
					int barcode = new Integer(text).intValue();
					if (barcode <= 0) {
						throw new NumberFormatException();
					}
					listener.bookScanned(barcode);
				}
				catch (NumberFormatException e) {
					//e.printStackTrace(System.err);
					lblErrorMesg.setText("Book barcode must be a positive intger");
				}
				textField.setText("");
			}
		});
		btnScan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnScan.setBounds(85, 88, 215, 39);
		panel.add(btnScan);
		//pack();
	}

	/** Override the setEnabled method */
	@Override
	/** The method setEnabled enables both the scan button and the text field */
	public void setEnabled(boolean enabled) {
		btnScan.setEnabled(enabled);
		textField.setEditable(enabled);
	}

	/** Override the addListener method */
	@Override
	/** The method addListener adds a listener to the class */
	public void addListener(IScannerListener listener) {
		this.listener = listener;	
	}
} // End of the class Scanner