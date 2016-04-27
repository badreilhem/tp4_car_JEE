package main.java.car.tp4;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class Library {

	@PersistenceContext
	private EntityManager em;

	public void init() {
	}

	public void add(Book book) {
		em.persist(book);
	}
	
	public List<Book> getListBook() {
		Query q = em.createQuery("SELECT b FROM Book b");
		List<Book> books = q.getResultList();
		return books;
	}
}
