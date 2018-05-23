package org.mindtree.Assignment.Assignment13;

import java.util.Scanner;

public class StringCompression 
{
	public static void compressString(String str)
	{
		String st=str.toLowerCase();
		char c[]=st.toCharArray();
		String res="";
		int k=0;
		
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			i=k;
			k=i+1;
			if(i<c.length)
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[k])
					{
						count++;
						k++;
					}
					else
					{
						break;
					}
					
				}
				
				res+=(c[i]+""+count);
			}
			
		}
		if(res.length() < str.length())
		{
			System.out.println(res);
		}
		else
		{
			System.out.println(str);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		sc.close();
		compressString(str);
	}

}
