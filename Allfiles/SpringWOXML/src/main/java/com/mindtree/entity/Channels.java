package com.mindtree.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="channels")
public class Channels 
{
	@Id
	@Column(name="CHANNEL_ID")
	private int channel_id;
	@Column(name="CHANNEL_NAME")
	private String channel_name;
	@Column(name="COST_PER_MONTH")
	private double cost;
	
	@OneToMany(mappedBy="channel")
	private List<Subscription_Channel> sub;
	
	
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Subscription_Channel> getSub() {
		return sub;
	}
	public void setSub(List<Subscription_Channel> sub) {
		this.sub = sub;
	}
	
	
}
