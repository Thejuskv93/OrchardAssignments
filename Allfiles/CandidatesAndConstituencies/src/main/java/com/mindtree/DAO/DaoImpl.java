package com.mindtree.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mindtree.DBUtil.HibernateUtil;
import com.mindtree.entity.CandidatesDTO;
import com.mindtree.entity.ConstituencyDTO;

@SuppressWarnings({ "deprecation", "unused" })
public class DaoImpl implements DaoInf
{
	public void saveData(List<Object> list)
	{
		/*Session session=null;
		Transaction tx=null;

		session=HibernateUtil.getFactory().openSession();
		tx=session.beginTransaction();

		for (Object ob:list)
		{

			session.save(ob);

		}

		tx.commit();*/
	}
	public void saveCons(ConstituencyDTO con)
	{
		Session session=null;
		Transaction tx=null;

		session=HibernateUtil.getFactory().openSession();
		tx=session.beginTransaction();

		

			session.save(con);

		

		tx.commit();
		//session.close();
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void displayCandidateOnId(int id)
	{
		String hql="select candidate.name,candidate.party,constituency.name from CandidatesDTO candidate join candidate.cdto constituency where constituency.id=:cid";
		Session session=null;

		try {
			session=HibernateUtil.getFactory().openSession();
			List<Object> alist=session.createQuery(hql).setParameter("cid",id).list();
			System.out.println("------------------------------------------");
			for (Iterator iterator = alist.iterator(); iterator.hasNext();)
			{
				Object[] object = (Object[]) iterator.next();


				for (Object object2 : object) 
				{
					System.out.print(object2+" ");

				}
				System.out.println();
			}
			System.out.println();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null)
				session.close();
		}
		System.out.println("------------------------------------------");

	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void displayCandidateOnParty(String party)
	{
		String hql="select candidate.name,constituency.name from CandidatesDTO candidate join candidate.cdto constituency where candidate.party=:party";
		Session session=null;

		try {
			session=HibernateUtil.getFactory().openSession();
			List<Object> alist=session.createQuery(hql).setParameter("party",party).list();
			System.out.println("------------------------------------------");
			for (Iterator iterator = alist.iterator(); iterator.hasNext();)
			{
				Object[] object = (Object[]) iterator.next();


				for (Object object2 : object) 
				{
					System.out.print(object2+" ");

				}
				System.out.println();
			}
			System.out.println("------------------------------------------");
			System.out.println();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null)
				session.close();
		}
	}
	@SuppressWarnings("unchecked")
	public List<String> returnCandidates(String cons)
	{
		String hql="select candidate.name from CandidatesDTO candidate join candidate.cdto const where const.name=:const";
		Session session=null;
		List<String> clist=null;
		try {
			session=HibernateUtil.getFactory().openSession();
			clist=session.createQuery(hql).setParameter("const", cons).list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return clist;
	}
	public void displayCandidateOnMultiple(String partyName,String constituency)
	{

		String hql="select candidate.name from CandidatesDTO candidate join candidate.cdto const where const.name=:constituency and candidate.party=:partyName";
		Session session=null;
		List<String> clist=null;
		try {
			session=HibernateUtil.getFactory().openSession();
			Query query =session.createQuery(hql);
			query.setParameter("constituency", constituency);
			query.setParameter("partyName", partyName);
			clist=query.list();
			System.out.println("------------------------------------------");
			for (Iterator iterator = clist.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
			}
			System.out.println("------------------------------------------");
			System.out.println();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
