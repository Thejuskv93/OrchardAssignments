package com.mindtree.manager;

import java.util.List;

public interface ServiceInf 
{
	public void saveData(List<Object> list);
	public void displayCandidateOnId(int id);
	public void displayCandidateOnParty(String party);
	public List<String> returnCandidates(String cons);
	public void displayCandidateOnMultiple(String partyName,String constituency);
}
