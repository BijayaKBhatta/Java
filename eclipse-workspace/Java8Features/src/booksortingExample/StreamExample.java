package booksortingExample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
	 List<Book> books = new BookDao().getBooks();
	//	books.stream().filter(t->t.getId()%2==0).forEach(t->System.out.println(t.getId()+":"+t.getName()+":"+t.getPage()));;
	// print all books >150 pages
	//	books.stream().filter(b->b.getPage()>150).forEach(t->System.out.println(t.getName()));;
	
	//	List<Book> evenBook = books.stream().filter(b->b.getPage()>150).collect(Collectors.toList());
	
	//	System.out.println("-----"+getBooksOfGreaterPage());
		//getBooksOfGreaterPage();
	
	// sorting books 
		
	 System.out.println(sortBooksonNames());
	
	}
	public static List<Book> sortBooksonNames(){
//		return new BookDao().getBooks().stream().sorted((b1,b2)->b1.getName().compareTo(b2.getName())).collect(Collectors.toList());
		//return new BookDao().getBooks().stream().sorted(Comparator.comparing(Books::)).collect(Collectors.toList());
return null;
	}
	// u can use employee salary >15000 similarly 
	public static List<Book> getBooksOfGreaterPage(){
		return new BookDao().getBooks().stream().filter(b->b.getPage()>150).collect(
				Collectors.toList());
		
	}

}
