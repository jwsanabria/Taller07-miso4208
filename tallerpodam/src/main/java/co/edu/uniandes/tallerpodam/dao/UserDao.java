/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.tallerpodam.dao;

import co.edu.uniandes.tallerpodam.model.User;
import java.util.List;

/**
 *
 * @author John_Sanabria
 */
public class UserDao extends DaoAbstract<User, Long> {

	

	public UserDao() {
	}

	

        @Override
	public void persist(User entity) {
            getCurrentSession().save(entity);
	}

	public void update(User entity) {
		getCurrentSession().update(entity);
	}

	public User findById(Long id) {
		User user = (User) getCurrentSession().get(User.class, id);
		return user; 
	}

	public void delete(User entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		List<User> users = (List<User>) getCurrentSession().createQuery("from User").list();
		return users;
	}

	public void deleteAll() {
		List<User> entityList = findAll();
		for (User entity : entityList) {
			delete(entity);
		}
	}
}
