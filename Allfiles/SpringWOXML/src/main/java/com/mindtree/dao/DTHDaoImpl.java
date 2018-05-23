package com.mindtree.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mindtree.entity.Channels;
import com.mindtree.entity.Customers;
import com.mindtree.entity.Subscription_Channel;

@Repository
@Transactional
public class DTHDaoImpl implements DTHDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Channels> getChannels() 
	{
		
		String hql="from Channels";
		return sessionFactory.openSession().createQuery(hql).list();
	}
	public int subscribe(Subscription_Channel subscr) 
	{
		Session session=sessionFactory.openSession();
		String hql="from Subscription_Channel where subscriber_id=:sid and channel_id=:cid";
		Query query=session.createQuery(hql);
		query.setParameter("sid", subscr.getSubscriber_ID());
		query.setParameter("cid", subscr.getChannel());
		Subscription_Channel sub=(Subscription_Channel) query.uniqueResult();
		if(sub.getId()!=0)
		{
			return 0;
		}
		else
		{

			Transaction tx=session.beginTransaction();
			int n=(Integer) session.save(subscr);
			tx.commit();
			if(n!=0)
			{
				return 1;
			}
			else
				return 0;
		}
	}
	
	public List<Channels> getSubsChannel(int subs) 
	{
		String hql="from Subscription_Channel where subscriber_ID=:subId";
		Customers c=new Customers();
		c.setSubscriber_ID(subs);
		List<Channels> clist=sessionFactory.openSession().createQuery(hql).setParameter("subId", c).list();
		return clist;
	}
	public int unsubscribe(Subscription_Channel sub) 
	{
		Session session=sessionFactory.openSession();
		String hql="from Subscription_Channel sc where subscriber_id=:sid and channel_id=:cid";
		Customers c=new Customers();
		Channels ch=new Channels();
		c.setSubscriber_ID(sub.getSubscriber_ID().getSubscriber_ID());
		ch.setChannel_id(sub.getChannel().getChannel_id());
		
		Query query=session.createQuery(hql);
		query.setParameter("sid", c);
		query.setParameter("cid", ch);
		
		Subscription_Channel sc=(Subscription_Channel) query.uniqueResult();
		
		Transaction tx=session.beginTransaction();
		session.delete(sc);
		tx.commit();
		return 1;
	}
	public List<Subscription_Channel> getDetails(int id) 
	{
		String hql="from Subscription_Channel where subscriber_ID=:subId";
		Customers c=new Customers();
		c.setSubscriber_ID(id);
		List<Subscription_Channel> clist=sessionFactory.openSession().createQuery(hql).setParameter("subId", c).list();
		return clist;
	}
	
}
