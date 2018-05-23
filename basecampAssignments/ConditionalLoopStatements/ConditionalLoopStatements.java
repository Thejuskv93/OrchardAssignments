package org.mindtree.Assignment.ConditionalLoopStatements;

import java.util.*;
class ConditionalLoopStatements
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp1=0;
		int temp2=0,count=0;
		while(n>1)
		{
			if(n%2==0)
			{
				temp1=n/2;
				System.out.println(n+" is even so i take half: "+temp1);
				n=temp1;;
				count++;
			}
			else
			{
				temp2=3*n+1;
				System.out.println(n+" is odd so i make 3n+1: "+temp2);
				n=temp2;
				count++;
			}
		}
		System.out.println("There are total "+count+" steps to reach 1");
	}
	
}