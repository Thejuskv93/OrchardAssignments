package org.mindtree.Assignment.Array;

import java.util.*;
public class Array
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int N=in.nextInt();
		System.out.println("Enter "+N+" values ");
		int arr[]=new int[N];
		
		for(int l=0;l<N;l++)
		{
			arr[l]=in.nextInt();
		}
		
		
		
			for(int i=0;i<N;i++)
			{
				boolean flag=true;
				for(int j=i;j<N;j++)
				{
					if(j+1<arr.length)
					{
						
						if(arr[j]>arr[j+1])
						{
							flag=false;
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
					if(flag==true)
					{
						break;
					}
					
				}
				
			}			
			
		
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
	}
}