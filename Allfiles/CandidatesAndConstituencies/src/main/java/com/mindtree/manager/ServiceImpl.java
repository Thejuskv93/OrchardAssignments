package com.mindtree.manager;

import java.util.List;

import com.mindtree.DAO.DaoImpl;
import com.mindtree.DAO.DaoInf;

public class ServiceImpl implements ServiceInf
{
	DaoInf dinf=new DaoImpl();
	public void saveData(List<Object> list)
	{
		dinf.saveData(list);
	}
	public void displayCandidateOnId(int id)
	{
		dinf.displayCandidateOnId(id);
	}
	public void displayCandidateOnParty(String party)
	{
		dinf.displayCandidateOnParty(party);
	}
	public List<String> returnCandidates(String cons)
	{
		return dinf.returnCandidates(cons);
		
	}
	public void displayCandidateOnMultiple(String partyName,String constituency)
	{
		dinf.displayCandidateOnMultiple(partyName, constituency);
	}

}
