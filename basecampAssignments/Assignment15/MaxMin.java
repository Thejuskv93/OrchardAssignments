package org.mindtree.Assignment.Assignment15;

import java.util.Scanner;

public class MaxMin 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n=in.nextInt();
		System.out.println("Enter "+n+" values");
		int nbr=0,min=0,max=0,num=0;
		nbr=in.nextInt();
		min=nbr;
		max=nbr;
		int sentinel=0;
		for(int i=1;i<n;i++)
			{
				num=in.nextInt();
				if(num!=0)
				{
					if(num<min)
					{
						min=num;
					}
					else if(max<num)
						max=num;
				}
				else
					break;

			}
		
		
		if(n==sentinel || min==sentinel || max==sentinel)
			System.out.println("null");
		if(min>0 && max>0)
		{
			if(n==1)
			{
				System.out.println("minimum"+n);
				System.out.println("maximum"+n);
			}
			else if(n>1)
			{
				System.out.println("minimum"+min);
				System.out.println("minimum"+max);
			}
		}



	}

}
