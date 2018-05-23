package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.User;

public interface RestDao
{
	public List<User> getUsers();

	public User getUsers(int id);

	public boolean deleteUser(int id);

	public User save(User user);

	public User update(User user);

}
