package com.collection.teacher.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class Index2
{
	public static void main(String[] args)
	{
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(5);
		tree.add(3);
		tree.add(4);
		tree.add(1);
		tree.add(2);
		
		System.out.println("count = " + tree.size());
		
		for (Integer n : tree)
		{
			System.out.println(n);
		}
		
		Iterator<Integer> iter = tree.iterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}