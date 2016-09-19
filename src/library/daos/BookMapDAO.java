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
*@reviewer Jean Claude Jino Rousseau
*@course Master of Information Technology
*@subject Professional Programming Practice
*@lecturer Dr Recep Ulusoy (who has been remarkably helpful)
*@due date 29.09.2016
*@version 1.2
*
*The GradeProcessing class will display a GUI with a title appearing on top of 
*the main frame, six text fields with appropriate labels to take user inputs, 
*two buttons that will be used to trigger actions for calculations.
*/

/** Start of the class BookMapDAO */
public class BookMapDAO implements IBookDAO {

	/** Declare and initialise variables with private access modifiers */
	private int nextId;
	private Map<Integer, IBook> bookMap;
	private IBookHelper helper;

	/** The constructor for a BookMapDAO database object which takes a parameter of variable */
	public BookMapDAO(IBookHelper helper) {
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : helper cannot be null."));
		}
		nextId = 1;
		this.helper = helper; 
		bookMap = new HashMap<Integer, IBook>();
	}
	
	/** The constructor for a BookMapDAO database object which takes a parameter of variables */
	public BookMapDAO(IBookHelper helper, Map<Integer, IBook> bookMap) {
		this(helper);
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : bookMap cannot be null."));
		}
		this.bookMap = bookMap;
	}
	
	/** Override the addBook method */
	@Override
	/** The method addBook returns a book that has been added to a collection */
	public IBook addBook(String author, String title, String callNo) {
		int id = getNextId();
		IBook book = helper.makeBook(author, title, callNo, id);
		bookMap.put(Integer.valueOf(id), book);
		return book;
	}

	/** Override the getBookByID method */
	@Override
	/** The method getBookByID returns a list of books by ID */
	public IBook getBookByID(int id) {
		if (bookMap.containsKey(Integer.valueOf(id))) {
			return bookMap.get(Integer.valueOf(id));
		}
		return null;
	}

	/** Override the listBooks method */
	@Override
	/** The method listBooks returns a list of books */
	public List<IBook> listBooks() {
		List<IBook> list = new ArrayList<IBook>(bookMap.values());
		return Collections.unmodifiableList(list);
	}

	
	/** Override the findBooksByAuthor method */
	@Override
	/** The method findBooksByAuthor returns a collection of books by author name */
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
	/** The method findBooksByTitle returns a collection of books by title */
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

	/** Override the findBooksByAuthorTitle method  */
	@Override
	/** The method findBooksByAuthorTitle returns a collection of books by author title */
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
	
	/** The method getNextId returns the next ID */
	private int getNextId() {
		return nextId++;
	}
} // End of the class class BookMapDAO