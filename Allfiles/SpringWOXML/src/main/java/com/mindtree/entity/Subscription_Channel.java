package com.mindtree.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Subscription_Channel")
public class Subscription_Channel
{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="Id")
	private int id;
	@Column(name="Subscription_date")
	private Date subsc_date;
	
	@ManyToOne
	@JoinColumn(name="Channel_ID")
	private Channels channel;
	
	@ManyToOne
	@JoinColumn(name="Subscriber_ID")
	private Customers subscriber_ID;
	
	
	public Customers getSubscriber_ID() {
		return subscriber_ID;
	}
	public void setSubscriber_ID(Customers subscriber_ID) {
		this.subscriber_ID = subscriber_ID;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getSubsc_date() {
		return subsc_date;
	}
	public void setSubsc_date(Date subsc_date) {
		this.subsc_date = subsc_date;
	}
	public Channels getChannel() {
		return channel;
	}
	public void setChannel(Channels channel) {
		this.channel = channel;
	}

}
