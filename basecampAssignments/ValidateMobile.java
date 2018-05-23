package org.mindtree.Assignment;

import java.util.Scanner;

public class ValidateMobile
{
	static String validateMobileNo(String str1)
	{
		
		try {
			if(str1.equals(""))
				throw new NullPointerException();
			if(str1.length()!=10)
			{
				return "false:Invalid mobile number";
			}
			for(int i=0;i<str1.length();i++)
			{
				if(Character.isDigit(str1.charAt(i)))
				{
					continue;
				}
				else
				{
					return "false:Invalid mobile number";
				}
				
			}
			if(str1.charAt(0)!='9')
			{
				return "false:invalid moble number";
			}
			return "true:valid mobile number";
		} catch (NullPointerException e) 
		{
			return "No value entered";
		}
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String mob=in.nextLine();
		String res=validateMobileNo(mob);
		System.out.println(res);
	}

}
