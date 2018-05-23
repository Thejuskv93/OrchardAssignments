package com.mindtree.controller;
import java.lang.invoke.MethodType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.entity.User;
import com.mindtree.service.RestService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping(value="/api")
public class RestController 
{
	@Autowired
	RestService service;
	
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getUsers()
	{
		List<User> ulist=service.getUsers();
		return ulist;
	}
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable int id)
	{
		User user=service.getUser(id);
		return user;
	}
	@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable int id)
	{
		boolean res=service.deleteUser(id);
		return res;
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public void createUsers(@RequestBody User user)
	{
		
		service.save(user); 
	}
	
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	public User updateUsers(@RequestBody User user)
	{
		return service.update(user); 
	}
}
