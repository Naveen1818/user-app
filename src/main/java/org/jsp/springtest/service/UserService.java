package org.jsp.springtest.service;

import java.util.List;

import org.jsp.springtest.dao.UserDao;
import org.jsp.springtest.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
	private UserDao dao;
	
	public User updateUser(User user) {
		
		return dao.update(user);
	}
	public User saveUser(User user)
	{
		return dao.save(user);
	}
	public User findUserById(int id)
	{
		return dao.findUser(id);
	}
	public Boolean deleteUser(int id)
	{
		return dao.delete(id);
	}
	public List<User> findAllUsers()
	{
		return dao.findAll();
	}
	public User verifyUser(long phone,String password)
	{
		return dao.verify(phone,password);
	}
}
