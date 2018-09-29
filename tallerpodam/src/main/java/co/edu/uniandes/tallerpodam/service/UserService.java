/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.tallerpodam.service;

import co.edu.uniandes.tallerpodam.dao.UserDao;
import co.edu.uniandes.tallerpodam.model.User;
import java.util.List;

/**
 *
 * @author John_Sanabria
 */
public class UserService {
    private static UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	public void persist(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.persist(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public void update(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.update(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public User findById(Long id) {
		userDao.openCurrentSession();
		User user = userDao.findById(id);
		userDao.closeCurrentSession();
		return user;
	}

	public void delete(Long id) {
		userDao.openCurrentSessionwithTransaction();
		User user = userDao.findById(id);
		userDao.delete(user);
		userDao.closeCurrentSessionwithTransaction();
	}

	public List<User> findAll() {
		userDao.openCurrentSession();
		List<User> users = userDao.findAll();
		userDao.closeCurrentSession();
		return users;
	}

	public void deleteAll() {
		userDao.openCurrentSessionwithTransaction();
		userDao.deleteAll();
		userDao.closeCurrentSessionwithTransaction();
	}

	public UserDao bookDao() {
		return userDao;
	}
}
