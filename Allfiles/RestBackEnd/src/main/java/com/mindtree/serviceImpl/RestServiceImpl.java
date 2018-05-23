package com.mindtree.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.RestDao;
import com.mindtree.entity.User;
import com.mindtree.service.RestService;

@Service
public class RestServiceImpl implements RestService
{
	@Autowired
	RestDao dao;
	public List<User> getUsers() 
	{
		List<User> ulist=dao.getUsers();
		return ulist;
	}
	public User getUser(int id) 
	{
		return dao.getUsers(id);
	}
	public boolean deleteUser(int id) 
	{
		return dao.deleteUser(id);
	}
	public User save(User user) 
	{
		return dao.save(user);
	}
	public User update(User user) 
	{
		return dao.update(user);
	}

}
