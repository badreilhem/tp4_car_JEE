package main.java.car.tp4;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id 
    protected long id; 
    protected String author; 
    protected String title; 
    protected String year;
    

	public Book(String author, String title, String year) { 
    	this.id = (author+title+year).hashCode();
        this.author = author; 
        this.title = title;
        this.year = year;
    } 

	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getYear() {
		return year;
	}
}
