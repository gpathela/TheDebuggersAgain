package library.testing.system;

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
*@reviewer Chiranjivi Bashyal
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy
*@due date 23.09.2016
*@version 2.0
*
		
*/
public class TestCheckOverDue {

	public static void main(String[] args) {
		IBookDAO testBookMapDAO = new BookMapDAO(new BookHelper());
		IMemberDAO testMemberMapDAO = new MemberMapDAO(new MemberHelper());
		ILoanDAO testLoanMapDAO = new LoanMapDAO(new LoanHelper());

		// Testing addBook Method
		IBook testBook = testBookMapDAO.addBook("testAuthor", "testTitle", "CN11");
		System.out.println("Book Added");
		
		IMember testMember = testMemberMapDAO.addMember("testFirstName", "testLastName", "04XX00", "test@domain.com");
		System.out.println("Member Added");
		
		ILoan testLoan = testLoanMapDAO.createLoan(testMember, testBook);
		testLoanMapDAO.commitLoan(testLoan);
		System.out.println("Loan Created");
		
		//Test to check if loan is overdue. 
		
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		System.out.println("Test to check if loan is overdue.");
		System.out.println("Result should be 'false'");
		System.out.println(testLoan.checkOverDue(currentDate));
	}
}