package main.java.car.tp4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id; 
    protected String author; 
    protected String title; 
    protected String year;
    

	public Book() {
        this.author = "????"; 
        this.title = "????";
        this.year = "????";
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Book(String author, String title, String year) { 
    	//this.id = (author+title+year).hashCode();
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
