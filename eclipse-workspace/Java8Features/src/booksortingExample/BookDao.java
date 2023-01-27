package booksortingExample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBooks() {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(10,"c",121));
		bookList.add(new Book(11,"bca",142));
		bookList.add(new Book(12,"java",171));
		bookList.add(new Book(13,".net",173));
		
		return bookList;
	}
}
