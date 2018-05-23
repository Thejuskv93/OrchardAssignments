package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Project;
import com.mindtree.entity.User;

public interface UserDao 
{
	public int addUser(User user);
	public int valUser(User usr);
	public String addProject(Project project);
	public List<Project> viewProjects();
	public List<User> viewUser();
	public User getUserById(int uid);
}
