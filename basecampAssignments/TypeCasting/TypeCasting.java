package org.mindtree.Assignment.TypeCasting;

import java.util.Scanner;

public class TypeCasting 
{
		public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the size of 1st array");
			int a=in.nextInt();
			System.out.println("Enter the size of 2nd array");
			int b=in.nextInt();
			double arr1[];
			double arr2[];
			
			if(a<b)
			{
				arr1=new double[a];
				arr2=new double[b];
			}
			else
			{
				arr1=new double[b];
				arr2=new double[a];
			}
			int res[]=new int[arr2.length];
			System.out.println("Enter the 1st array elements");
			for(int i=0;i<arr1.length;i++)
			{
				arr1[i]=in.nextDouble();
			}
			System.out.println("Enter the 2nd array elements");
			for(int j=0;j<arr2.length;j++)
			{
				arr2[j]=in.nextDouble();
			}
			int k=0;
			
			while(k<arr1.length)
			{
				
				res[k]=(int)(arr1[k]+arr2[k]);
				k++;
			}
			for(int p=k;p<arr2.length;p++)
			{
				res[p]=(int)arr2[p];
			}
			for(int s=0;s<res.length;s++)
			{
				System.out.print(res[s]+" ");
			}
		}
}
