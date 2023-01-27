package booksortingExample;

import java.util.Comparator;

public class Book {

	private int id;
	private String name;
	private int page;
	Book(int id, String name, int page){
		this.id=id;
		this.name=name;
		this.page=page;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", page=" + page + "]";
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

