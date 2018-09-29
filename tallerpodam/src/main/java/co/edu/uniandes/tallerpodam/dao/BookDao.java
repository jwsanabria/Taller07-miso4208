/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.tallerpodam.dao;

import co.edu.uniandes.tallerpodam.model.Book;
import java.util.List;



public class BookDao extends DaoAbstract<Book, String> {

	

	public BookDao() {
	}

	

	public void persist(Book entity) {
		getCurrentSession().save(entity);
	}

	public void update(Book entity) {
		getCurrentSession().update(entity);
	}

	public Book findById(String id) {
		Book book = (Book) getCurrentSession().get(Book.class, id);
		return book; 
	}

	public void delete(Book entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Book> findAll() {
		List<Book> books = (List<Book>) getCurrentSession().createQuery("from Book").list();
		return books;
	}

	public void deleteAll() {
		List<Book> entityList = findAll();
		for (Book entity : entityList) {
			delete(entity);
		}
	}
}