/** Specify the package in which the class resides */
package library;

/** Import some libraries to be used in the code */
import library.hardware.CardReader;
import library.hardware.Display;
import library.hardware.Printer;
import library.hardware.Scanner;
import java.util.Calendar;
import java.util.Date;
import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.daos.LoanHelper;
import library.daos.LoanMapDAO;
import library.daos.MemberHelper;
import library.daos.MemberMapDAO;
import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.daos.IMemberDAO;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 29.09.2016
*@version 1.2
*
*The Main class sets several GUI objects to visible and creates an array of books and members
*with different statuses. 
*/

/** Start of the class Main */
public class Main {

	/** Declare and initialise variables with private access modifiers */
	private static CardReader reader;
	private static Scanner scanner;
	private static Printer printer;
	private static Display display;
	private static IBookDAO bookDAO;
	private static ILoanDAO loanDAO;
	private static IMemberDAO memberDAO;
	// private static BorrowUC_CTL control;

	/** The method showGUI displays the reader, scanner, printer, and display GUIs to visible */
	public static void showGUI() { 
		reader.setVisible(true);
		scanner.setVisible(true);
		printer.setVisible(true);
		display.setVisible(true);
	}

	/** Start of the main method */
	public static void main(String[] args) { 
		/** Declare variables */
		bookDAO = new BookMapDAO(new BookHelper());
		loanDAO = new LoanMapDAO(new LoanHelper());
		memberDAO = new MemberMapDAO(new MemberHelper());

		reader = new CardReader();
		scanner = new Scanner();
		printer = new Printer();
		display = new Display();
		new BorrowUC_CTL(reader, scanner, printer, display, bookDAO, loanDAO, memberDAO);

		/** Create an array of 10 IBook objects and 6 IMember objects */
		IBook[] book = new IBook[10]; 
		IMember[] member = new IMember[6];

		book[0] = bookDAO.addBook("Leo Tolstoy", "Anna Karenina", "CA001"); 
		book[1] = bookDAO.addBook("Gustave Flaubert", "Madame Bovary", "CA002");
		book[2] = bookDAO.addBook("Leo Tolstoy", "War and Peace", "CA003");
		book[3] = bookDAO.addBook("F. Scott Fitzgerald", "The Great Gatsby", "CA004");
		book[4] = bookDAO.addBook("Vladimir Nabokov", "Lolita", "CA005");
		book[5] = bookDAO.addBook("George Eliot", "Middlemarch", "CA006");
		book[6] = bookDAO.addBook("Mark Twain", "The Adventures of Huckleberry Finn", "CA007");
		book[7] = bookDAO.addBook("Anton Chekhov", "The Stories of Anton Chekhov", "CA008");
		book[8] = bookDAO.addBook("Marcel Proust", "In Search of Lost Time", "CA009");
		book[9] = bookDAO.addBook("William Shakespeare", "Hamlet", "CA010");

		member[0] = memberDAO.addMember("Gourav", "Pathela", "0001", "gpathela@yahoo.com");
		member[1] = memberDAO.addMember("Jino", "Rousseau", "0002", "jinorousseau@hotmail.com");
		member[2] = memberDAO.addMember("Chiranjivi", "Bashyal", "0003", "chiranjivi@gmail.com");
		member[3] = memberDAO.addMember("Ramanpreet", "Kaur", "0004", "rpreet@gmail.com");
		member[4] = memberDAO.addMember("Tom", "Cruise", "0005", "tom@cruise.com");
		member[5] = memberDAO.addMember("Brad", "Pitt", "0006", "bradpitt@live.com");

		/** Create an object Calendar and get the current time */
		Calendar cal = Calendar.getInstance(); 
		Date now = cal.getTime();

		/** Create a member with overdue loans */
		for (int i = 0; i < 2; i++) {
			ILoan loan = loanDAO.createLoan(member[1], book[i]);
			loanDAO.commitLoan(loan);
		}
		cal.setTime(now);
		cal.add(Calendar.DATE, ILoan.LOAN_PERIOD + 1);
		Date checkDate = cal.getTime();
		loanDAO.updateOverDueStatus(checkDate);

		/** create a member with maxed out unpaid fines */
		member[2].addFine(10.0f);

		/** create a member with maxed out loans */
		for (int i = 2; i < 7; i++) {
			ILoan loan = loanDAO.createLoan(member[3], book[i]);
			loanDAO.commitLoan(loan);
		}

		/** a member with a fine, but not over the limit */
		member[4].addFine(5.0f);

		/** a member with a couple of loans but not over the limit */
		for (int i = 7; i < 9; i++) {
			ILoan loan = loanDAO.createLoan(member[5], book[i]);
			loanDAO.commitLoan(loan);
		}

		/** Start the GUI */
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				showGUI();
			}
		});
	} // End of the main method
} // End of the class Main