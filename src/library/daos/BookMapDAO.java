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
* The BookHelper class implements the IBookHelper interface. 
* This class shows the details of the book.
*
*/

public class BookMapDAO implements IBookDAO {

	private int nextId;
	private Map<Integer, IBook> bookMap;
	private IBookHelper helper;

	public BookMapDAO(IBookHelper helper) {
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : helper cannot be null."));
		}
		nextId = 1;
		this.helper = helper; 
		bookMap = new HashMap<Integer, IBook>();
	}
	
	public BookMapDAO(IBookHelper helper, Map<Integer, IBook> bookMap) {
		this(helper);
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : bookMap cannot be null."));
		}
		this.bookMap = bookMap;
	}
	
	@Override
	public IBook addBook(String author, String title, String callNo) {
		int id = getNextId();
		IBook book = helper.makeBook(author, title, callNo, id);
		bookMap.put(Integer.valueOf(id), book);
		return book;
	}

	@Override
	public IBook getBookByID(int id) {
		if (bookMap.containsKey(Integer.valueOf(id))) {
			return bookMap.get(Integer.valueOf(id));
		}
		return null;
	}

	@Override
	public List<IBook> listBooks() {
		List<IBook> list = new ArrayList<IBook>(bookMap.values());
		return Collections.unmodifiableList(list);
	}

	@Override
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
