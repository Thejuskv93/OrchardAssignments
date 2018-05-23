package com.mindtree.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mindtree.dao.UserDao;
import com.mindtree.entity.Project;
import com.mindtree.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userDao;
	
	public int valUser(User usr)
	{
		return userDao.valUser(usr);
	}
	
	public int addUser(User user)
	{
		int id=userDao.addUser(user);
		return id;
	}
	/*public Date convertDate(Date d)
	{
		SimpleDateFormat inSDF=new SimpleDateFormat("mm/dd/yyyy");
		SimpleDateFormat outSDF=new SimpleDateFormat("yyyy-mm-dd");
		String outdate="";
		Date date=inSDF.parse(d);
		return null;
		
	}*/

	public String addProject(Project project) 
	{
		String id=userDao.addProject(project); 
		return id;
	}

	public List<Project> viewProjects() 
	{
		List<Project> list=userDao.viewProjects();
		return list;
	}

	public List<User> viewUsers() {
		List<User> list=userDao.viewUser();
		return list;
	}

	public User getUserById(int uid) {
		User user=userDao.getUserById(uid);
		return user;
	}

	
	
}
