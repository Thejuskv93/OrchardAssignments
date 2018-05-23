package org.mindtree.Assignment.throwandthrows;

import java.sql.SQLException;

public class Account 
{
	public static Account createAccount() throws SQLException
	{
		Account account1=null;
		try {
			Class class1=Class.forName("bank.Account");
			
			if(class1==null)
				throw new ClassNotFoundException();
			account1=(Account)class1.newInstance();
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not present");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return account1;
	}
	public static void main(String args[])
	{
			Account acc=null;
			try {
				acc = createAccount();
			} catch (SQLException  e) {
				e.printStackTrace();
			}
			System.out.println(acc);
		
	}
}
