package org.mindtree.Assignment.ArrayOfObjects;

import java.util.Scanner;

public class CoffeeShop
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of customers");
		int n=in.nextInt();
		Customer c[]=new Customer[n];
		double sum=0,avg=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the  customer "+ (i+1) +" name");
			String name=in.next();
			System.out.println("Enter the  customer "+ (i+1) +" mobile number");
			String mobile=in.next();
			System.out.println("Enter the  customer "+ (i+1) +" feedback");
			double feedback=in.nextDouble();
			c[i]=new Customer(name, mobile, feedback);
			sum+=c[i].getFeedback();
		}
		System.out.println("The average feedback is "+sum/n);
	}

}
