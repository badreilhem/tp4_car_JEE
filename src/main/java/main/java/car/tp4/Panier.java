package main.java.car.tp4;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panier {

    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id; 
    protected String customer;
    protected LinkedList<Book> books;


	public Panier(String cost) {
        this.customer = cost;
        this.books = new LinkedList<Book>();
	}

	public Panier(String customer, LinkedList<Book> books) {
        this.customer = customer;
        this.books = books;
	}
	

	public String getCustomer() {
		return customer;
	}
//onclick=\" <% p.addBook(new Book(b.getAthor(), b.getTitle(), b.getYear())); %> \"

	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public LinkedList<Book> getBooks() {
		return books;
	}


	public void setBooks(LinkedList<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book b){
		this.books.add(b);
	}

}
