/** Specify the package in which this code resides */
package library.daos;

/** Import some libraries to be used in the code */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

/**
* @author Ramanpreet Kaur
* @course Master of Information Technology
* @subject Professional Programming Practice
* @instructor Dr Recep Ulusoy
* @due date 23.09.2016
* @version 1.0
*
* The BookMapDAO class will display a GUI 
* there is a title appearing on the top of the main frame of GUI
* some text fields with appropriate labels to take user inputs, 
* and two buttons that will be used to trigger actions for calculations.
*
*/

/** Start of the class BookMapDAO */
public class BookMapDAO implements IBookDAO {
	
	/** Declare and initialize the variable for the class
		with private visibility */
	private int nextId;
	private Map<Integer, IBook> bookMap;
	private IBookHelper helper;
	
	/** Construct an BookMapDAO object with the specified attribute. */
	public BookMapDAO(IBookHelper helper) {
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : helper cannot be null."));
		}
		nextId = 1;
		this.helper = helper; 
		bookMap = new HashMap<Integer, IBook>();
	}
	
	/** Construct an BookMapDAO object with the specified attribute. */
	public BookMapDAO(IBookHelper helper, Map<Integer, IBook> bookMap) {
		this(helper);
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : bookMap cannot be null."));
		}
		this.bookMap = bookMap;
	}
	
	/** Override the addBook method */
	@Override
	/** The addBook method returns a book that has been added */
	public IBook addBook(String author, String title, String callNo) {
		int id = getNextId();
		IBook book = helper.makeBook(author, title, callNo, id);
		bookMap.put(Integer.valueOf(id), book);
		return book;
	}
	
	/** Override the getBookByID method */
	@Override
	/** The getBookByID method returns a list of books by ID */
	public IBook getBookByID(int id) {
		if (bookMap.containsKey(Integer.valueOf(id))) {
			return bookMap.get(Integer.valueOf(id));
		}
		return null;
	}
	
	/** Override the listBooks method */
	@Override
	/** The listBooks method returns a list of books */
	public List<IBook> listBooks() {
		List<IBook> list = new ArrayList<IBook>(bookMap.values());
		return Collections.unmodifiableList(list);
	}
	
	/** Override the findBooksByAuthor method */
	@Override
	/** The findBooksByAuthor method returns a list of books by author name */
	public List<IBook> findBooksByAuthor(String author) {
		if ( author == null || author.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("BookDAO : findBooksByAuthor : author cannot be null or blank"));
		}
		List<IBook> list = new ArrayList<IBook>();
		for (IBook b : bookMap.values()) {
			if (author.equals(b.getAuthor())) {
				list.add(b);
			}
		}
		return Collections.unmodifiableList(list);
	}
	
	/** Override the findBooksByTitle method */
	@Override
	public List<IBook> findBooksByTitle(String title) {
		if ( title == null || title.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("BookDAO : findBooksByAuthor : author cannot be null or blank"));
		}
		List<IBook> list = new ArrayList<IBook>();
		for (IBook b : bookMap.values()) {
			if (title.equals(b.getTitle())) {
				list.add(b);
			}
		}
		return Collections.unmodifiableList(list);
	}

	@Override
	public List<IBook> findBooksByAuthorTitle(String author, String title) {
		if ( title == null || title.isEmpty() ||  author == null || author.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("BookDAO : findBooksByAuthor : author and title cannot be null or blank"));
		}
		List<IBook> list = new ArrayList<IBook>();
		for (IBook b : bookMap.values()) {
			if (author.equals(b.getAuthor()) && title.equals(b.getTitle())) {
				list.add(b);
			}
		}
		return Collections.unmodifiableList(list);
	}
	
	private int getNextId() {
		return nextId++;
	}

}
