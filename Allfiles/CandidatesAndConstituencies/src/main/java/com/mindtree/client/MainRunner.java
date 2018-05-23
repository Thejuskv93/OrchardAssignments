package com.mindtree.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;

import com.mindtree.DAO.DaoImpl;
import com.mindtree.entity.CandidatesDTO;
import com.mindtree.entity.ConstituencyDTO;
import com.mindtree.manager.ServiceImpl;
import com.mindtree.manager.ServiceInf;

public class MainRunner 
{
	@SuppressWarnings("rawtypes")
	public static void main( String[] args )
	{

		Scanner in=new Scanner(System.in);
		ServiceInf sinf=new ServiceImpl();
		DaoImpl dimpl=new DaoImpl(); 
		List<Object> list=new ArrayList<Object>();
		String ch="";
		ConstituencyDTO codto1=new ConstituencyDTO();
		ConstituencyDTO codto2=new ConstituencyDTO();
		ConstituencyDTO codto3=new ConstituencyDTO();
		ConstituencyDTO codto4=new ConstituencyDTO();
		ConstituencyDTO codto5=new ConstituencyDTO();
		ConstituencyDTO codto6=new ConstituencyDTO();

		codto1.setName("Jayanagar");
		codto2.setName("VijayNagar");
		codto3.setName("Basavangudi");
		codto4.setName("PadmanabaNagar");
		codto5.setName("BTMLayout");
		codto6.setName("Ramnagar");

		CandidatesDTO cdto1=new CandidatesDTO();
		cdto1.setName("HariPrasad");
		cdto1.setParty("Congress");
		cdto1.setCdto(codto1);
		codto1.getAlist().add(cdto1);
		dimpl.saveCons(codto1);
		
		

		CandidatesDTO cdto2=new CandidatesDTO();
		cdto2.setName("JSharif");
		cdto2.setParty("Congress");
		cdto2.setCdto(codto2);
		codto2.getAlist().add(cdto2);
		dimpl.saveCons(codto2);
		

		CandidatesDTO cdto3=new CandidatesDTO();
		cdto3.setName("Francis");
		cdto3.setParty("Congress");
		cdto3.setCdto(codto3);
		codto3.getAlist().add(cdto3);
		dimpl.saveCons(codto3);
		

		CandidatesDTO cdto4=new CandidatesDTO();
		cdto4.setName("AnanthKumar");
		cdto4.setParty("BJP");
		cdto4.setCdto(codto1);
		codto1.getAlist().add(cdto4);
		dimpl.saveCons(codto1);
		

		CandidatesDTO cdto5=new CandidatesDTO();
		cdto5.setName("ShivKumar");
		cdto5.setParty("JDS");
		cdto5.setCdto(codto1);
		codto1.getAlist().add(cdto5);
		dimpl.saveCons(codto1);
		

		CandidatesDTO cdto6=new CandidatesDTO();

		cdto6.setName("Adarsh");
		cdto6.setParty("Congress");
		cdto6.setCdto(codto2);
		codto2.getAlist().add(cdto6);
		dimpl.saveCons(codto2);
		

		CandidatesDTO cdto7=new CandidatesDTO();

		cdto7.setName("Ashok");
		cdto7.setParty("BJP");
		cdto7.setCdto(codto3);
		codto3.getAlist().add(cdto7);
		dimpl.saveCons(codto3);
		

		CandidatesDTO cdto8=new CandidatesDTO();
		cdto8.setName("RNaidu");
		cdto8.setParty("TDP");
		cdto8.setCdto(codto4);
		codto4.getAlist().add(cdto8);
		dimpl.saveCons(codto4);
		

		CandidatesDTO cdto9=new CandidatesDTO();
		cdto9.setName("RamaSwamy");
		cdto9.setParty("CPM");
		cdto9.setCdto(codto5);
		codto5.getAlist().add(cdto9);
		dimpl.saveCons(codto5);
		dimpl.saveCons(codto6);


/*
		list.add(codto1);
		list.add(codto2);
		list.add(codto3);
		list.add(codto4);
		list.add(codto5);
		list.add(codto6);*/

		int c;
		do {
			System.out.println("1.Insert the data");
			System.out.println("2.Display Candidate Name,party for an Cons_ID");
			System.out.println("3.Display Candidate name,constituency for given party");
			System.out.println("4.Return set of candidates from given constituency");
			System.out.println("5.Display the candidate name for given party and cons_name");
			System.out.println("6.Exit");
			System.out.println("Enter your Choice");
			c=in.nextInt();
			switch (c) {
			case 1:sinf.saveData(list);
			break;
			case 2:System.out.println("Enter candidate Id to search");
					int cid=in.nextInt();
					sinf.displayCandidateOnId(cid);
			break;
			case 3:System.out.println("Enter the party");
				String party=in.next();
				sinf.displayCandidateOnParty(party);
			break;
			case 4:System.out.println("Enter constituency name");
					String cons=in.next();
					List<String> clist=sinf.returnCandidates(cons);
					System.out.println("-------------------------------");
					for (Iterator iterator = clist.iterator(); iterator.hasNext();) {
						String string = (String) iterator.next();
						System.out.println(string);
					}
					System.out.println("-------------------------------");
			break;
			case 5:System.out.println("Enter party name");
					String partyName=in.next();
					System.out.println("Enter constituency name");
					String constituency=in.next();
					sinf.displayCandidateOnMultiple(partyName,constituency);
			break;
			case 6:System.out.println("...You have exited successfully...");
			break;

			default:
				break;
			}
		} while (c!=6);

	}

}
