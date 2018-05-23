package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.User;

public interface RestService 
{
	public List<User> getUsers();
	public User getUser(int id);
	public boolean deleteUser(int id);
	public User save(User user);
	public User update(User user);
}
