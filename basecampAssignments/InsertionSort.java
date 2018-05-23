package com.mindtree.Assignment;

import java.util.Scanner;

public class InsertionSort
{
	static void sort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of aray");
		int n=in.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int l=0;l<n;l++)
		{
			arr[l]=in.nextInt();
		}
		sort(arr);
	}
}
