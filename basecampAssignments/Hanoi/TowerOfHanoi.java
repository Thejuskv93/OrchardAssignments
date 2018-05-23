package org.mindtree.Assignment.Hanoi;

import java.util.Scanner;

public class TowerOfHanoi 
{
	public void solve(int n,String beg,String mid,String end)
	{
		if(n==1)
		{
			System.out.println(beg+" --> "+end);
		}
		else
		{
			solve(n-1,beg,end,mid);
			System.out.println(beg+" --> "+end);
			solve(n-1,mid,beg,end);
		}
	}
	public static void main(String args[])
	{
		TowerOfHanoi toh=new TowerOfHanoi();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of disks");
		int disks=in.nextInt();
		toh.solve(disks, "A", "B", "C");
	}
}
