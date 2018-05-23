package org.mindtree.Assignment.StringHandling;

import java.util.Scanner;

public class StringHandling 
{

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the USN ");
		String USN=in.next();
		in.close();
		//String result="Failure";
		int count=0;
		int len=USN.length();
		if(len==10)
		{
			count++;
			char c=USN.charAt(0);
			boolean isDigit = (c >= '1' && c <= '2');
			if(isDigit!=false)
			{
				count++;
			}
			char c2=USN.charAt(1);
			char c3=USN.charAt(2);
			if(Character.isUpperCase(c2) && Character.isUpperCase(c3))
			{
				count++;
			}
			char c4=USN.charAt(3);
			char c5=USN.charAt(4);
			boolean isDigit4=(c4>= 0 && c4 <= 9);
			boolean isDigit5 = (c5 >= '0' && c5 <='9');
			if(isDigit4!=false && isDigit5!=false)
			{
				count++;
			}
			if(USN.substring(5,7).equals("CS") || USN.substring(5,7).equals("IS")||USN.substring(5,7).equals("EC")||USN.substring(5,7).equals("ME"))
			{
				count++;
			}
			char c8=USN.charAt(7);
			char c9=USN.charAt(8);
			char c10=USN.charAt(9);
			boolean isDigit8=(c8>= '0' && c8 <= '9');
			boolean isDigit9 = (c9 >= '0' && c9 <='9');
			boolean isDigit10 = (c10 >= '0' && c10 <='9');
			if(isDigit8!=false && isDigit9!=false && isDigit10!=false)
			{
				count++;
			}
			if(count!=6)
			{
				System.out.println("Failure");
			}
			else
			{
				System.out.println("Success");
			}
		}
		
	}

}
