package booksortingExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookDemo {

	public static void main(String[] args) {
	//	System.out.println(new BookDemo().sortBook());
		new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		}).start();
	}
	public static List<Book> sortBook(){
		List<Book> list = new BookDao().getBooks();
		//Collections.sort(list, new BookSortName());
		Collections.sort(list, (b1,b2)->b1.getName().compareTo(b2.getName()));
		return list;
	}
	
	
	
}
 class BookSortName implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2){
		return b1.getName().compareTo(b2.getName());
	}
}