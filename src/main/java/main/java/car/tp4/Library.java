package main.java.car.tp4;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

@Stateful
public class Library {
	
	protected List<Book> listBook;
	
	public void init() {
		listBook = new ArrayList<Book>();
	}

	public void add(Book book) {
		listBook.add(book);
	}
	
	public List<Book> getListBook() {
		return listBook;
	}
	
}
