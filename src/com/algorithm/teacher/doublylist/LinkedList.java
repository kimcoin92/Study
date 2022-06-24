package com.algorithm.teacher.doublylist;

import java.util.Arrays;

public class LinkedList
{
	public static void main(String[] args)
	{
		DoubleListContainer lc = new DoubleListContainer();
		
		for (int i = 0; i < 10000; i++)
		{
			lc.InsertNode(i, "node");
		}
		
		System.out.println(lc.getNodeByRecent(20));
		System.out.println(lc.getNodeByRecent(21));
	}
}
