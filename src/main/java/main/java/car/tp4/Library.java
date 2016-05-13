package main.java.car.tp4;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateful
public class Library {

	@PersistenceContext
	private EntityManager em;

	public void init() {
		clear();
	}

	public void add(Book book) {
		em.persist(book);
	}
	
	public void clear() {
		Query q = em.createQuery("DELETE FROM Book");
		q.executeUpdate();
		em.flush();
		em.clear();
	}
	
	public List<Book> getListBook() {
		Query q = em.createQuery("SELECT b FROM Book b");
		List<Book> books = q.getResultList();
		return books;
	}
	
	public Book getBook(String s) {
		Query q = em.createQuery("SELECT b FROM Book b WHERE b.id = "+s);
		Book book = (Book) q.getSingleResult();
		return book;
	}
	
	public List<String> getListAuthors() {
		Query q = em.createQuery("SELECT DISTINCT b.author FROM Book b");
		List<String> authors = q.getResultList();
		return authors;
	}
	
	public void initBooks() {
		clear();
		add(new Book("Jean", "Bon", "4565"));
		add(new Book("Jean", "Bonbon", "5565"));
		add(new Book("Jean", "Bonneau", "45565"));
		add(new Book("Jean", "Bonnechance", "456545"));
	}
}
