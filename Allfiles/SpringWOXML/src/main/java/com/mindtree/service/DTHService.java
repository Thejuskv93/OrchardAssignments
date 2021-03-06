package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Channels;
import com.mindtree.entity.Subscription_Channel;

public interface DTHService 
{
	public List<Channels> getChannels();

	public int subscribe(Subscription_Channel subscr);

	public int unsubscribe(Subscription_Channel sub);

	public List<Channels> getSubsChannel(int subs);

	public List<Subscription_Channel> getDetails(int id);
}
