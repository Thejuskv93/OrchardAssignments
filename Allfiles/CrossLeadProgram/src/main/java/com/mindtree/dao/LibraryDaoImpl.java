package com.mindtree.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.entity.Book;

@Repository
@Transactional
public class LibraryDaoImpl implements LibraryDao{
	@Autowired
	SessionFactory sessionfactory;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public boolean addBook(Book book) 
	{
		boolean res=false;
		if(book != null)
		{
			Session session = sessionfactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(book);
			tx.commit();
			res=true;
		}
		return res;
	}

	public boolean deleteBook(int id) {
		boolean res=false;
		if(id!=0)
		{
			Session session = sessionfactory.openSession();
			Transaction tx=session.beginTransaction();
			Book book=session.get(Book.class, id);
			session.delete(book);
			tx.commit();
			res=true;
		}
		return res;
	}

	public List<Book> getBook()
	{
		String hql="from Book";
		List<Book> list=sessionfactory.openSession().createQuery(hql).list();
		return list;
	}

	public boolean deleteBook(List<Book> blist) {
		boolean res=false;
		if(!blist.isEmpty())
		{
			/*Session session = sessionfactory.openSession();
			Transaction tx=session.beginTransaction();
			for (Book book : blist)
			{
				session.delete(book);
				tx.commit();
				res=true;
			}*/
			hibernateTemplate.deleteAll(blist);
			res=true;
			
		}
		return res;
	}

}

