package main.java.car.tp4;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Command {

    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id; 
    protected String customer;
    protected Set<Entry<Book, Integer>> books;


	public Command() {
        this.customer = "????";
        this.books = new HashSet<Entry<Book, Integer>>();
	}

	public Command(String customer, Set<Entry<Book, Integer>> books) {
        this.customer = customer;
        this.books = books;
	}
	

	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public Set<Entry<Book, Integer>> getBooks() {
		return books;
	}


	public void setBooks(Set<Entry<Book, Integer>> books) {
		this.books = books;
	}

}
