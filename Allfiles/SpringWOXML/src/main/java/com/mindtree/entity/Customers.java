package com.mindtree.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers
{
	@Id
	@Column(name="SUBSCRIBER_ID")
	private int subscriber_ID;
	@Column(name="REGISTERED_MOBILE")
	private long registered_mobile;
	@Column(name="FIRST_NAME")
	private String fname;
	@Column(name="LAST_NAME")
	private String lname;
	
	@OneToMany(mappedBy="subscriber_ID")
	private List<Subscription_Channel> sub;
	
	public int getSubscriber_ID() {
		return subscriber_ID;
	}
	public void setSubscriber_ID(int subscriber_ID) {
		this.subscriber_ID = subscriber_ID;
	}
	public long getRegistered_mobile() {
		return registered_mobile;
	}
	public void setRegistered_mobile(long registered_mobile) {
		this.registered_mobile = registered_mobile;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Subscription_Channel> getSub() {
		return sub;
	}
	public void setSub(List<Subscription_Channel> sub) {
		this.sub = sub;
	}	
}
