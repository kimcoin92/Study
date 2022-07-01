package com.collection.teacher.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Index
{
	public static void main(String[] args)
	{
		boolean res;
		
		Set<IntValue> hset = new HashSet<>();
		
		res = hset.add(new IntValue(1));
		res = hset.add(new IntValue(2));
		res = hset.add(new IntValue(3));
		
		// false
		res = hset.add(new IntValue(3));
		res = hset.add(new IntValue(4));
		res = hset.add(new IntValue(5));
		
		// false
		res = hset.add(new IntValue(5)); 
		
		System.out.printf("hset : %d개%n", hset.size());
		
		Iterator<IntValue> iter = hset.iterator();
		
		IntValue ival;
		
		while (iter.hasNext())
		{
			ival = iter.next();
			
			System.out.println(ival);
		}
	}
}