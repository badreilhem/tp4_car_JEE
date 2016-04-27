package main.java.car.tp4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ejb.Stateful;

@Stateful
public class Cart {

	protected String customer;
	protected Map<Book, Integer> books;
	
	public Cart() {
		books = new HashMap<Book, Integer>();
	}

	public void setName(String name) {
		this.customer = name;
	}
	
	public String getName() {
		return customer;
	}
	
	public void addBook(Book book) {
		if(books.containsKey(book)) {
			Integer value = books.get(book) + 1;
			books.put(book, value);
		} else {
			books.put(book, 1);
		}
	}
	
	public void removeBook(Book book) {
		if(books.containsKey(book)) {
			Integer value = books.get(book) - 1;
			if(value == 0)
				books.remove(book);
			else
				books.put(book, value);
		}
	}
	
	public Set<Entry<Book, Integer>> getBooks() {
		return books.entrySet();
	}
	
	public Command validateCommand() {
		Command cmd = new Command(customer, getBooks()); 
		books.clear();
		return cmd;
	}
	
	
}
