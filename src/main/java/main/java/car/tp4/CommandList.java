package main.java.car.tp4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateful
public class CommandList {

	@PersistenceContext
	private EntityManager em;
	
	public void init() {
		clear();
	}
	
	public void add(Panier command) {
		em.persist(command);
	}
	
	public void clear() {
		Query q = em.createQuery("DELETE FROM Command");
		q.executeUpdate();
		em.flush();
		em.clear();
	}
	/*
	public void initCommands() {
		clear();
		Map<Book, Integer> map = new HashMap<Book, Integer>();
		map.put(new Book("dummy", "book", "12"), 2);
		map.put(new Book("dummy2", "book2", "122"), 5);
		
		em.persist(new Panier("customer1", map.entrySet()));
		
		map = new HashMap<Book, Integer>();
		map.put(new Book("dummy4", "book3", "1222"), 25);
		map.put(new Book("dummy7", "book4", "12233"), 5865614);
		
		em.persist(new Panier("customer2", map.entrySet()));
	}
	
	public List<Panier> getListCommands() {
		Query q = em.createQuery("SELECT c FROM Command c");
		List<Panier> commands = q.getResultList();
		return commands;
	}
	
	public List<String> getListCustomers() {
		Query q = em.createQuery("SELECT DISTINCT c.customer FROM Command c");
		List<String> customers = q.getResultList();
		return customers;
	}*/

}
