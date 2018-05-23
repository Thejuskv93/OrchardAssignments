package com.mindtree.entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Candidates")
public class CandidatesDTO implements Serializable
{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int id;
	@Column(name="name")
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ConstituencyID")
	ConstituencyDTO cdto;
	
	@Column(name="party")
	private String party;
	
	
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
	
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public ConstituencyDTO getCdto() {
		return cdto;
	}
	public void setCdto(ConstituencyDTO cdto) {
		this.cdto = cdto;
	}
	@Override
	public String toString() {
		return "CandidatesDTO [id=" + id + ", name=" + name + ", cdto=" + cdto + ", party=" + party + "]";
	}


}
