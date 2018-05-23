package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Project;
import com.mindtree.entity.User;

public interface UserService 
{
	public int addUser(User user);
	public int valUser(User usr);
	public String addProject(Project project);
	public List<Project> viewProjects();
	public List<User> viewUsers();
	public User getUserById(int uid);
}
