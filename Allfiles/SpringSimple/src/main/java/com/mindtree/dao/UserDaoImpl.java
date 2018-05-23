package com.mindtree.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.entity.Project;
import com.mindtree.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public int valUser(User usv)
	{
		int n=1;
		String hql="from User where uname=:uname and password=:pd";
		Query query=sessionFactory.openSession().createQuery(hql);
		query.setParameter("uname", usv.getUname());
		query.setParameter("pd", usv.getPassword());
		List l=query.list();
		if(l.isEmpty())
		{
			n=0;
		}
		return n;
	}
	public int addUser(User user) 
	{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		int id=(Integer) session.save(user);
		tx.commit();
		return  id;
	}
	public String addProject(Project project) 
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String id= (String) session.save(project);
		tx.commit();
		return id;
	}
	public List<Project> viewProjects()
	{
		String hql="from Project";
		Session session= sessionFactory.openSession();
		return  session.createQuery(hql).list();
	}
	public List<User> viewUser()
	{
		String hql="from User";
		Session session= sessionFactory.openSession();
		return  session.createQuery(hql).list();
	}
	public User getUserById(int uid)
	{
		String hql="from User where userId=:uid";
		Session session= sessionFactory.openSession();
		return  (User) session.createQuery(hql).setParameter("uid", uid).uniqueResult();
	}

}
