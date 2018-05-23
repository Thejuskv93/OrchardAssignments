package com.mindtree.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Constituency")
public class ConstituencyDTO implements Serializable
{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="cdto")
	private List<CandidatesDTO> alist=new ArrayList<CandidatesDTO>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CandidatesDTO> getAlist() {
		return alist;
	}
	public void setAlist(ArrayList<CandidatesDTO> alist) {
		this.alist = alist;
	}
	@Override
	public String toString() {
		return "ConstituencyDTO [id=" + id + ", name=" + name + ", alist=" + alist + "]";
	}
	
}
