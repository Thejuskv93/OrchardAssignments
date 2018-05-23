package com.mindtree.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.dao.RestDao;
import com.mindtree.entity.User;

@Repository
@Transactional
public class RestDaoImpl implements RestDao
{
	@Autowired
	SessionFactory sessionFactory;
	public List<User> getUsers() 
	{
		String hql="from User";
		List<User> userList= sessionFactory.openSession().createQuery(hql).list();
		return userList;
	}
	public User getUsers(int id)
	{
		String hql="from User where id=:id";
		User user=(User) sessionFactory.openSession().createQuery(hql).setParameter("id", id).uniqueResult();
		System.out.println(user.getFname());
		return user;
	}
	public boolean deleteUser(int id)
	{
		boolean result=false;
		String hql="delete from User where id=:id";
		int res= sessionFactory.openSession().createQuery(hql).setParameter("id", id).executeUpdate();
		if(res!=0)
		{
			result=true;
		}
		return result;
	}
	public User save(User user)
	{
		int id=(Integer) sessionFactory.getCurrentSession().save(user);
		user.setId(id);
		return user;
	}
	public User update(User user)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return null;
	}

}
