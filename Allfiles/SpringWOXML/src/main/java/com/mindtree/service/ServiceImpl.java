package com.mindtree.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mindtree.dao.DTHDao;
import com.mindtree.entity.Channels;
import com.mindtree.entity.Subscription_Channel;
import com.mindtree.exception.InvalidChannelException;

@Service
@Transactional
public class ServiceImpl implements DTHService
{
	@Autowired
	DTHDao dao;
	public List<Channels> getChannels()
	{
		return dao.getChannels();
	}
	public int subscribe(Subscription_Channel subscr)
	{
		
		try {
			if(subscr.getChannel().getChannel_id()==0)
			{
				throw new InvalidChannelException();
			}
		} catch (InvalidChannelException e) {
			return 100;
		}
		return dao.subscribe(subscr);
	}
	public int unsubscribe(Subscription_Channel sub)
	{
		return dao.unsubscribe(sub);
	}
	public List<Channels> getSubsChannel(int subs) {
		return dao.getSubsChannel(subs);
	}
	public List<Subscription_Channel> getDetails(int id) 
	{
		return dao.getDetails(id);
	}

}
