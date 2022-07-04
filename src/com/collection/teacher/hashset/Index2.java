package com.collection.teacher.hashset;

import java.util.HashSet;
import java.util.Iterator;

//import java.util.TreeSet;

public class Index2
{
	public static void main(String[] args)
	{
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(4);
		hash.add(5);
		
		System.out.println("count = " + hash.size());
		
		for (Integer n : hash)
		{
			System.out.println(n);
		}
		
		Iterator<Integer> iter = hash.iterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}