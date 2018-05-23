package org.mindtree.Assignment.Asignment11;

import java.util.Scanner;

public class ConditionalLoop
{
	public static void printTriplets(int[] data)
	{
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				int sum=data[i]+data[j];
				for(int k=0;k<data.length;k++)
				{
					if(sum==data[k])
					{
						System.out.println("<"+data[i]+","+data[j]+","+data[k]+">");
					}
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		printTriplets(arr);
		in.close();
	}
}
