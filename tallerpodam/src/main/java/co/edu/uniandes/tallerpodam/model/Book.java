/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.tallerpodam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import uk.co.jemos.podam.common.PodamStringValue;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@Column(name = "id")
        @PodamStringValue()
	private String id;
	
	@Column(name = "title")
        @PodamStringValue(length = 20)
	private String title;
	
	@Column(name= "author")
        @PodamStringValue(length = 50)
	String author;
        
       /* @ManyToOne
        @JoinColumn(name="user_id", nullable=false)
        User user;*/
	
	public Book() {
	}

	public Book(String id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

  /*  public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
	
        
        
	@Override
	public String toString() {
		return "Book: " + this.id + ", " + this.title + ", " + this.author;
	}
	
}