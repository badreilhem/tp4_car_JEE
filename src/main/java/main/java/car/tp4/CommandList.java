package main.java.car.tp4;

import java.util.List;

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
	
	public void add(Command command) {
		em.persist(command);
	}
	
	public void clear() {
		Query q = em.createQuery("DELETE FROM Command");
		q.executeUpdate();
		em.flush();
		em.clear();
	}
	
	public List<Command> getListCommands() {
		Query q = em.createQuery("SELECT c FROM Command c");
		List<Command> commands = q.getResultList();
		return commands;
	}
	
	public List<String> getListCustomers() {
		Query q = em.createQuery("SELECT DISTINCT c.customer FROM Command c");
		List<String> customers = q.getResultList();
		return customers;
	}

}
